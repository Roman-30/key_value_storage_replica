package cs.vsu.ru.keyvaluestoragereplica.database.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TableDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private ConcurrentHashMap<String, Object> table = new ConcurrentHashMap<>();
}
