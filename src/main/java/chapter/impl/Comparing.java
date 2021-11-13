package chapter.impl;

import chapter.Chapter;
import core.examples.ExampleEnum;

import static cmd.Commands.getInteger;

public class Comparing extends Chapter {

    public static void displaySections() {
        System.out.println("\t" + ExampleEnum.COMPARING.getCode() + ". Comparing Primitives, Wrappers and Objects");
        System.out.println("\t" + ExampleEnum.COMPARABLE_INTERFACE.getCode() + ". Comparable Interface");
        System.out.println("\t" + ExampleEnum.COMPARATOR_INTERFACE.getCode() + ". Comparator Interface");
        System.out.println("\t" + ExampleEnum.COMPARING_EXTRA_RESOURCES.getCode() + ". Extra Resources");
    }

    @Override
    public void display() {
        displaySections();

        int option = getInteger();

        exampleFactory.getExample(ExampleEnum.getExampleEnum(option))
                .execute();
    }
}
