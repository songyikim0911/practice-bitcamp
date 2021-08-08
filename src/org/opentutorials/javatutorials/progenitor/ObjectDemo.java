package org.opentutorials.javatutorials.progenitor;



class Student{
  String name;
  Student(String name){
    this.name = name;
  }
  //부모는 자식의 행세를 할 수 없다. 자식의 특성을 모를수도있으니깐.
  //자식은 부모의 행세를 할 수 있다. 자신의 특성들을 감추는거니깐.
  //자식은 부모거 + 새로운것
  //부모는 자식이 새롭게 가진 특성을 모르기때문에 자식행세불가임
  //Object obj=s2 자식이 부모가 되는거 ->자동으로 형변환가능
  //Student s = (Student)obj; 부모가 자식이 되는거 ->이런식으로 명시적 형변환이 필요함!!

  public boolean equals(Object obj) {
    //무엇이 들어올지 모를때 이렇게, 매개변수로 Object의 변수를
    //넣는 경우 많다.!

    Student s = (Student)obj;
    return this.name == s.name;
    //사실 equals를 제대로하려면
    //hashCode를 이용해야한다!

  }
}

public class ObjectDemo {


  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Student s1 = new Student("eoging");
    Student s2 = new Student("egoing");
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));


  }

}
