package cs.vsu.ru.keyvaluestoragereplica.common.service;

import cs.vsu.ru.keyvaluestoragereplica.database.ref.ShardState;
import org.springframework.stereotype.Service;

@Service
public class GlobalParamService implements GlobalParam {

    public String getState() {
        return cs.vsu.ru.keyvaluestoragereplica.common.model.GlobalParam.isMaster ? ShardState.MASTER.name() : ShardState.SLAVE.name();
    }

    @Override
    public void setIsUpdate(Boolean flag) {

    }

    @Override
    public void setIsBackup(Boolean flag) {

    }

    @Override
    public void setIsMaster(Boolean flag) {
        cs.vsu.ru.keyvaluestoragereplica.common.model.GlobalParam.isMaster = flag;
    }
}
