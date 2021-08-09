package org.opentutorials.javatutorials.object;

public class Calculator {
  //지금부터 Calculator라는 객체의 설계도를 알려주겠다는의미
  // 객체, 하나의 독립된 프로그램처처럼 바라보면되고 이 객체안에는 변수,메소드가있다.
  //즉 변수,메소드의 집합이 객체이다.
  //객체는 프로그램안의 작은프로그램이라고생각하면된다.

  //calculator 클래스는는 설계도이다.
  //c1,c2라는 객체를 우리가 new Calculator() 로 만들었다. 그리고 이객ㅊ는
  //인스턴스라고 부른다. instance
  //이 설계도에 따라 만들어진 각각의 제품이 c1,c2인것이다.
  //c1제품에는 left는 10, right는 20이라는값이 있고
  //c2제품에는 left는 20, right는 40
  //c1, c2는 같은방식으로 설계되어있지만 상태가 다르기떄문에
  //c1 의 sum,avg와 c2의 sum,avg는 다른값이 나온당.



  /*
   * Calss 소속 변수와, Instance 소속 변수 두가지의 종류!!!
   */
  //class의 멤버인 변수 --> 모든 인스턴스가 똑같은 값을 가진다!
  //인스턴스를 생성하지 않고도, 클래스에 직접 접근해서 그 값을 사용 할 수 있다

  //Instance의 멤버인 변수.
  //인스턴스의 소유 인 변수?

  //인스턴스의 소유가 아닌 변수?
  //인스턴스의 소유가 아니고 , 클래스의 소유인 변수는?
  //클래스 소유의 변수는 인스턴스의 소유인 변수와 다른 성향이다.
  //인스턴스의 소유가 아니고 클래스의 소유인 변수...
  //클래스 변수, 그것이 바로 static인가봄.




  static double PI = 3.14;//클래스의 변수!! 그래 static! 모든 인스턴스가 같은값을!
  //PI는 모든 객체(인스턴스)가 같은 값을 갖기때문에, 클래스의 변수

  int left, right;//인스턴스의 변수 ...인스턴스 마다 다른 값을 가진다!!!

  static int base = 0 ;//클래스 변수 예시!

  public void setOperands(int left, int right){
    this.left = left;//이 인스턴스의 left변수안에 매개변수로받은 left값을넣겠다.
    //this.left는, 이 객체(인스턴스... c1 또는 c2) 의 left 변수를 얘기한다.
    //this는 인스턴스 그 자체를 가리키는것임.
    //즉 인스턴스 마다 서로 다른 변수값을 가진다는것도 인지해야한다.
    this.right = right;

  }

  public void sum() {//객체 마다 다른 변수값을 가지고 있어서,, 
    System.out.println(this.left + this.right + base);
    //setOprands를 통해 설정한 객체의 left와 right를 가져온것임.
  }

  public void avg() {
    System.out.println((this.left * this.right)/2);
  }



  public static void main(String[] args) {

    Calculator c1 = new Calculator();

    //c1이라는 변수에 인스턴스를 담아서~
    //c1은 Calculator를 담는 컨테이너고, Calculator는 데이터타입이다.
    //객체를 만든다는것은 데이터타입을 우리가 직접 만드는것이라고 생각하면됨
    //어떤 변수를 선언한다는것은,, 컴퓨터 메모리안에프로그램을적재시켜서...


    c1.setOperands(10, 20);//c1이라는 객체에서, 10,20값을 부여한것.
    //그 인스턴스에 setOperands를 통해 값을담아서~~c1.avg();
    c1.sum();//30

    Calculator c2 = new Calculator();

    c2.setOperands(20, 40);
    c2.sum();//60
    c2.avg();


    System.out.println(c1.PI);//3.14
    System.out.println(c2.PI);//3.14
    System.out.println(Calculator.PI);//3.14

    Calculator.base = 20;
    c1.sum();//50
    c2.sum();//80


  }

}
