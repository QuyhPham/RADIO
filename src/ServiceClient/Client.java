package ServiceClient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private Socket 		   socket;
    private String 		   nickName;

    public Client(String localhost, int port, String nickName) {
        try {
            this.socket		    = new Socket(localhost, port);
            this.nickName 		= nickName;

        } catch (Exception e) {
            //TODO: something
        }
    }


}
