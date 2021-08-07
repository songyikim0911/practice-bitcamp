package org.opentutorials.javatutorials.classinstance;

class C1 {

  static int static_variable = 1;//스테틱변수(클래스변수)
  int instance_variable = 2;//인스턴스변수

  static void static_static() {//스테틱(클래스)메서드
    System.out.println(static_variable);//스테틱(클래스) 변수
    //스테틱메서드가 스테틱변수 호출!
  }

  static void static_instance() {//스테틱(클레스)메서드
    //클래스 메소드에서는 인스턴스 변수에 접근할 수 없다.
    //System.out.println(instatnce_variable); 인스턴스 변수
    //스테틱메서드에서 인스턴스 변수 호출시
  }
  void instance_static() {//인스턴스 메서드
    //인스턴스 메소드에서는 클래스변수에 접근할 수 있다.
    System.out.println(static_variable);//스태틱 변수
  }
  void instance_instance() {//인스턴스 메서드
    System.out.println(instance_variable);//인스턴스 변수
  }

}
public class ClassMemberDemo{
  public static void main(String[] args) {

    C1 c = new C1();
    //인스턴스를 이용해서 정적 메소드에 접근 -> 성공
    //인스턴스 메소드가 정적 변수에 접근 -> 성공

    c.static_static();//1
    //인스턴스를 이용해서 정적 메소드에 접근 -> 성공
    //정적 메소드가 인스턴스 변수에 접근 -> 실패

    //c.static_instance();//에러
    //인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
    //인스턴스 메소드가 클래스 변수에 접근 ->성공

    c.instance_static();//1
    //인스턴스를 이용해서 인스턴스 메서드에 접근 ->성공
    //인스턴스 메소드가 인스턴스 변수에 접근 ->성공

    c.instance_instance();
    //클래스를 이용해서 클래스 메소드에 접근->성공
    //클래스 메소드가 클래스 변수에 접근 ->성공

    C1.static_static();
    //클래스를 이용해서 클래스 메소드에 접근 ->성공
    //클래스 메소드가 인스턴스 변수에 접근 ->실패

    //C1.static_instance();
    //클래스를 이용해서 인스턴스 메소드에 접근 ->실패

    //C1.instance_static();
    //클래스를 이용해서 인스턴스 메소드에 접근 ->실패
    //C1.instance_instance();


  }

}
