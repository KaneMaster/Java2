package Homework.Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        final String IP_HOST = "localhost";
        final int PORT = 8700;
        Socket socket = null;

        try {
            System.out.println("Клиент запущен");
            socket = new Socket(IP_HOST, PORT);
            System.out.println("Соединение с сервером установленно");
            Scanner scn = new Scanner(System.in);

            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());
            String str;

            Thread t1 = new Thread(() -> {
                while (true){
                    try {
                        System.out.println("Сервер: " + in.readUTF());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            t1.setDaemon(true);
            t1.start();

            while (true){
                str = scn.nextLine();
                out.writeUTF(str);
                out.flush();
                if (str.equals("/end")) {
                    System.out.println("Соединение разорвано");
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        




    }





}
