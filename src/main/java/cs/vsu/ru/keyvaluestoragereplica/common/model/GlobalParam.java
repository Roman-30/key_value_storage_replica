package cs.vsu.ru.keyvaluestoragereplica.common.model;

import lombok.Data;

@Data
public class GlobalParam {
    public volatile static Boolean isUpdate = false;
    public volatile static Boolean isBackup = false;
    public volatile static Boolean isMaster = false;


}
