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

        Animal cat = new Animal(2, "cat"), dog = new Animal(2, "dog"), pig = new Animal(2, "pig");

        List<Animal> animals = Arrays.asList(cat, dog, pig);
        display(animals);

        Comparator<Animal> compareByAnimalName = Comparator.comparing(Animal::getAge);
        displayInfo("Using the following comparator compareByAnimalName = Comparator.comparing(Animal::getAge), the array looks like");
        animals.sort(compareByAnimalName);
        display(animals);
    }
}
