package org.zerock.storepractice.ui;

import lombok.AllArgsConstructor;
import org.zerock.storepractice.StoreService;

import java.util.Scanner;

@AllArgsConstructor
public class AbstractMenuUI {//abstract라고 붙이는 이유는
    //실제로 사용하는건 아닌 (상속이목적인)클래스 이기 때문임.

    private Scanner scanner;
    protected StoreService storeService;

    protected String readLine(String str){
        System.out.println(str);
        return scanner.next();
    }

    protected int readInt(String str){
        System.out.println(str);
        return Integer.parseInt(scanner.nextLine());

    }

    protected Double readDouble(String str){
        System.out.println(str);
        return Double.parseDouble(scanner.nextLine());
    }
    public void doJob(){

    }//오버라이드 목적... void임, abstract

}
