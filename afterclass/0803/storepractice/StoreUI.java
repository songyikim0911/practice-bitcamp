package org.zerock.storepractice;

import java.util.Scanner;

public class StoreUI {

    //여러 메서드들이 공유,상태(돼지저금통)
    private Scanner scanner;
    //협력자 - 의존성
    private StoreService storeService;

    public StoreUI(Scanner scanner, StoreService storeService){
        this.scanner = scanner;
        this.storeService = storeService;
    }

    /*public StoreUI(){
    this.scanner = new Scanner(System.in);

    this 호출예시
    public void greeting(){
    System.out.println("Hello World");
    }
    인스턴스 내에 메소드 호출 할 때 this활용 가능!
     */

    public void fnMenu(){
        System.out.println("원하시는 메뉴가 뭔가요?");
        /*메서드 내에 선언하면, 매번 메서드를 선언해야 사용 가능
        scanner = new Scanner(System.in);이 이 안에있었다면 메서드에서만 사용.
        this호출예시 2))
        같은 인스턴스내에 있는 메소드(변수)호출방법 = this!
        this.greeting(); 위 주석에 있는 메소드를 활용하기 위해 이런방식으로 사용가능

         */

        String menuStr = this.scanner.nextLine();
        //this가 원래 이렇게 들어가있는 형태다
        //같은 인스턴스에 있는 scanner를 사용하는거니깐!
        System.out.println(menuStr);

        StoreDTO storeDTO = this.storeService.findByMenuName(menuStr);

        System.out.println(storeDTO);

    }








}
