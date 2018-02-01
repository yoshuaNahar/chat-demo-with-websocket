package nl.devolksbank.tc.websocket.websocket;

import com.google.gson.Gson;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;
import nl.devolksbank.tc.websocket.model.Message;

public class MessageDecoder implements Decoder.Text<Message> {

  @Override
  public Message decode(String s) {
    Gson gson = new Gson();
    return gson.fromJson(s, Message.class);
  }

  @Override
  public boolean willDecode(String s) {
    return (s != null);
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
