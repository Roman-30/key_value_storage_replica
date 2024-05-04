package cs.vsu.ru.keyvaluestoragereplica.database.repository;

import org.springframework.stereotype.Service;

@Service
public interface DataRepository {

    String saveData(String name, String block, Object sd);

    Object findDataByName(String name, String block);
}
