package com.my.practice2;

import java.sql.DriverManager;
import java.sql.*;
import java.util.*;

class CinemaArray{
  int floor;
  int room;
  String[][] name = new String[6][10];
}


public class CinemaHandler {
  Connection CN = null;
  Statement ST = null;
  ResultSet RS = null;
  String msg = "";
  String jid;
  String jpw;
  String jname;
  int jpoint;
  String title;
  String time;
  String date;
  int ticketPrice;
  String seat;
  String payDate;
  String smsg;
  String jmsg;
  String msgl;
  String aid;
  int appoint;
  int ppoint=0;
  public int atitle;
  public int adate;
  public int atime;

  CinemaArray[][][] arrayTest = new CinemaArray[3][7][6];

  static Scanner sc = new Scanner(System.in);

  public void dbConnect() {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      CN=DriverManager.getConnection("Jjdbc:oracle:thin:@127.0.0.1:152:xe","system","1234"); 
    }catch(Exception ex) {System.out.println("error=" + ex);  }
  }

  public void jselect() {
    try {
      System.out.println();
      System.out.println("전체 데이터 출력 중입니다.");
      System.out.println();
      Thread.sleep(500);
      ST = CN.createStatement();
      msg = "select * from cinemamember";
      ResultSet rs = ST.executeQuery(msg);
      while(rs.next()==true) {
        String jid = rs.getString("cid");
        String jpw = rs.getString("cpw");
        String jname = rs.getString("cname");
        int j
      }
    }



  }
}