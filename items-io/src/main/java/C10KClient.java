import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;
import java.util.LinkedList;

/**
 * @author nanshan
 * @since 2020-06-06 15:12
 */
public class C10KClient {

    public static void main(String[] args) {
        LinkedList<SocketChannel> clients = new LinkedList<>();
        InetSocketAddress serverAddr = new InetSocketAddress("47.100.191.210", 9090);

        for (int i = 10000; i < 65000; i++) {
            try {
                SocketChannel client1 = SocketChannel.open();
                client1.bind(new InetSocketAddress(i));
                client1.connect(serverAddr);
                clients.add(client1);
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        System.out.println("clients " + clients.size());
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
