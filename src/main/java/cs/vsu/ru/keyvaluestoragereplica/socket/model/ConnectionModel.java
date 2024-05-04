package cs.vsu.ru.keyvaluestoragereplica.socket.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import cs.vsu.ru.keyvaluestoragereplica.database.ref.ShardState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ConnectionModel {
    @JsonProperty
    private WebAddress address;
    @JsonProperty
    private ShardState shardState;
    @JsonProperty
    private Integer shardNumber;
}
