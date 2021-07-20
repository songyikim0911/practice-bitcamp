package ooppractice1_ex3;

public class Exam8 {


  static class Member{
    String id;
    String password;
    int type; // 0: 손님, 1: 회원, 2: 관리자

  }
  public static void main(String[] args) {


    //이전 예제의 문제점을 해결하기 위해 나온것 - 상수
    //즉 의미있는 이름으로 변수를 만들어 놓고 그 변수에 숫자를 저장
    //그리고 그 값을 사용할떄는 변수를 통해 사용
    //조회 용으로 사용할 변수이기에 final로 선언한다
    //상수라는 것을 직관적으로 알리기 위해 변수이름을 대문자로 선언한다.

    final int GUEST = 0;
    final int MEMBER = 1;
    final int MANAGER = 2;

    //상수를 사용한 예

    Member m4 = new Member();
    m4.id = "aa";
    m4.password= "11";
    m4.type = GUEST;

    Member m5 = new Member();

    m5.id= "bb";
    m5.password = "22";
    m5.type = MEMBER;

    Member m6 = new Member();

    m6.id = "cc";
    m6.password = "33";
    m6.type = MANAGER;



  }




}
