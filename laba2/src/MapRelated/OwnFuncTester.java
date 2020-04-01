package MapRelated;

import Comparators.PersonAgeComparator;
import Comparators.PersonNameComparator;
import Entity.Person;
import Supporters.InputHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OwnFuncTester extends MapOwner {
    InputHandler in = new InputHandler();

    OwnFuncTester(String id, Person person) {
        super(id, person);
    }

    public OwnFuncTester() {
        super();
    }

    public void ownFunctionality(int choice) {
        if (choice == 1) {
            int sortChoice = in.inputIntWithMessage("1 - by name  2 - by age  other - exit");
            System.out.println(sort(sortChoice));
        } else if (choice == 2)
            System.out.println("Copied Map : \n" + copy().toString());
    }

    private Map<String, Person> copy() {
        Map<String, Person> res = new HashMap<>();
        for (Map.Entry<String, Person> entry : map.entrySet())
            res.put(entry.getKey(), entry.getValue());
        return map;
    }

    private String sort(int choice) {
        if (choice == 1)
            return sortMapByName();
        else if (choice == 2)
            return sortMapByAge();
        return null;
    }

    String sortMapByAge() {
        List<Person> list = new ArrayList<>(map.values());
        list.sort(new PersonAgeComparator());
        System.out.println(list.toString());
        return  list.toString();
    }

    String sortMapByName() {
        List<Person> list = new ArrayList<>(map.values());
        list.sort(new PersonNameComparator());
        return list.toString();
    }
}
