package chapter;

import core.examples.ExampleFactory;

public abstract class Chapter {

    protected ExampleFactory exampleFactory = new ExampleFactory();

    public abstract void display();
}
