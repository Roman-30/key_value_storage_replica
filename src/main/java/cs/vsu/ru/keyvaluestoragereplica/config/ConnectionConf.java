package cs.vsu.ru.keyvaluestoragereplica.config;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration

public class ConnectionConf {
    @Value("${server.port}")
    private String serverPort;
}

