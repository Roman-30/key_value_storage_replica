package cs.vsu.ru.keyvaluestoragereplica.socket.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import cs.vsu.ru.keyvaluestoragereplica.database.ref.ShardState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ConnectionConfig {
    @JsonProperty
    private Integer shardCount;
    @JsonProperty
    private Map<ShardState, ConnectionModel> stateConnectionModelMap;
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    public static class ConnectionTest {
        @JsonProperty
        private List<ConnectionModel> connectionModels;
    }
}
