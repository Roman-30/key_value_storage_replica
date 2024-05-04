package cs.vsu.ru.keyvaluestoragereplica.socket.service;

import cs.vsu.ru.keyvaluestoragereplica.database.dto.DataBaseDto;
import lombok.Data;

import java.io.*;
import java.net.Socket;

@Data
public class ServerSocket{

    private Socket socket;
    private BufferedReader in;
    private ObjectOutputStream out;
    private BufferedWriter outM;
    public ServerSocket(Socket socket) throws IOException {
        this.socket = socket;
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        outM = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        out = new ObjectOutputStream(socket.getOutputStream());
    }

    public void sendMessage(String msg) {
        try {
            out.writeObject(msg);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void send(DataBaseDto msg) {
        try {
            out.writeObject(msg);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


