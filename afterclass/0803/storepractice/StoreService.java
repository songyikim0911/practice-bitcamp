package org.zerock.storepractice;


import java.util.Arrays;
import java.util.Optional;

/*로직 위주의 클래스
메소드 우선 설계
파라미터와 리턴 타입으로 데이터 위주의 클래스 타입 활용
생성자 의미 - ready(준비)
멤버변수 - 누적/상태/조력자
고객이 원하는 기능을 가지는 비즈니스 로직을 가지고 있다.
 */
public class StoreService {

    private StoreDTO[] storeDTOS;

    public StoreService(StoreDTO[] storeDTOS){this.storeDTOS = storeDTOS;    }

    public StoreService(){

    }

    public StoreDTO findByMenuName(String menuName){
        Optional<StoreDTO> result =
                Arrays.stream(this.storeDTOS).filter(storeDTO -> storeDTO.getMenu().indexOf(menuName) >= 0).findFirst();
        //파라미터,리턴타입...정의해야해!)

        if(result.isPresent()){
            return result.get();
        }else{
            return null;
        }

    }

}
