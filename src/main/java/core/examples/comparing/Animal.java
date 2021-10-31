package core.examples.comparing;

import java.util.Objects;

public class Animal implements Comparable<Animal> {

    private Integer age;
    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age.equals(animal.age) && Objects.equals(name, animal.name);
    }

    @Override
    public int compareTo(Animal o) {
        return this.age.compareTo(o.age);
    }
}
