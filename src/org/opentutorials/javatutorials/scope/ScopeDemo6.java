package org.opentutorials.javatutorials.scope;

public class ScopeDemo6 {

  /*정적인 유효범위 static(lexical) scope와 동적인 유효범위 dynamic scope*/
  //정적인 유효범위.. b라는 메서드의 유효범위 - 자기자신 또는 전역.
  //즉 고정적인 유효범위를 가짐


  //근데 만약 b를 호출했는데 b를 호출한 a의 지역변수를 사용한다?
  //이것은 동적인 유효범위 형태의 프로그래밍 스타일임

  static int i = 5;

  static void a() {
    int i = 10;
    System.out.println(i);//10
    b();//5!<- 얘는 b메소드의 유효범위를 따라서 실행되기떄문에
    //b메소드 내에 있는 변수 또는, 클래스(전역)변수에 있는 값만씀.
    //a꺼는 안쓴다.
  }

  static void b() {
    System.out.println(i);//전역변수를 사용함! 5
    //i는 b의 유효범위를 쓰고있고, b라는 메소드에서 쓰는 유효범위는
    //전역 변수를 사용하기 때문에, 전역변수인 5...
  }

  public static void main(String[] args) {

    a();

  }

}
