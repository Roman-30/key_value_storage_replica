package cs.vsu.ru.keyvaluestoragereplica.socket.service;

import cs.vsu.ru.keyvaluestoragereplica.database.dto.DataBaseDto;
import cs.vsu.ru.keyvaluestoragereplica.database.model.Database;
import lombok.Data;
import lombok.Getter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

@Data
@Getter
public class ClientService {
    private Database database;
    private Socket socket;
    private ObjectInputStream in;
    private BufferedWriter out;

    public ClientService(String addr, int port, Database database) {
        try {
            this.socket = new Socket(addr, port);
        } catch (IOException e) {
            System.err.println("Socket failed");
        }
        try {
            in = new ObjectInputStream(socket.getInputStream());
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.database = database;
            new ReadMsg().start();
        } catch (IOException e) {
            ClientService.this.downService();
        }
    }

    private void downService() {
        try {
            if (!socket.isClosed()) {
                socket.close();
                in.close();
                out.close();
            }
        } catch (IOException ignored) {
        }
    }

    private class ReadMsg extends Thread {

        @Override
        public void run() {

            DataBaseDto str;
            try {
                while (true) {
                    str = (DataBaseDto) in.readObject();
                    System.out.println(database);
//                    database.setDatabase(dataMapper.toModel(str).getDatabase());
                    System.out.println(str);
                }
            } catch (IOException e) {
                ClientService.this.downService();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
