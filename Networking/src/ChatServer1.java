
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer1 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(3000);
        System.out.println("Server is ready!");
        Socket s1 = ss.accept();
        System.out.println("Connection Ready!");

        //to receive msg from client
        DataInputStream din = new DataInputStream(s1.getInputStream());
        //to send msg to server
        DataOutputStream dout = new DataOutputStream(s1.getOutputStream());

        PrintStream ps = new PrintStream(s1.getOutputStream());


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            //run till client sends msg
            String msg,serverMsg ;
            while ((msg = (String) din.readUTF()) != null) {
                System.out.println("Client Msg: " + msg);
                System.out.println("Enter Msg: ");
                serverMsg = br.readLine();
                ps.println(serverMsg);
            }
            System.exit(0);
        }




    }
}
