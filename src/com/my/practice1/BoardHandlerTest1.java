package com.my.practice1;
import java.util.Date;
import java.util.Scanner;

public class BoardHandlerTest1 {

  static class Board{//한 개의 게시글을 담을 복합 변수 설계
    String title;
    String content;
    String password;
    int viewCount;
    Date createdDate;
  }
  //게시판 구분하기 위해 게시판 이름을 저장할 인스턴스 변수를 준비
  String boardName;

  Scanner keyScan;//static뺐음 ->인스턴스 변수
  //다른 메인에서 사용할 때 인스턴스 만든 후 사용 가능!
  //BoardHandler에서 사용할 ArrayList 인스턴스를 준비
  ArrayListTest1 boardList = new ArrayListTest1();
  //ArrayList 같은 메쏘드를 사용
  //단 boardList를 활용해서
  //아래에서 boardList를 활용

  //생성자 만들기
  BoardHandlerTest1(String boardName, Scanner keyScan){
    this.boardName = boardName;
    this.keyScan = keyScan;
  }

  public void execute() {
    loop: while (true) {
      System.out.print(this.boardName + "/게시글 관리>");
      String command = keyScan.nextLine();

      switch (command) {
        case "list": this.list(); break;
        case "add": this.add(); break;
        case "update": this.update(); break;
        case "delete": this.delete(); break;
        case "view": this.view(); break;
        case "back":
          break loop;
        default:
          System.out.println("지원하지 않는 명령입니다.");
      }
      System.out.println("");


    }
  }

  void list() {
    System.out.println("게시물 목록");

    Object[] arr = this.boardList.toArray();
    int i = 0;
    for(Object item : arr) {
      Board board = (Board) item;
      System.out.printf("%d, %s, %s, %d\n",
          i++, 
          board.title,
          String.format("%1$tY-%1$tm-%1$td", board.createdDate),
          board.viewCount);
    }

  }

  void add() {
    System.out.println("게시글 등록");

    if(this.boardList.size == ArrayListTest1.MAX_LENGTH) {
      System.out.println("더이상 게시글을 추가할 수 없습니다.");
      return;
    }

    Board board = new Board();

    System.out.println("제목 : ");
    board.title = this.keyScan.nextLine();

    System.out.println("내용 : ");
    board.content = this.keyScan.nextLine();

    System.out.println("비밀번호 : ");
    board.password = this.keyScan.nextLine();

    board.createdDate = new Date();

    System.out.println(boardList.size);
    boardList.append(board);
    /* void append(Object obj){
     * this.list[this.size++] = obj;    
     * }
     */
    System.out.println(boardList.size);
    System.out.println("게시글을 등록했습니다.");

  }

  void update() {
    System.out.println("게시글 변경");
    System.out.println("번호?");
    int index = Integer.parseInt(this.keyScan.nextLine());
    if(index < 0 || index >= boardList.size) {
      System.out.println("무효한 게시글 번호입니다.");
      return;
    }

    Board board = (Board) this.boardList.retrieve(index);

    System.out.printf("제목(%s)?", board.title);
    String title=this.keyScan.nextLine();

    System.out.printf("내용(%s)?", board.content);
    String content=this.keyScan.nextLine();

    if(!this.keyScan.nextLine().equals("y")) {//문자열은 ==로 안됨,,, 스트링은 .equals로만됨
      System.out.println("게시글 변경을 취소하였습니다.");
      return;
    }

    board.title = title;
    board.content = content;
    System.out.println("게시글을 변경하였습니다.");

  }

  void delete() {
    System.out.println("게시글 삭제");
    System.out.println("번호?");
    int index = Integer.parseInt(this.keyScan.nextLine());
    if (index < 0 || index >= this.boardList.size) {
      System.out.println("무효한 게시글 번호입니다.");
      return;
    }

    System.out.println("정말 삭제 하시겠습니까?(y/N)");
    if(!this.keyScan.nextLine().equals("y")) {
      System.out.println("게시글 삭제를 취소하였습니다.");
      return;
    }

    this.boardList.remove(index);
    System.out.println("게시글을 삭제 하였습니다.");

  }

  void view() {
    System.out.println("[게시글 조회]");
    System.out.println("번호?");

    int index = Integer.parseInt(this.keyScan.nextLine());

    if (index < 0 || index >= this.boardList.size) {//boardList에 있는 size 변수
      System.out.println("무효한 게시글 번호입니다.");
      return;
    }

    Board board = (Board) this.boardList.retrieve(index);
    //Board board = (Board) ArrayList.retrieve(boardList, index);//boardList에 가서 .. index값꺼내라
    //retrieve 는 object를 반환하지만(Board)로형변환표시

    board.viewCount++;

    System.out.printf("제목 :%s\n", board.title);
    System.out.printf("내용 :%s\n", board.content);
    System.out.printf("조회수 :%d\n", board.viewCount);
    System.out.printf("등록일 : %1$tY-%1$tm-%1$td, %1$tH:%1$tM:%1$tS\n", board.createdDate);
  }

}






