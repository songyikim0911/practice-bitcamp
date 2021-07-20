package ooppractice1_ex3;

public class Exam7 {


  static class Member{
    String id;
    String password;
    int type;//0;손님 1;회원 2;관리자

  }
  public static void main(String[] args) {
    Member m1 = new Member();
    m1.id = "aa";
    m1.password = "111";
    m1.type = 0;

    Member m2= new Member();
    m2.id = "bb";
    m2.password = "22";
    m2.type = 1;

    Member m3 = new Member();
    m3.id = "cc";
    m3.password = "33";
    m3.type = 2;

    // 회원의 타입을 지정할 때 숫자를 이용하였다.
    // 그런데 소스 코드를 작성한 후 시간이 오래 지나면 숫자의 의미를 기억하기가 쉽지 않다.
    // 소스 코드를 작성한 사람도 숫자의 의미를 기억하기가 쉽지 않은데,
    // 남의 소스 코드를 유지보수하는 사람은 더더욱 숫자의 의미를 파악하기란 어렵다.
    // 주석이나 개발 문서를 자세히 살펴보지 않는 이상에는 숫자의 의미를 파악하기 쉽지 않다.

  }

}
