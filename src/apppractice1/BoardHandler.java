package apppractice1;

import java.util.Date;
import java.util.Scanner;

public class BoardHandler implements Handler{

  static class Board{
    String title;
    String content;
    String password;
    int viewCount;
    Date createdDate;
  }

  String boardName;
  Scanner keyScan;
  ArrayList boardList = new ArrayList();

  BoardHandler (String boardName, Scanner keyScan){
    this.boardName = boardName;
    this.keyScan = keyScan;
  }

  public void execute(){
    loop: while (true) {
      System.out.println(this.boardName + "\게시글 관리 >");
      String command = keyScan.nextLine();

      switch (command) {
        case "list": this.list(); break;
        case "add" : this.add(); break;
        case "update" : this.update(); break;
        case "delete" : this.delete(); break;
        case "view" : this.view(); break;
        case "back": 
          break loopl
        default:
          System.out.println("지원하지 않는 명령입니다.");
      }
      System.out.println("");
    }
  }

  void list() {
    System.out.println("[게시물 목록]");

    Object[] arr = this.boardList.toArray();

    int i = 0;

    for (Object item : arr ) {
      Board board = (Board) item;
      System.out.printf("%d, %s, %s, %d\n,",
          i++,
          board.title,
          String.format(boardName, "%1$tY-%1$tm-%1$td", board.createdDate),
          board.viewCount);
    }
  }

  void add() {
    System.out.println("[게시글 등록");

    if(this.boardList.size == ArrayList.MAX_LENGTH) {
      System.out.println("더이상 게시글을 추가할 수 없습니다.");
      return;
    }
    Board board = new Board();

    System.out.println("제목:");
    board.title = this.keyScan.nextLine();


  }


}


