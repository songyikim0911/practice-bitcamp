package projectoop;

import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

  public static void main(String[] args) throws IOException {

    System.out.println(Math.PI);
    System.out.println(Math.floor(1.8));
    System.out.println(Math.ceil(1.8));

    FileWriter f1 = new FileWriter("data.txt");
    f1.write("Hello");
    f1.write("Java");
    f1.close();


    FileWriter f2 = new FileWriter("data2.txt");
    f2.write("Hello");
    f2.write("Java");
    f2.close();


    //new를 붙이면 뒤에 따라오는 클래스는 data.txt에 저장하겠다는 상태임
    //fileWrite라는 클래스의 복제본을 만드는것.

    // FileWriter("data.txt")
    //파일에 기록할떄 쓰는 클래스
    //저장하고 싶은 파일의 명 data.txt
  }

}
