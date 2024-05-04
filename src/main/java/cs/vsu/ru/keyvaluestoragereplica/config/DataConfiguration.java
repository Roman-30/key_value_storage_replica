package cs.vsu.ru.keyvaluestoragereplica.config;

import cs.vsu.ru.keyvaluestoragereplica.database.model.Database;
import cs.vsu.ru.keyvaluestoragereplica.database.model.Table;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ConcurrentHashMap;

@Configuration
public class DataConfiguration {

//    @Bean("connectionConfig")
////    public ConnectionConfig getConnection() {
//        ConnectionConfig.ConnectionTest connections = FileUtil.readYaml(
//                "C:\\Users\\romse\\Desktop\\4 курс\\8 семестр\\Диплом\\diplom\\src\\main\\resources\\connection\\connection_cofig.yaml",
//                ConnectionConfig.ConnectionTest.class
//        );
//
//        Map<ShardState, ConnectionModel> connection = new HashMap<>();
//
//        connections.getConnectionModels().forEach(val -> connection.put(val.getShardState(), val));
//
//        return new ConnectionConfig(connection.size(), connection);
//    }

    @Bean
    public Database database() {
        Table table = new Table(new ConcurrentHashMap<>() {{
            put("phoneNumbers", "89518901269");
        }});
        ConcurrentHashMap<String, Table> stringObjectsMap = new ConcurrentHashMap<>();
        stringObjectsMap.put("testDB", table);
        return new Database(stringObjectsMap);
    }
}
