package org.zerock.ex2practice;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class DataClient {

    //bad code
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("input your message");

        String msg = scanner.nextLine();

        Socket socket = new Socket("127.0.0.1", 9999);
        OutputStream out = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(out);
        InputStream in = socket.getInputStream();
        DataInputStream din = new DataInputStream(in);

        dos.writeUTF(msg);
        System.out.println("------------------");
        String serverMsg = din.readUTF();
        System.out.println(serverMsg);
    }

}
