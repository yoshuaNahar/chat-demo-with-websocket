WebSocket Chat Demo
===================

This is a trivial demo with Tyrus how WebSockets could be implemented for 
a messaging application.

#### How to run:
Java: `mvn clean install && java -jar target/websocket-chat-demo-0.0.1-SNAPSHOT.jar`

Frontend: Open index.html in 1 or more tabs.

#### Resources
This example is from:
- http://www.baeldung.com/java-websockets

Other examples:
- https://github.com/shekhargulati/wordgame

#### Summary

WebSockets use HTTP to upgrade to the websocket protocol.
So there has to be a http handshake before the websocket protocol
will be used.

These are the links I used to learn about WebSockets:
- https://developer.mozilla.org/en-US/docs/Web/API/WebSockets_API
- https://developer.mozilla.org/en-US/docs/Web/API/WebSockets_API/Writing_a_WebSocket_server_in_Java
- https://developer.mozilla.org/en-US/docs/Web/API/WebSockets_API/Writing_WebSocket_client_applications

These are all Java implementations of WebSockets. There is also Jetty, Undertow, Tomcat implementations. Spring has an entire starter-pom for WebSockets. There is also a JSR 356, Java API for WebSocket. TooTallNate doesn't implement it I guess.

- https://github.com/TakahikoKawasaki/nv-websocket-client
- https://github.com/TooTallNate/Java-WebSocket
- https://github.com/tyrus-project/tyrus

###### Note:
Please don't try to implement WebSockets by yourself.
Use an existing implementation like [Tyrus](https://github.com/tyrus-project/tyrus) or [Tomcat Websockets](https://github.com/apache/tomcat/tree/trunk/java/org/apache/tomcat/websocket).
