package org.opentutorials.javatutorials.scope;

//즉 유효범위란
//변수를 전역변수,지역변수로 나눠서 좀 더 관리하기 편리하도록 하는 것!
//절차지향프로그래밍에서는 전역변수의 사용을 금기시하고있음...

class C{
  int v = 10;//전역변수

  void m() {
    int v = 20;//지역변수...새로만들어진것
    System.out.println(v);//20, 지역변수가 우선순위가 더높다.걍v는 지역변수v
    System.out.println(this.v);//10,this는  인스턴스 변수를 가리킴
    //여기서 this.v는 c1 (인스턴스)의 변수임.이 클래스내에서는 전역변수...
  }

}

public class ScopeDemo7 {

  public static void main(String[] args) {
    C c1 = new C();
    c1.m();

  }

}
