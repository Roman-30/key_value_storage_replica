package cs.vsu.ru.keyvaluestoragereplica.database.model;

import lombok.Data;

import java.util.LinkedList;

@Data
public class Story {
    private LinkedList<String> story = new LinkedList<>();
}
