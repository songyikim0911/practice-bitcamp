package org.opentutorials.javatutorials.object;

class Calculator3 {



  static double PI = 3.14;//클래스의 변수!! 그래 static! 모든 인스턴스가 같은값을!
  //PI는 모든 객체(인스턴스)가 같은 값을 갖기때문에, 클래스의 변수




  public static void sum(int left, int right) {//static메소드 즉 클래스 소속의 메소드임
    System.out.println(left+right);//클래스에 직접 접근해서 사용할 수 있는메소드임

  }

  public static void avg(int left, int right) {
    System.out.println((left+right)/2);
  }

}

public class CalculatorDemo33{



  public static void main(String[] args) {

    Calculator3.sum(10,20);//30 
    Calculator3.avg(10,20);//15
    //인스턴스가 존재하지않고 지금, 클래스 메소드를 사용한상태다
    //인자만 넣어서 써도 되는경우는 간단하게 이런 클래스메소드를 사용하면됨.
    //인스턴스를 생성할 필요가 없기 때문이다.



  }


}
