package ServiceServer;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;


    public Server(int port) throws Exception {
        serverSocket = new ServerSocket(port);
        System.out.println("Server runs on port " + port);
    }


    public void startServer() {
        try {
            while (!serverSocket.isClosed()) {
            	Socket socket = serverSocket.accept();
            	System.out.println(socket.getRemoteSocketAddress() + " has conneted");
            	
            	ServerThread serverThread = new ServerThread(socket);
            	serverThread.start();
            }
        } catch (Exception e) {
            closeServer();;
        }
    }

    public void closeServer() {
        try {
            if (serverSocket != null) {
                serverSocket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
