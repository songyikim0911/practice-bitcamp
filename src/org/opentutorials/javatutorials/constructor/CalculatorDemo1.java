package org.opentutorials.javatutorials.constructor;

class Calculator{
  int left, right;

  //클래스가 생성될떄 어떤 메소드보다도,
  //클래스 이름과 같은 생성자 메소드가 제일먼저 우선순위로 실행된다는것!
  //이 객체가 가장 먼저 해야하는, 초기화 일을 이 생성자가 해주는것임.
  //이러한 생성자가없다면?
  //자바는 자동으로, caculator라는 이름의 생성자를 내부적으로 생성한것이고,


  public Calculator(int left, int right) {//생성자!!! constructor
    //인스턴스에 값을 따로넣어주는 set메소드를 쓸 필요없이
    //이러한 생성자로, 인스턴스를 생성할떄 값을 바로 넣어줄 수 있다.


    //클래스 이름과 똑같은 이름의 메소드!!
    //그리고 그 메소드이름에 어떤 값을 파라미터로 받을지 적어줘야하고!
    //아래에는 이 파라미터들로 무엇을 하는지 기재해주면됨
    this.left = left;
    this.right = right;
  }

  public void sum() {
    System.out.println(this.left + this.right);
  }

  public void avg() {
    System.out.println((this.left + this.right) / 2);
  }

}

public class CalculatorDemo1 {

  public static void main(String[] args) {

    Calculator c1 = new Calculator(10, 20);
    //여기서 new Calculator(10,20)은 생성자다. 
    //사실 Calculator(10,20)은 calculator 생성자 메소드를 호출하는거고
    //그 안에 매개인자로 10,20을넣어준다.
    //인스턴스를 생성하는 생성자! 라는 의미에서 생성자임

    //여기서 new Calculator(!0,20)을 생성자라고 생각하면되고
    //이 생성자를 통해 c1이라는 인스턴스를 생성한거다.
    c1.sum();
    c1.avg();

    Calculator c2 = new Calculator(20, 40);
    c2.sum();
    c2.avg();
  }

}
