package cs.vsu.ru.keyvaluestoragereplica.feign.service;

import cs.vsu.ru.keyvaluestoragereplica.feign.test.DynamicFeignClient;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
@Getter
public class FeignService {

    private final ApplicationContext context;
    private final List<String> actualRepNames = new ArrayList<>();
    private final Map<String, DynamicFeignClient> stringDynamicFeignClientMap = new HashMap<>();

    public void setActualRepNames(Collection<String> names) {
        this.actualRepNames.clear();
        this.actualRepNames.addAll(names);
        actualiseFeignClients();
    }

    private void actualiseFeignClients() {
        this.stringDynamicFeignClientMap.clear();
        actualRepNames.forEach(val -> stringDynamicFeignClientMap.put(val, new DynamicFeignClient(context, val)));
    }
}
