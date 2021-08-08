package org.opentutorials.javatutorials.Inheritance.example1;


class MultiplicationableCalculator extends Calculator {

  public void multiplication() {
    System.out.println(this.left*this.right);
  }


}


//현재, Calculator는 부모
//S.C는 부모를 상속, 또는 확장(extends) 한다고 표현가능
// C
// ↑
// S.C 클래스 다이어그램은 이렇게 표시한다.


public class CalculatorDemo2{
  public static void main(String[] args) {

    MultiplicationableCalculator c1 = new MultiplicationableCalculator();
    c1.setOprands(10, 20);
    c1.sum();//부모인 calculator가 가진 메쏘드들도 호출가능
    c1.avg();//이 메쏘드도 상속받은메쏘드..
    c1.multiplication();


  }
}
