package cs.vsu.ru.keyvaluestoragereplica.database.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.ConcurrentHashMap;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Database {
    private ConcurrentHashMap<String, Table> database;
}
