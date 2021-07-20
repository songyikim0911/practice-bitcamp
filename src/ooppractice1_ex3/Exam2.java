package ooppractice1_ex3;

public class Exam2 {

  public static void main(String[] args) {

    //1)성적 데이터를 설계할 클래스이기 때문에 그에 맞는 클래스명을 사용해라!

    class Score{

      //2) 여러 명의 구별 되는 성적 데이터를 저장해야 하기 때문에
      //인스턴스 변수로 메모리를 설계하라

      String name;
      int kor;
      int eng;
      int math;
      int sum;
      float average;
    }

    //저장하고 싶은 데이터 개수 만큼 인스턴스를 생성하라
    Score s1 = new Score();
    Score s2 = new Score();
    Score s3 = new Score();
    //1명 분의 데이터를 저장할 메모리
    //각 인스턴스에 한 명의 성적 데이터를 저장하기



    //각 인스턴스에 한 명의 성적 데이터를 저장하기

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;
    s1.sum = s2.kor + s2.eng + s2.math;
    s2.average = s2.sum / 3f;


    s3.name = "유관순";
    s3.kor = 100;
    s3.eng = 90;
    s3.math = 60;
    s3.sum = s3.kor + s3.eng + s3.math;
    s3.average = s3.sum / 3f;





  }

}
