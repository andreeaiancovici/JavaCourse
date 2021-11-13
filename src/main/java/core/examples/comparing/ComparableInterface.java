package core.examples.comparing;

import core.examples.Example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static cmd.Commands.*;

public class ComparableInterface implements Example {

    @Override
    public void execute() {
        displayTitle("Comparable Interface");
        displayNoteToRemind("Comparable Interface allows us to define an ordering between objects.");
        displayNoteToRemind("Comparable Interface is generic and has only one method \"int compareTo(T object)\", where T is the generic type.");

        Animal cat = new Animal(2, "cat");
        Animal dog = new Animal(2, "dog");
        Animal pig = new Animal(3, "pig");
        Animal mouse = new Animal(1, "mouse");

        displayInfo("In this example, compareTo only takes in consideration age property of Animal.");
        displayExample(String.format("%s.compareTo(%s) is %s", cat, pig, cat.compareTo(pig)));
        displayExample(String.format("%s.compareTo(%s) is %s", cat, dog, cat.compareTo(dog)));
        displayExample(String.format("%s.compareTo(%s) is %s", pig, cat, pig.compareTo(cat)));

        displayInfo("Let's define animals array:");
        List<Animal> animals = Arrays.asList(cat, dog, pig, mouse);
        display(animals);

        System.out.println();

        displayInfo("Using Collections.sort() method, the array looks like:");
        Collections.sort(animals);
        display(animals);
    }
}
