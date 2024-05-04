package cs.vsu.ru.keyvaluestoragereplica.database.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.ConcurrentHashMap;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Table {

    private ConcurrentHashMap<String, Object> table = new ConcurrentHashMap<>();
}
