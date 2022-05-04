
import java.io.IOException;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        System.out.println("Client Started!");

        String str1= "hello guzzz....welcome to bhandare classes...";
        InetAddress ip = InetAddress.getByName("localhost");
        DatagramPacket dp = new DatagramPacket(str1.getBytes(),str1.length(),ip,3000);

        ds.send(dp);
        System.out.println("Message sent to server!");
        ds.close();


    }
}
