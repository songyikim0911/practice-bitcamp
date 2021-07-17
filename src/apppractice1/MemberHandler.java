package apppractice1;
import java.util.Scanner;
import java.util.Date;


public class MemberHandler implements Handler{

  static class Member{
    String name;
    String email;
    String password;
    boolean working;
    Date registeredDate;
  }

  String memberGroupName;
  Scanner keyScan;
  ArrayList memberList = new ArrayList();

  MemberHandler(Scanner keyScan){
    this.keyScan = keyScan;
    this.memberGroupName 
  }

}
