package cs.vsu.ru.keyvaluestoragereplica.socket.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class WebAddress {
    @JsonProperty
    private int port;
    @JsonProperty
    private String host;
}
