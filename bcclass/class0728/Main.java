package class0728;

public class Main {

  public static void main(String[] args) {
    StoreDTO storeDTO = StoreDTO.builder()
        .name("한글식당")
        .lat(37.12334)
        .lng(127.23332)
        .menu("BBBB")
        .build();


    System.out.println(storeDTO);
  }
}