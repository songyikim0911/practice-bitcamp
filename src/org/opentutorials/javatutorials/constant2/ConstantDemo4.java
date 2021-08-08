package org.opentutorials.javatutorials.constant2;



enum Fruit1{//enum사용을통해 열거를 위한 코드라는것을 표명!!!

  APPLE, PEACH, BANANA
  //즉 여기 apple의 의미는
  //아까 썼던
  //class Fruit{
  //public static final Fruit APPLE = new Fruit();
  //이것과 같은의미.

  //위에서 Fruit클래스 만들어서
  //인스턴스 생성한거랑 같은의미다.

}


enum Company1{
  GOOGLE, APPLE, ORACLE
}

public class ConstantDemo4 {

  //enum의 효과
  //1) 코드가 간결
  //2) 인스턴스의  생성과 상속을 방지한다.

  public static void main(String[] args) {

    Fruit1 type = Fruit1.APPLE;//enum은 이렇게 사용하도록 약속되어있다.
    switch(type) {
      case APPLE:
        System.out.println(57+"kcal");
        break;
      case PEACH:
        System.out.println(34+"kcal");
        break;
      case BANANA:
        System.out.println(93+"kcal");
        break;

    }


  }

}
