package projectoop;

public class MyOOP {

  public static String delimiter="";//클래스 소속의 변수임

  public static void main(String[] args) {
    //..
    //메소드 안에서 정의된 메소드는, 그 메소드 안에서만 쓸 수 있다. ( 유효 범위 라고 함)
    //클래스 소속의 변수로 만들면 밖에서도 사용 가능하다.

    delimiter = "---";
    printA();
    printA();
    printB();
    printB();
    delimiter="****";
    printA();
    printA();
    printB();
    printB();


  }

  public static void printA() {//printA를 감싸고 있는 MyOOP에 선언되어있는 delimiter를 사용함.
    System.out.println(delimiter);
    System.out.println("A");
    System.out.println("A");
  }

  public static void printB() {
    System.out.println(delimiter);
    System.out.println("B");
    System.out.println("B");
  }

}
