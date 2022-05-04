
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatClient1 {
    public static void main(String[] args) throws IOException {
        Socket s1 = new Socket("localhost",3000);
        System.out.println("Client Started!");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String clientMsg,serverMsg;
        System.out.println("Enter Msg: ");
        //clientMsg = br.readLine();

        DataOutputStream dout = new DataOutputStream(s1.getOutputStream());

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s1.getInputStream()));

        while (!(clientMsg = br.readLine()).equals("exit"))
        {
            dout.writeUTF(clientMsg);

            serverMsg = br1.readLine();
            System.out.println("Server Msg: "+serverMsg);
            System.out.println("Enter Msg: ");
        }


        dout.close();
        br.close();

    }
}
