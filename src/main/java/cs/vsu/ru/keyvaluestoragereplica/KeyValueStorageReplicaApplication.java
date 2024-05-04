package cs.vsu.ru.keyvaluestoragereplica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class KeyValueStorageReplicaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeyValueStorageReplicaApplication.class, args);
    }

}
