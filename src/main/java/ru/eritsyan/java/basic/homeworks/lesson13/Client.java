package ru.eritsyan.java.basic.homeworks.lesson13;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client implements AutoCloseable {
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try (Socket socket = new Socket("localhost", 8080)) {
                Client client = new Client(socket.getInputStream(), socket.getOutputStream());
                System.out.println(client.inputStream.readUTF());
                System.out.println("Введите операцию +-/*");
                String operation = scanner.nextLine();
                if (operation.equals("exit")) {
                    break;
                }
                if (operation.equals("+") != true && operation.equals("-") != true && operation.equals("*") != true && operation.equals("/") != true) {
                    System.out.println("некорректный оператор, программа закрыта");
                    break;
                }
                System.out.println("Введите операнд1");
                String operand1 = scanner.nextLine();
                System.out.println("Введите операнд2");
                String operand2 = scanner.nextLine();
                client.send(operation, operand1, operand2);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public Client(InputStream inputStream, OutputStream outputStream) {
        this.inputStream = new DataInputStream(inputStream);
        this.outputStream = new DataOutputStream(outputStream);
    }

    public void send(String operation, String operand1, String operand2) throws IOException {
        outputStream.writeUTF(operand1 + operation + operand2);
        outputStream.flush();
        String result = inputStream.readUTF();
        System.out.println(result);
    }

    @Override
    public void close() throws Exception {
        inputStream.close();
        outputStream.close();
    }
}
