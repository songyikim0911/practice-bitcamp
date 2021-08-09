package org.opentutorials.javatutorials.progenitor;



class Student2  implements Cloneable {
  //Cloneable은 기능은 없고, 복제를 할 수 있는지 없는지
  //구분만 해주는 구분자 역할임.일종의 복제를 할 수있다는 약속같은것.
  String name;
  Student2(String name){
    this.name = name;
  }

  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}

public class ObjectDemo2 {


  public static void main(String[] args) {


    Student2 s1 = new Student2("eoging");
    //1번 오류!  s1.clone();//에러!
    //복제하려면, 이 Student2클래스가 복제가능한 클래스라는것을
    //jvm한테 알려줘야한다. cloneable이라는 인터페이스를 먼저 구현해줘야해!

    //2번 오류! s1.clone();//에러!
    //이유? clone()메소드 의 조건때문!

    //서로 다른 패키지에서는 메서드를 호출불가하다. clone메서드의 접근제어자가 protected이기 때문,
    //(Object는 java.lang의 패키지에 소속되어있잖아.그래서안되)
    //(참고)toString등 다른 메서드는 접근제어자가 public으로 되어있음

    //protected 접근제어자 속성 
    //특징1:서로 다른 패키지에서는 메서드를 호출불가하다.
    //특징 2. 단,서로 다른 패키지라도 상속이 가능하다.

    try {
      Student2 s2 = (Student2)s1.clone();
      System.out.println(s1.name);
      System.out.println(s2.name);
    } catch (CloneNotSupportedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }


  }

}
