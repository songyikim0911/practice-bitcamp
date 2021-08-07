package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {


  static int i;
  //전역변수로 선언
  //모든 곳에서 유효한 변수가되는거임.


  static void a() {
    i = 0 ;//선언없이 할당만가능...


  }


  public static void main(String[] args) {
    // TODO Auto-generated method stub

    for ( i = 0; i < 5 ;i++) {
      a();//i를 선언없이 할당만함
      System.out.println(i);
    }

  }

}
