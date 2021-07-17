package com.my.practice2;

public class Cinema extends CinemaHandler {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    System.out.println("\t\t\t  C I N E M A ");
    System.out.println("\t\t\t 영화 예매 시스템");
    System.out.println();
    Cinema a = new Cinema();
    try {

      a.arrayList();
      a.dbConnect();

      loop:while(true) {

        System.out.println("[1.회원가입]    [2. 예매]    [3. 전체 예매 현황]    [4.회원목록 조회]");
        String sel = "9";
        sel = sc.nextLine();

        switch(sel) {

          case "1":
            a.join(); 
            break;
          case "2":
            a.getTitle();
            a.getDate();
            a.getTime();
            a.getSeat();
            a.pay(); 
            break;
          case "3": a.dbSelect(); break;
          case "4": a.jselect(); break;
          case "9": System.out.println();
          System.out.println("영화 예매 프로그램 종료하겠습니다."); break loop;
          default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. \n");continue;
        }

      }
    }catch (Exception e) {     }
  }

}
