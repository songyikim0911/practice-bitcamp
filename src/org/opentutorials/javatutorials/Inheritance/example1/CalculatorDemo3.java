package org.opentutorials.javatutorials.Inheritance.example1;


class DivisionableCalculator extends  MultiplicationableCalculator {

  public void division() {
    System.out.println(left/right);
  }


}

public class CalculatorDemo3{
  public static void main(String[] args) {

    DivisionableCalculator c1 = new DivisionableCalculator();
    c1.setOprands(10, 20);
    c1.sum();//부모인 calculator가 가진 메쏘드들도 호출가능
    c1.avg();//이 메쏘드도 상속받은메쏘드..
    c1.multiplication();
    c1.division();


  }
}
