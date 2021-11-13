package core.examples.comparing;

import core.examples.Example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static cmd.Commands.*;

public class ComparatorInterface implements Example {

    @Override
    public void execute() {
        displayTitle("Comparator Interface");
        displayNoteToRemind("Comparator is not coupled to the definition of the class like Comparable.");
        displayNoteToRemind("We can define a generic typed Comparator which compares properties of an object in any order we prefer.");
        displayNoteToRemind("For a class we can define as many comparators as we like.");

        Animal cat = new Animal(2, "cat");
        Animal dog = new Animal(2, "dog");
        Animal pig = new Animal(3, "pig");
        Animal mouse = new Animal(1, "mouse");

        displayInfo("Let's define animals array:");
        List<Animal> animals = Arrays.asList(cat, dog, pig, mouse);
        display(animals);

        System.out.println();

        Comparator<Animal> compareByAnimalName = Comparator.comparing(Animal::getAge);
        displayInfo("Using the following comparator compareByAnimalName = Comparator.comparing(Animal::getAge), the array looks like:");
        animals.sort(compareByAnimalName);
        display(animals);
    }
}
