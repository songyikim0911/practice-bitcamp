package org.opentutorials.javatutorials.constant2;



public class ConstantDemo2 {

  public final static int FRUIT_APPLE = 1;
  public final static int FRUIT_PEACH = 2;
  public final static int FRUIT_BANANA = 3;


  public static void main(String[] args) {

    int type = FRUIT_APPLE ;

    switch(type) {
      case FRUIT_APPLE://주석이 없어도 설명이 가능함
        System.out.println(57+" kcal");
        break;
      case FRUIT_PEACH:
        System.out.println(34+" kcal");
        break;
      case FRUIT_BANANA:
        System.out.println(93+" kcal");
        break;

    }

  }

}
