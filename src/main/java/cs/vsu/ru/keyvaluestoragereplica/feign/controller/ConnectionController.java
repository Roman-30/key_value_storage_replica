package cs.vsu.ru.keyvaluestoragereplica.feign.controller;

import cs.vsu.ru.keyvaluestoragereplica.feign.service.FeignService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequiredArgsConstructor
@RequestMapping("/connection")
public class ConnectionController {

    private final FeignService feignService;

    @PostMapping("/rep-name")
    public void setActualRepName(@RequestBody Collection<String> repNames) {
        feignService.setActualRepNames(repNames);
    }
}
