package org.opentutorials.javatutorials.Inheritance.example1;

class Calculator{
  int left, right;

  public void setOprands(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public void sum() {
    System.out.println(this.left + this.right);
  }

  public void avg() {
    System.out.println((this.left + this.right)/2);
  }
}

class SubstractionableCalculator extends Calculator {

  public void substract() {
    System.out.println(this.left - this.right);
    //상속받은 calculator에 있던 변수인 left와 right를 내것처럼사용함. 
  }



}
//현재, Calculator는 부모
//S.C는 부모를 상속, 또는 확장(extends) 한다고 표현가능
// C
// ↑
// S.C 클래스 다이어그램은 이렇게 표시한다.


public class CalculatorDemo1{
  public static void main(String[] args) {

    SubstractionableCalculator c1 = new SubstractionableCalculator();
    c1.setOprands(10, 20);
    c1.sum();//부모인 calculator가 가진 메쏘드들도 호출가능
    c1.avg();//이 메쏘드도 상속받은메쏘드..
    c1.substract();//얘만 본인이 만든 메쏘드였음..

  }
}
