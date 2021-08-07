package org.opentutorials.javatutorials.object;

public class CalculatorDemo2 {


  public static void sum(int left, int right) {
    System.out.println(left + right);
  }

  public static void main(String[] args) {
    //아래의 로직이 1000줄 짜리의 복잡한 로직이라고 가정하자.
    sum(10, 20);
    sum(20, 40);
  }

}
