package cs.vsu.ru.keyvaluestoragereplica.database.service;

import cs.vsu.ru.keyvaluestoragereplica.database.dto.DataBaseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
@EnableScheduling
@RequiredArgsConstructor
public class BackupService {
    private final String CONNECTION_FILE = "data\\backup.ser";

    public void makeBackup(DataBaseDto database) {
        Resource resource = new ClassPathResource(CONNECTION_FILE);
        try {
            File file = resource.getFile();
            FileOutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(database);
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public DataBaseDto loadBackup() {
        Resource resource = new ClassPathResource(CONNECTION_FILE);
        DataBaseDto database = null;
        try {
            File file = resource.getFile();

            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            database = (DataBaseDto) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return database;
    }

}
