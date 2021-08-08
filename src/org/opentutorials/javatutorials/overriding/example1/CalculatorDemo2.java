package org.opentutorials.javatutorials.overriding.example1;

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

  //오버라이딩
  //부모가 가지고 있던 sum을 재정의

  public void sum() {
    System.out.println("실행 결과는 "+(this.left + this.right)+"입니다");
  }


}
//현재, Calculator는 부모
//S.C는 부모를 상속, 또는 확장(extends) 한다고 표현가능
// C
// ↑
// S.C 클래스 다이어그램은 이렇게 표시한다.


public class CalculatorDemo2{
  public static void main(String[] args) {

    SubstractionableCalculator c1 = new SubstractionableCalculator();
    c1.setOprands(10, 20);
    c1.sum();//부모인 calculator가 가진 메쏘드들도 호출가능
    c1.avg();//오버라이드 한 메소드 


  }
}
