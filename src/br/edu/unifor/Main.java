package br.edu.unifor;

import java.io.*;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("www.google.com.br", 80);

        PrintWriter pw = new PrintWriter(socket.getOutputStream());

        pw.println("GET / HTTP/1.1");

        pw.println("Host: www.google.com.br");

        pw.println("");

        pw.flush();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String t;

        while((t = br.readLine()) != null){
            System.out.println(t);
        }

        br.close();
        pw.close();

        System.out.println("Encerrado.");
    }

}
