package org.opentutorials.javatutorials.progenitor;

class Calculator{
  int left, right;

  public void setOprands(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public void sum() {
    System.out.println(this.left + this.right);
  }

  public int avg() {
    return (this.left+this.right)/2;
  }
  /*
  public String toString() {//Object 클래스의 toString을
    //재정의한 코드임..  . ...
    //근데 여기서 기존 것도 꺼내서 쓰고싶다?
    //super를 활용하면 기존 toString도 활용.
    return super.toString()+",left:"+this.left+", right:" + this.right;
  }
   */
}


class SubstractionableCalculator extends Calculator {

  //오버라이딩
  //부모가 가지고 있던 sum을 재정의

  public void sum() {
    System.out.println("실행 결과는 "+(this.left + this.right)+"입니다");
  }

  public int avg() {
    return super.avg();
    //부모 avg를 호출해서 리턴함.
  }



}


public class CalculatorDemo1{
  public static void main(String[] args) {

    //toString = 문자화시킨다.는 의미
    //어떤 객체를 문자화시켜주는,,
    Calculator c1 = new Calculator();
    c1.setOprands(10, 20);
    System.out.println(c1);//출력내용 ; 패키지명(인스턴스소속)@인스턴스주소 
    //암시적으로 c1을 출력한다는것은 c1.toString과 다름없다.문자를 출력한다는 의미라서

    System.out.println(c1.toString());//결과 같다. 메소드의 호출을 명시적으로 안하고,
    //toString은 디폴트로 상속하고있는 Object 클래스의 메소드임.
    //toString은 문자화 시키는 메소드!

    //참고로 toString 쪽에 컨트롤 누른다음에 open implementation을 누르면
    //object 클래스의 정보를 알 수 있다.
    /*참고로 toString은 이렇게 생겼다.
     *    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

     */
    String a = c1.toString();
    System.out.print(a);
  }
}
