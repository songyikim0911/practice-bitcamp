package day210804;

public class Horse extends Thread{

  private String name;
  private int pos;

  public Horse(String name) {
    this.name = name;
    this.pos = 0;}

  public void run() {
    this.gallop();
  }


  public void gallop() {
    for (int i = 0; i < 100; i ++) {
      int range = (int)(Math.random() * 10 )+1;
      this.pos += range;

      synchronized(System.out) {
        int count = this.pos/10;
        for (int j = 0; j < count; j++) {
          System.out.print(".");
        }
        System.out.println(this.name + ":" + this.pos);
      }//end synchronized 현재 쓰레드가 system.out을 쓰는동안 다른쓰레드들은 system.out을 쓸 수 없다.

      try {
        Thread.sleep(300);
      }catch(InterruptedException e) {
        e.printStackTrace();
      }

    }//end for


  }

  public static void main(String[] args) {
    Horse h1 = new Horse("방다은");
    Horse h2 = new Horse("최한빛");
    Horse h3 = new Horse("김송이");


    h1.start();
    h2.start();
    h3.start();

  }

}
