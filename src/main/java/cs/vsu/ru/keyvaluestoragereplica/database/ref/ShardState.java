package cs.vsu.ru.keyvaluestoragereplica.database.ref;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ShardState {
    MASTER(true),
    SLAVE(false);

    private final Boolean state;
}
