package cs.vsu.ru.keyvaluestoragereplica.test;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "tests")
public class Test {

    private String propertiess;

}