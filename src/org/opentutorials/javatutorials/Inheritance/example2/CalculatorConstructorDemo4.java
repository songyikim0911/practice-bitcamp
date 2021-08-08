package org.opentutorials.javatutorials.Inheritance.example2;

class Calculator{
  int left, right;

  public Calculator() {}

  public Calculator(int left, int right) {
    this.left = left;
    this.right = right;
  }

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
  //현재 부모 클래스와 하위클래스가 같은 생성자?? --이것은 중복!!!!!!!!
  //하위 클래스 생성자가 생성될때, 상위클래스의 생성자도 만들어주면 해결된다.
  //이래서 아래의방법 사용.
  public SubstractionableCalculator (int left, int right) {
    //생성자간의 문제가 생길때!
    //super클래스를 먼저 초기화가 끝나야(상위 클래스가 먼저되야) 그다음 하위클래스 초기화를 할수 있다는것 기억!
    super(left, right);//super는 부모를 의미함.
    //부모 생성자에게 값을 주는 메소드를 만들어주면됨.
    //일단 슈퍼클래스를 호출한다음에, 
  }

  public void substract() {
    System.out.println(this.left + this.right);
  }


}


public class CalculatorConstructorDemo4{
  public static void main(String[] args) {

    SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);

    c1.sum();//부모인 calculator가 가진 메쏘드들도 호출가능
    c1.avg();//이 메쏘드도 상속받은메쏘드..
    c1.substract();//얘만 본인이 만든 메쏘드였음..

  }
}
