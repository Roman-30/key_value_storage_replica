package cs.vsu.ru.keyvaluestoragereplica.common.service;

public interface GlobalParam {
    void setIsUpdate(Boolean flag);
    void setIsBackup(Boolean flag);
    void setIsMaster(Boolean flag);
}
