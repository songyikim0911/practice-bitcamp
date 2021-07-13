package com.my.practice1;
import java.util.Scanner;

public class AppTest1 {

  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    BoardHandler boardHandler = new BoardHandler("게시판1", keyScan);
    BoardHandler boardHandler2 = new BoardHandler("게시판2", keyScan);
    BoardHandler boardHandler3 = new BoardHandler("게시판3", keyScan);

    menuLoop: while (true) {
      System.out.println("메뉴");
      System.out.println("1:게시판 관리 1");
      System.out.println("2:게시판 관리 2");
      System.out.println("3:게시판 관리 3");
      System.out.println("메뉴를 선택하시오. (종료:quit)[1..3]");
      String menuNo = keyScan.nextLine();


      switch (menuNo) {
        case "1":
          boardHandler.execute();
          break;
        case "2":
          boardHandler2.execute();
          break;
        case"3":
          boardHandler3.execute();
          break;
        case "quit":
          break menuLoop;
        default:
          System.out.println("메뉴 번호가 옳지 않습니다.");
      }
      System.out.println();

    }

    keyScan.close();
    System.out.println("안녕히 가세요!");

  }
}
