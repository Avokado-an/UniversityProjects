package Entity;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private static int id = 0;
    private int index;

    public Person(String name, int age) {
        id++;
        index = id;
        this.name = name;
        this.age = age;
    }

    public Person(int id, String name, int age) {
        index = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getId() {
        return id;
    }

    public static Person createPerson() {
        Scanner in = new Scanner(System.in);
        System.out.println("Name - ");
        String name = in.nextLine();
        System.out.println("Age - ");
        int age = in.nextInt();
        return new Person(name, age);
    }

    @Override
    public String toString() {
        return  index + ": Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "}\n";
    }
}
