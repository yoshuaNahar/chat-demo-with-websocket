package nl.devolksbank.tc.websocket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import nl.devolksbank.tc.websocket.websocket.ChatEndpoint;
import org.glassfish.tyrus.server.Server;

public class App {

  public static void main(String[] args) {
    runServer();
  }

  private static void runServer() {
    Server server = new Server("localhost", 8080, "/", ChatEndpoint.class);

    try {
      server.start();
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Please press a key to stop the server.");
      reader.readLine();
    } catch (Exception e) {
      throw new IllegalStateException(e);
    } finally {
      server.stop();
    }
  }

}
