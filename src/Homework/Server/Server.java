package Homework.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
            ServerSocket server = null;
            Socket socket = null;

            try {
                server = new ServerSocket(8700);
                System.out.println("Сервер запущен");
                socket = server.accept();
                System.out.println("Клиент подключился");
                DataInputStream sc = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                Thread t1 = new Thread(() -> {
                    Scanner scan = new Scanner(System.in);
                    while (true){
                        String str = scan.nextLine();
                        try {
                            out.writeUTF(str);
                            out.flush();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
                t1.setDaemon(true);
                t1.start();

                while (true) {
                    String str = sc.readUTF();
                    if(str.equals("/end")){
                        System.out.println("Клиент отключился");
                        break;
                    }
                    System.out.println("client: " + str);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

}
