package ru.eritsyan.java.basic.homeworks.lesson13;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException, ScriptException {
        ServerSocket socket = new ServerSocket(8080);
        while (true) {
            Socket clientSocket = socket.accept();
            DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
            outputStream.writeUTF("Доступные операции для вычислений [+], [-], [*], [/]");
            String userInput = inputStream.readUTF();
            System.out.println(userInput);
            String result = calc(userInput);
            outputStream.writeUTF(result);
            outputStream.flush();
            System.out.println("message from server " + result);
        }
    }

    public static String calc(String str) throws ScriptException {

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine
                = manager.getEngineByName("JavaScript");
        System.out.println(engine.eval(str));
        return "Результат вычисления: " + str + "=" + engine.eval(str).toString();

    }
}
