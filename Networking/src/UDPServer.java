
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(3000);

        System.out.println("Server Started!");

        byte [] buffer = new byte[25];

        DatagramPacket dp = new DatagramPacket(buffer,25);

        ds.receive(dp);
        String msg = new String(buffer);
        System.out.println("Msg from Client: "+(msg));
        ds.close();
    }
}
