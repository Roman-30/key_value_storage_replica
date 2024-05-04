package cs.vsu.ru.keyvaluestoragereplica.database.controller;

import cs.vsu.ru.keyvaluestoragereplica.database.model.Database;
import cs.vsu.ru.keyvaluestoragereplica.database.service.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/database")
public class DataController {

    private final DataService service;

    @PostMapping("/{name}/{block}/")
    public ResponseEntity<?> saveData(
            @PathVariable String name,
            @PathVariable String block,
            @RequestBody Object sd
    ) {
        return new ResponseEntity<>(service.saveData(name, block, sd), HttpStatus.OK);
    }

    @GetMapping("/{name}/{block}/")
    public ResponseEntity<?> findDataByName(
            @PathVariable String name,
            @PathVariable String block
    ) {
        Object data = service.getTableData(name, block);
        if (data == null) {
            return new ResponseEntity<>("Ошибка данных!", HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(service.getTableData(name, block), HttpStatus.OK);
        }
    }

    @PostMapping("/update")
    public void updateData(@RequestBody Database newData) {
        service.setNewDAta(newData);
    }

}
