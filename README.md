# TCP-Socket-Chat-App-in-Java-VS-Code-
A simple Java client–server chat program coded in Visual Studio Code. This is a console-based implementation to demonstrate TCP socket programming, not a packaged GUI application.
----------
## 🚀 Features
- Two-way text chat between client and server
- Built with **Java socket programming (TCP/IP)**
- Works on same computer or across LAN
- `"exit"` command safely closes the chat
- Easy to extend for multiple clients (group chat)

---

## 🛠️ Tools & Technologies
- **Programming Language:** Java  
- **IDE:** Visual Studio Code  
- **Libraries Used:**  
  - `java.net` (for networking classes like Socket, ServerSocket)  
  - `java.io` (for input/output streams)  

---

## 💻 Example Output

Server Terminal

Server started. Waiting for client...
Client connected: /127.0.0.1
Client: Hello Server
Server: Hi Client
Client: exit
Client disconnected.


Client Terminal

Connected to server. Type 'exit' to quit.
Client: Hello Server
Server: Hi Client
Client: exit

----


## 🔮 Future Improvements

>Extend to support multiple clients (group chat)

>Add GUI using Java Swing/JavaFX

>Add encryption for secure communication

------

## ℹ️ Project Note
This project is a **basic networking implementation** written in **Java** using **Visual Studio Code**.  
It is not a full-fledged application with a GUI; instead, it runs in the **terminal/console** to demonstrate the working of **client–server communication using TCP sockets**.


