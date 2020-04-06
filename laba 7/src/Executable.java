import Entities.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Executable {
    public static void main(String[] args) throws IOException {
        File file = new File("Person");
        if(!file.exists())
            file.createNewFile();
        ArrayList<Person> personArrayList = new ArrayList<>();

        Person person1 = new Person(input("Your name - ", String.class),
                input("Your surname - ", String.class), input("Your id - ", Integer.class));
        Person person2 = new Person(input("Your name - ", String.class),
                input("Your surname - ", String.class), input("Your id - ", Integer.class));

        personArrayList.add(person1);
        personArrayList.add(person2);

        try(
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))
        ) {
            out.writeObject(personArrayList);
            show("Object was written");
        } catch (Exception e) {
            e.printStackTrace();
        }

        ArrayList<Person> people;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(file)))
        {

            people=((ArrayList<Person>)in.readObject());
            show(people.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static <T> void show(T obj) {
        System.out.println(obj.toString());
    }

    private static <T> T input(String msg, Class<T> res) {
        Scanner in = new Scanner(System.in);
        show(msg);
        if(res == Integer.class)
            return res.cast(in.nextInt());
        else if(res == String.class)
            return res.cast(in.nextLine());
        show("You did something wrong");
        return null;
    }
}
