package MapRelated;

import Entity.Person;
import Supporters.InputHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PremadeFuncTester extends MapOwner {

    InputHandler in = new InputHandler();

    PremadeFuncTester(String id, Person person) {
        super(id, person);
    }

    public PremadeFuncTester() {
        super();
    }

    public void basicFunctionality(int choice) {
        switch (choice) {
            case 1:
                map.put(Integer.toString(Person.getId()), Person.createPerson());
                break;
            case 2:
                map.remove(in.inputWithMessage("id of person to delete"));
                break;
            case 3:
                System.out.println(map.values());
                break;
            case 4:
                System.out.println(showMapFor());
                break;
            case 5:
                int id = in.inputIntWithMessage("key of element to modify");
                if(map.containsKey(String.valueOf(id))) {
                    String name = in.inputWithMessage("New name - ");
                    int age = in.inputIntWithMessage("New age - ");
                    modify(id, age, name);
                }
            default:
        }
    }

    private StringBuilder showMapFor() {
        StringBuilder res = new StringBuilder();
        for (Map.Entry<String, Person> person : map.entrySet()) {
            String key = person.getKey();
            Person value = person.getValue();
            res.append("key - ").append(key).append(value.toString());
        }
        return res;
    }

    private void modify(int id, int age, String name) {
        map.replace(Integer.toString(id), new Person(id, name, age));
    }
}
