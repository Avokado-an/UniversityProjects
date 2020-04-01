package MapRelated;

import Entity.Person;

import java.util.HashMap;
import java.util.Map;

public class MapOwner {
    protected Map<String, Person> map = new HashMap<>();

    MapOwner(String id, Person person) {
        map.put(id, person);
    }

    public MapOwner() {
    }
}
