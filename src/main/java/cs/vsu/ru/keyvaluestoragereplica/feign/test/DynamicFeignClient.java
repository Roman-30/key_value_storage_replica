package cs.vsu.ru.keyvaluestoragereplica.feign.test;

import cs.vsu.ru.keyvaluestoragereplica.database.model.Database;
import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

public class DynamicFeignClient {

    interface FeignClient {
        @RequestMapping(value = "/database/update", method = POST)
        void updateData(@RequestBody Database database);
    }

    private final FeignClient feignClient;

    public DynamicFeignClient(ApplicationContext appContext, String serviceId) {
        FeignClientBuilder feignClientBuilder = new FeignClientBuilder(appContext);
        this.feignClient = feignClientBuilder.forType(FeignClient.class, serviceId).build();
    }

    public void doUpdate(Database database) {
        feignClient.updateData(database);
    }
}