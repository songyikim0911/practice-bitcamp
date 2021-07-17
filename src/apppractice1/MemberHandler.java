package apppractice1;
import java.util.Date;
import java.util.Scanner;


public class MemberHandler implements Handler{

  static class Member{
    String name;
    String email;
    String password;
    boolean working;
    Date registeredDate;
  }

  String memberGroupName;
  Scanner keyScan;
  ArrayList memberList = new ArrayList();

  MemberHandler(Scanner keyScan){
    this.keyScan = keyScan;
    this.memberGroupName = "일반회원";
  }

  MemberHandler(String memberGroupName, Scanner keyScan){
    this.keyScan = keyScan;
    this.memberGroupName =memberGroupName ;
  }

  public void execute() {

    loop: while (true) {
      System.out.println(memberGroupName+ "/회원 관리>");
      String command = keyScan.nextLine();

      switch (command) {
        case "list": list(); break;
        case "add": add(); break;
        case "update": update(); break;
        case "view": view(); break;
        case "back":
          break loop;
        default:
          System.out.println("지원하지 않는 명령입니다.");
      }
      System.out.println("");
    }
  }

  void add() {
    System.out.println("[회원 등록]");
    if(memberList.size == ArrayList.MAX_LENGTH) {
      System.out.println("더이상 회원을 추가할 수 없습니다.");
      return;
    }

    Member member = new Member();


    System.out.print("이름:");
    member.name = keyScan.nextLine();

    System.out.print("이메일 : ");
    member.email = keyScan.nextLine();

    System.out.print("비밀번호 : ");
    member.password = keyScan.nextLine();

    System.out.println("재직여부 : y/N");
    if(keyScan.nextLine().equals("y")) {
      member.working = true;
    }else {
      member.working = false;
    }

    member.registeredDate = new Date();
    memberList.append(member);

    System.out.println("회원을 등록했습니다.");


  }
  void list() {

    System.out.println("[회원 목록]");

    Object[] arr = memberList.toArray();

    for(int i = 0; i< arr.length; i++) {//처음(0)부터 끝까지 사용할땐 이 문법이편함
      Member member = (Member) arr[i];
      //형변환전 앞에는 Object클래스이므로, board로 사용하려면 item 을 board로 형변환 해주고 사용!
      System.out.printf("%d, %s, %s, %b\n",
          i, 
          member.name,
          String.format("%1$tY-%1$tm-%1$td", member.registeredDate),
          member.working);

    }
  }


  void view() {
    System.out.println("[회원 조회]");
    System.out.print("번호?");

    int index = Integer.parseInt(keyScan.nextLine());

    if (index < 0 || index >= memberList.size) {
      System.out.println("무효한 회원 번호입니다.");
      return;
    }

    Member member = (Member) memberList.retrieve(index);

    System.out.printf("이름 :%s\n", member.name);
    System.out.printf("이메일 :%s\n", member.email);
    System.out.printf("등록일 : %1$tY-%1$tm-%1$td\n", member.registeredDate);
    System.out.printf("재직중: %s\n", member.working ? "예" : "아니오");
  }

  void update() {
    System.out.println("[회원 변경]");

    System.out.println("번호?");

    int index = Integer.parseInt(keyScan.nextLine());

    if (index < 0 || index >= memberList.size) {
      System.out.println("무효한 회원 번호입니다.");
      return;
    }

    Member member = (Member) memberList.retrieve(index);

    System.out.printf("이름(%s)?", member.name);
    String name=keyScan.nextLine();

    System.out.printf("이메일(%s)?", member.email);
    String email=keyScan.nextLine();

    System.out.print("암호?");
    String password=keyScan.nextLine();

    System.out.printf("재직중(%s)? (y/N)", member.working ? "예" : "아니오");
    boolean working = false;

    if (keyScan.nextLine().equals("y")) {
      working = true;
    }

    System.out.print("정말 변경 하시겠습니까?(y/N)");


    if(!keyScan.nextLine().equals("y")) {//문자열은 ==로 안됨,,, 스트링은 .equals로만됨
      System.out.println("회원 변경을 취소하였습니다.");
      return;
    }

    member.name = name;
    member.email = email;
    member.password = password;
    member.working = working;


    System.out.println("회원을 변경하였습니다.");
  }



  void delete() {
    System.out.println("[회원 삭제]");

    System.out.println("번호?");

    int index = Integer.parseInt(keyScan.nextLine());

    if (index < 0 || index >= memberList.size) {
      System.out.println("무효한 게시글 번호입니다.");
      return;
    }

    System.out.print("정말 삭제 하시겠습니까? (y/N) ");
    if (!keyScan.nextLine().equals("y")) {
      System.out.println("게시글 삭제를 취소하였습니다.");
      return;
    }


    memberList.remove(index);

    System.out.println("회원을 삭제하였습니다.");


  }

}
