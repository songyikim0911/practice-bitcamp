package org.opentutorials.javatutorials.constant2;

class Fruit{
  public static final Fruit APPLE = new Fruit();
  //PUBLIC STATIC FINAL은 상수를 만들기위한 조건.
  //상수 final, 데이터타입은 Fruit로 지정..
  //APPLE의 값으로,,, 자기 자신을 인스턴화한값을 넣은것임
  //자기 자신의 인스턴스를 상수의 값으로 지정한 것임.
  public static final Fruit PEACH = new Fruit();
  //PEACH 도 다른 인스턴스를 가지기 때문에 각각의 다른값을 가진다는의미고
  //Fruit라는 데이터타입은 같지만, 인스턴스는 서로 다른
  //인스턴스를 가지고 있다는 의미이다.
  public static final Fruit BANANA = new Fruit();

}

class Company{
  public static final Company GOOGLE = new Company();
  public static final Company APPLE = new Company();
  public static final Company ORACLE = new Company();

}

public class ConstantDemo3 {


  public static void main(String[] args) {



    Fruit type = Fruit.APPLE ;
    /* switch문 에러
     * 
    switch(type) {
      //switch문의 조건
      //byte, short, char, int, enum, String, Character, Byte,Short,Integer
      //값만 ()안에 들어갈 수 있다. Fruit타입은 못들어가!!

      case Fruit.APPLE://주석이 없어도 설명이 가능함
        System.out.println(57+" kcal");
        break;
      case Fruit.PEACH:
        System.out.println(34+" kcal");
        break;
      case Fruit.BANANA:
        System.out.println(93+" kcal");
        break;

    }
     */
  }

}
