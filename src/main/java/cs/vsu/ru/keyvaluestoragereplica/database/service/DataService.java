package cs.vsu.ru.keyvaluestoragereplica.database.service;

import cs.vsu.ru.keyvaluestoragereplica.common.model.GlobalParam;
import cs.vsu.ru.keyvaluestoragereplica.database.model.Database;
import cs.vsu.ru.keyvaluestoragereplica.database.repository.DataRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DataService {

    private final DataRepositoryImpl repository;

    public String saveData(String name, String block, Object sd) {
        String data = repository.saveData(name, block, sd);
        GlobalParam.isUpdate = true;
        GlobalParam.isBackup = true;
        return data;
    }

    public Object getTableData(String name, String block) {
        return repository.findDataByName(name, block);
    }

    public void setNewDAta(Database newData) {
        repository.setNewData(newData);
    }
}


