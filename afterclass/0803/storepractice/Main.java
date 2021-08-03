package org.zerock.storepractice;



import org.zerock.storepractice.ui.FindMenuUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StoreDTO[] dtos = new StoreDTO[]{
                StoreDTO.builder().name("A").menu("A").build(),
                StoreDTO.builder().name("B").menu("B").build(),
                StoreDTO.builder().name("C").menu("C").build(),
                StoreDTO.builder().name("홍콩반점").menu("짜장면, 짬뽕, 볶음밥").build(),
                StoreDTO.builder().name("유진식당").menu("냉면").build()

        };

        StoreService service = new StoreService(dtos);
        Scanner scanner = new Scanner(System.in);
        FindMenuUI ui = new FindMenuUI(scanner, service);
        ui.doJob();
    }
}
