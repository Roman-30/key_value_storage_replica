package cs.vsu.ru.keyvaluestoragereplica.database.mapper;

import cs.vsu.ru.keyvaluestoragereplica.database.dto.DataBaseDto;
import cs.vsu.ru.keyvaluestoragereplica.database.model.Database;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper {

    DataBaseDto toDto(Database database);

    Database toModel(DataBaseDto dto);
}
