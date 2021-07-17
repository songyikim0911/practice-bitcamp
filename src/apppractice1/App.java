package apppractice1;
import java.util.Scanner;

public class App {

  static Scanner keyScan = new Scanner (System.in);

  public static void main(String[] args) {

    menuLoop: while(true) {
      System.out.println("게시판 관리 프로그램");
      System.out.println("[메뉴]");
      System.out.println(" 1 : 게시글 관리 ");
      System.out.println(" 2 : 게시글 관리2 ");
      System.out.println(" 3 : 회원 관리 ");
      System.out.println(" 4 : 계산기 ");
      System.out.println("메뉴를 선택하시오. (종료 : quit) [1..4]");
      String menuNo = keyScan.nextLine();

      BoardHandler boardHandler = new BoardHandler("게시판1", keyScan);
      BoardHandler boardHandler2 = new BoardHandler("게시판2", keyScan);
      MemberHandler memberHandler = new MemberHandler(KeyScan);
      ComputeHandler computeHandler = new ComputeHandler(keyScan);

      switch(menuNo) {
        case"1":
          boardHandler.execute();
          break;
        case"2":
          boardHandler2.execute();
          break;
        case"3":
          memberHandler.execute();
          break;
        case "quit":
          break menuLoop;
        default:
          System.out.println("메뉴 번호가 옳지 않습니다.");
      }
      System.out.println("");

    }
    System.out.println("안녕히 가세요 ! ");
    keyScan.close();
  }
}
