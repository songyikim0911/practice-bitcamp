package org.opentutorials.javatutorials.constant2;



enum Fruit2{


  APPLE("red"), PEACH("pink"), BANANA("yellow");
  //각 apple,peach,banana가 생성되면서
  //생성자가 호출. 여튼 인스턴스를 이렇게 가지는것임.
  //현재 APPLE, PEACH, BANANA라는 인스턴스가 생성되었다!
  //그리고 그 인스턴스 생성할떄마다 생성자를 사용하기 때문에,
  //생성자의 조건에 맞춰줘야하는데, 현재 String color를 매개변수로 받기 때문에
  //각각 생성할때 매개변수를 넣도록 해준 것이다.




  private String color;//사용자들이 셋팅한 컬러를 직접 변경못하게,private
  //사실상 enum은 클래스나 다름없기때문에
  //이렇게 전역 변수도 가질 수 있다!!


  //사실상 enum은 클래스나 다름없기때문에
  //전역 변수 뿐만아니라 아래처럼 메소드도 가질 수 있다!
  public String getColor() {
    return this.color;
  }

  Fruit2(String color) {//생성자!
    //상수가 세개 이기 때문에 콜컨스트럭터가 3번 호출되는거
    //생성자가 3번 호출, 인스턴스가 3번 생성되기때문임.
    System.out.println("Call Constructor"+this);
    //APPLE,PEACH,BANANA 각 1개씩 생성 , 생성자가 호출된다.
    this.color = color;
    //this도 존재한다. 각각의 인스턴스에 대해...

    //이 생성자 문장의 의미?
    //매개변수로 String color를 받아서,
    //그 매개변수 값이, 인스턴스의 this.color값으로
    //배정되는 생성자를 만든것.

  }
}


enum Company2{
  GOOGLE, APPLE, ORACLE
}

public class ConstantDemo5 {



  public static void main(String[] args) {
    //enum의 장점? 열거형으로 만들기 때문에
    //데이터를 배열처럼 하나하나 꺼내서 처리 할 수 있다는 장점
    for(Fruit2 f : Fruit2.values()) {
      //values로 fruit2값을 꺼내서 f에 하나하나 꺼내서, fruit의 데이터를 f에 넣어주는거임
      //상수 데이터를 갖고 있는 배열을 만드는것 뿐만아니라
      //배열처럼 값을 하나하나 꺼내서 처리 할 수 있는 기능을 제공한다는것이
      //열거형의 중요한 특성임!

      //열거형의 중요한 특성!
      //연관된 값들을 상수로 저장, 그리고 이 값이 바뀌지않도록 보장
      //열거형은 클래스 이기때문에 단순 상수가 아니라 클래스 처럼 변수,메소드도 가짐
      //values라는 메소드를 통해, 저장되어있는 상수값들을 배열처럼 꺼내서
      //처리 할 수 있음.
      System.out.println(f);
    }


    Fruit2 type = Fruit2.APPLE;//enum은 이렇게 사용하도록 약속되어있다.

    switch(type) {
      case APPLE:
        System.out.println(57+"kcal, color:" + Fruit2.APPLE.getColor());
        break;
      case PEACH:
        System.out.println(34+"kcal"+Fruit2.PEACH.getColor());
        break;
      case BANANA:
        System.out.println(93+"kcal"+Fruit2.BANANA.getColor());
        break;

    }


  }

}
