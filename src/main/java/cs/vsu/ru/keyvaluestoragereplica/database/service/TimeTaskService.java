package cs.vsu.ru.keyvaluestoragereplica.database.service;

import cs.vsu.ru.keyvaluestoragereplica.common.model.GlobalParam;
import cs.vsu.ru.keyvaluestoragereplica.database.dto.DataBaseDto;
import cs.vsu.ru.keyvaluestoragereplica.database.mapper.DataMapper;
import cs.vsu.ru.keyvaluestoragereplica.database.model.Database;
import cs.vsu.ru.keyvaluestoragereplica.feign.service.FeignService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
@RequiredArgsConstructor
public class TimeTaskService {
    private final FeignService feignService;
    private final BackupService backupService;
    private final DataMapper dataMapper;
    private final Database database;

    @Scheduled(fixedRate = 5000)
    public void checkConnection() {
        System.out.println(GlobalParam.isMaster);
        System.out.println();
        System.out.println(feignService.getStringDynamicFeignClientMap());
        System.out.println();
        System.out.println(feignService.getActualRepNames());
        System.out.println();
        System.out.println(database);
    }

    @Scheduled(fixedRate = 60000)
    public void makeBackup() {
        if (GlobalParam.isBackup) {
            DataBaseDto sd = dataMapper.toDto(database);
            backupService.makeBackup(sd);
            GlobalParam.isBackup = false;
        }
    }

    @Scheduled(fixedRate = 30000)
    public void sendData() {
        if (GlobalParam.isUpdate && GlobalParam.isMaster) {
            feignService.getStringDynamicFeignClientMap().forEach((k, v) -> {
                v.doUpdate(database);
            });
            GlobalParam.isUpdate = false;
        }
    }
}
