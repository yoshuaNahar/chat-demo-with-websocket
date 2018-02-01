let ws;

function connect() {
  const username = document.getElementById("username").value;
  ws = new WebSocket("ws://localhost:8080/chat/" + username);

  ws.onmessage = function (event) {
    const log = document.getElementById("log");
    console.log(event.data);
    const message = JSON.parse(event.data);
    log.innerHTML += message.from + ": " + message.content + "\n";
  };
}

function send() {
  const content = document.getElementById("msg").value;
  const json = JSON.stringify({
    "content": content
  });
  ws.send(json);
}
