package nl.devolksbank.tc.websocket.websocket;

import com.google.gson.Gson;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;
import nl.devolksbank.tc.websocket.model.Message;

public class MessageEncoder implements Encoder.Text<Message> {

  @Override
  public String encode(Message message) {
    Gson gson = new Gson();
    return gson.toJson(message);
  }

  @Override
  public void init(EndpointConfig endpointConfig) {
    // Custom initialization logic
  }

  @Override
  public void destroy() {
    // Close resources
  }

}
