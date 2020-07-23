import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;
import sun.net.www.http.HttpClient;

import java.net.*;
import java.io.*;

public class Client
{
    // initialize socket and input output streams
    private Socket socket            = null;
    private DataInputStream  input   = null;
    private DataOutputStream out     = null;

    // constructor to put ip address and port
    public Client(String address, int port)
    {

    }

    public static void main(String args[]) throws IOException, InterruptedException {
//        HttpClient client = HttpClient.New(new URL("http://localhost:8001/nekaj=ime"));
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("http://localhost:8001/nekaj=ime"))
//                .build();
//
//        HttpResponse<String> response = client.send(request,
//                HttpResponse.BodyHandlers.ofString());
//        System.out.println(response.body());
    }
}

