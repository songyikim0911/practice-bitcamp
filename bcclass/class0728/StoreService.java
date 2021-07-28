package class0728;


//로직 위주의 클래스
//메소드 우선 설계
//파라미터와 리턴 타입으로 데이터 위주의 클래스 타입 활용
//생성자 의미 - ready (준비)
//멤버 변수 - 누적/상태/조력자
public class StoreService {

  private StoreDTO[] storeDTOS;

  public StoreService(StoreDTO[] storeDTOS) {
    this.storeDTOS = storeDTOS;
  }

  public StoreDTO findByMenuName(String MenuName){
    //파라미터,리턴타입...정의해야해!
    return null;
  }


}
