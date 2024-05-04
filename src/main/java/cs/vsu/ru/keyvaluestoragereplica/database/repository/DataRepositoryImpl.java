package cs.vsu.ru.keyvaluestoragereplica.database.repository;

import cs.vsu.ru.keyvaluestoragereplica.common.model.GlobalParam;
import cs.vsu.ru.keyvaluestoragereplica.database.model.Database;
import cs.vsu.ru.keyvaluestoragereplica.database.model.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Getter
@Repository
@RequiredArgsConstructor
public class DataRepositoryImpl implements DataRepository {

    private final Database database;

    @Override
    @CachePut(value = "people", key = "#block")
    public String saveData(String name, String block, Object sd) {
        Table table = this.database
                .getDatabase()
                .get(name);

        if (table == null) {
            Table newTable = new Table();

            newTable.getTable().put(block, sd);

            this.database.getDatabase().put(name, newTable);
        } else {
            table.getTable().put(block, sd);
        }

        GlobalParam.isUpdate = true;

        return name;
    }

    @Override
    @Cacheable(value = "people", key = "#block")
    public Object findDataByName(String name, String block) {

        return this.database
                .getDatabase()
                .get(name)
                .getTable()
                .get(block);
    }

    public void setNewData(Database newData) {
        this.database.getDatabase().putAll(newData.getDatabase());
    }
}

