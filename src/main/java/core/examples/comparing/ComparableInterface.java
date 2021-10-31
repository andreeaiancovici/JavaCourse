package core.examples.comparing;

import core.examples.Example;

import static cmd.Commands.*;
import static cmd.Commands.displayExample;

public class ComparableInterface implements Example {

    @Override
    public void execute() {
        displayTitle("Comparable Interface");
        displayNoteToRemind("Comparable Interface allows us to define an ordering between objects.");
        displayNoteToRemind("Comparable Interface is generic and has only one method \"int compareTo(T object)\", where T is the generic type.");

        Animal cat = new Animal(2, "cat");
        Animal pig = new Animal(3, "pig");
        Animal dog = new Animal(2, "dog");

        displayInfo("In this example, compareTo only takes in consideration age property of Animal.");
        displayExample(String.format("%s.compareTo(%s) is %s", cat, pig, cat.compareTo(pig)));
        displayExample(String.format("%s.compareTo(%s) is %s", cat, dog, cat.compareTo(dog)));
        displayExample(String.format("%s.compareTo(%s) is %s", pig, cat, pig.compareTo(cat)));
    }
}
