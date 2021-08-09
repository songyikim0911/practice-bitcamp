package org.opentutorials.javatutorials.abstractclass.example1;


//추상 클래스는 상속을 강제하기 위한 것이다.
//즉 부모 클래스에는 메소드의 시그니처만 정의해놓고 그 메소드의 실제 동작 방법은
//이 메소드를 상속 받은 하위 클래스의 책임으로 위임하고 있다.


abstract class A{//추상 메소드를 가진 클래스는, 멤버중 단 하나라도 abstract이면,
  //클래스도 반드시 abstract 클래스가 된다!


  public abstract int b();//추상 메소드는 구체적인 로직을 가지고 있지않고, 시그니처만 가지고있다.
  //구현의 책임은 사용하는 쪽으로 넘긴다.

  //본체가 있는 메소드는 abstract키워드를 가질 수 없다.
  //public abstract int c(){System.out.println("Hello")}<- 에러!


  //추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재할 수 있다.
  public void d() {
    System.out.println("world");
  }
}

class B extends A{
  //추상 클래스를 상속하여 사용하기 위해서는
  //반드시 추상 메소드를 오버라이딩(재정의)해서 사용해야한다.
  //추상 메소드를 반드시 구체적으로 본체를 정의해서 써야한다.
  public int b() {
    return 1;
  }

}

public class AbstractDemo {

  public static void main(String[] args) {

    //A obj = new A();
    B obj = new B();
    System.out.println(obj);
  }


  //디자인 패턴
  /*
   * 로직의방법,로직의 구성..공통적인 로직의패턴..
   * 
   * 
   * 
   */

}
