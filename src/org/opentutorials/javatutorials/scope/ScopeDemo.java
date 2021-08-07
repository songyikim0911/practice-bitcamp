package org.opentutorials.javatutorials.scope;

public class ScopeDemo {



  static void a() {
    int i = 0 ;//요기에 int를 선언해주면, i라는 변수를 생성하고 생성된곳에 0을넣는건데.
    //a메소드 안에서 했기 때문에, a메소드에서 0으로 해봤자, 메소드 호출이끝나면
    //메소드 밖에서는 유효안함, 결국 전역에 있는 값에는 전혀 영향을 주지 않는다.
    //결국 이 i는 메소드 내에서만 유효하는값이다.

    //지역변수

    //메소드 내의 변수는
    //메소드 내에서만 유효! = 유효범위
    //만약 이 i를 메소드 내가 아니라
    //class내에 선언했다면
    //유효범위가 클래스로 되어서.....
    //무한루프가될꺼다...
  }


  public static void main(String[] args) {
    // TODO Auto-generated method stub

    for (int i = 0; i < 5 ;i++) {//for문 안에서 int를 지정해주면, 이 i는
      //결국 이 for문안에서만 유효한값이다.
      //외부에서는 이 i는 없는거나 마찬가지임
      a();
      System.out.println(i);
    }

  }

}
