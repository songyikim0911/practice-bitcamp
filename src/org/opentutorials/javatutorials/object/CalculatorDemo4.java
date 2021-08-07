package org.opentutorials.javatutorials.object;

class Calculator {


  int left, right;

  public void setOprands(int left, int right) {
    this.left=left;
    this.right=right;
  }

  public void sum() {//static메소드 즉 클래스 소속의 메소드임
    System.out.println(this.left+this.right);//클래스에 직접 접근해서 사용할 수 있는메소드임

  }

  public void avg() {
    System.out.println((this.left+this.right)/2);
  }

}


public class CalculatorDemo4{


  public static void main(String[] args) {

    Calculator c1 = new Calculator();
    c1.setOprands(10, 20);
    c1.sum();
    c1.avg();

    Calculator c2 = new Calculator();
    c2.setOprands(20, 40);
    c2.sum();
    c2.avg();


  }


}
