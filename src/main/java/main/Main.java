package main;

import core.examples.ExampleEnum;
import core.examples.ExampleFactory;

import static cmd.Commands.displayCategory;
import static cmd.Commands.getInteger;

public class Main {

    public static void main(String[] args) {
        ExampleFactory exampleFactory = new ExampleFactory();

        displayCategory();

        int option = getInteger();

        exampleFactory.getExample(ExampleEnum.getExampleEnum(option))
                .execute();
    }
}
