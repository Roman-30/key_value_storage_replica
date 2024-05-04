package cs.vsu.ru.keyvaluestoragereplica.common.controller;

import cs.vsu.ru.keyvaluestoragereplica.common.service.GlobalParamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/param")
public class GlobalParamController {

    private final GlobalParamService globalParamService;

    @PostMapping("/{flag}/master")
    public void makeMaster(@PathVariable Boolean flag) {
        globalParamService.setIsMaster(flag);
    }

    @GetMapping("/state")
    public String getState() {
        return globalParamService.getState();
    }
}
