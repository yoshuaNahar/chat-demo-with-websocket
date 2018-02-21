package nl.devolksbank.tc.websocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.websocket.DeploymentException;
import nl.devolksbank.tc.websocket.websocket.ChatEndpoint;
import org.glassfish.tyrus.server.Server;

public class App {

  public static void main(String[] args) throws DeploymentException, IOException {
    runServer();
  }

  private static void runServer() throws IOException, DeploymentException {
    Server server = new Server("localhost", 8080, "/", ChatEndpoint.class);

    try {
      server.start();
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Please press a key to stop the server.");
      reader.readLine();
    } finally {
      server.stop();
    }
  }

}
