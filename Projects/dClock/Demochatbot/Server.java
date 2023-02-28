package Demochatbot;
    /*Requirement
     * Read and write input streams
     * Netwrking(Socket programming)
     * Swing Knwledge(Java FX GUI)
     * Multithreading
     * */


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.*;
import java.io.*;

//import javax.swing.*;
//import java.awt.*;
//import java.io.BufferedReader;
//import java.io.PrintWriter;
//import java.util.*;
//
//import java.io.InputStreamReader;
//import java.net.ServerSocket;
//import java.net.Socket;

public class Server  extends JFrame {
    ServerSocket server;
    Socket socket;

    BufferedReader br;
    PrintWriter out;


//    Create GUI for SERver

    private JLabel heading=new JLabel("LUCKY CHAT SEVER");
    private JTextArea messaageArea = new JTextArea();
    private JTextField messageIP = new JTextField();
    private Font font = new Font("Roboto",Font.BOLD,20);
//    verdana , sans serif roboto

//    Constructor
    public Server() {
        try {
//
            server = new ServerSocket(7778);
            System.out.println("Server is ready to accept connection");
            System.out.println("Waiting...");
            socket = server.accept();

            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out = new PrintWriter(socket.getOutputStream());
//
            createGUI();
            handleEvents();
            startReading();
            startWriting();
//

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private void createGUI(){
        this.setTitle("Server Lucky Chat");
        this.setSize(550,620);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        layout of frame Component
        heading.setFont(font);
        messaageArea.setFont(font);
        messageIP.setFont(font);
        heading.setIcon(new ImageIcon("C:\\Users\\Lucky\\Desktop\\JAVA\\ChatBot\\src\\Demochatbot\\3.png"));
        heading.setHorizontalTextPosition(SwingConstants.CENTER);
        heading.setVerticalTextPosition(SwingConstants.BOTTOM);
        heading.setHorizontalAlignment(SwingConstants.CENTER);

        heading.setHorizontalAlignment(SwingConstants.CENTER);
//        heading.setBackground(Color.RED);
//        heading.setBackground(Color.BLACK);
        heading.setBorder(BorderFactory.createEmptyBorder(25,25,30,30));
        messaageArea.setEditable(false);
        messageIP.setHorizontalAlignment(SwingConstants.CENTER);

//      layout of Frame
        this.setLayout(new BorderLayout());

//        adding the component of frame
        this.add(heading,BorderLayout.NORTH);
        JScrollPane jScrollPane = new JScrollPane(messaageArea);
        this.add(jScrollPane,BorderLayout.CENTER);
        this.add(messageIP,BorderLayout.SOUTH);
        this.setVisible(true);
    }



    //    Create buttun or event
    private void handleEvents() {
        messageIP.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }
            @Override
            public void keyPressed(KeyEvent e) {

            }
            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode() == 10){
                    String contentToSend = messageIP.getText();
                    messaageArea.append("Me : " + contentToSend + "\n");
                    out.println(contentToSend);
                    out.flush();
                    messageIP.setText("");
                    messageIP.requestFocus();
                }
            }
        });
    }
    public void startReading() {
// thread-read  continue and given
        Runnable r1 = () -> {

            System.out.println("Reader started...");
            try {
            while (true) {

                    String sms = br.readLine();
                    if (sms.equals("exit")) {
                        System.out.println("Client terminated the chat");
                        JOptionPane.showMessageDialog(this, "Client terminated the chat");
                        messageIP.setEnabled(false);
                        socket.close();
                        //join use kr sakte ho
                        //inter communication thread
                        break;
                    }

//                    System.out.println("Client :" + sms);
                messaageArea.append("Client : " + sms + "\n");
                }
            }catch (Exception e) {
//                e.printStackTrace();
                System.out.println("Connection closed");
            }
        };
        new Thread(r1).start();
    }
    public void startWriting(){
//     thread - data user get and end the client
        Runnable r2 = () -> {
            System.out.println("Writer started..");
            try {
            while(true && !socket.isClosed()){

                    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                    String content = br1.readLine();
                    out.println(content);
                    out.flush(); // not going data
                    if(content.equals("exit")) {
                        socket.close();
                        break;
                    }
                }
                }catch (Exception e){
//                e.printStackTrace();
                System.out.println("Connection closed");
            }
//            System.out.println("Connection closed");
        };

        new Thread(r2).start();

    }


    public static void main(String[] args) {


        System.out.println("This is server..going to start server");
        new Server();
    }
}
