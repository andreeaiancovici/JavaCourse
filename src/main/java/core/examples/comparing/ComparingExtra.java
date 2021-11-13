package core.examples.comparing;

import core.examples.Example;

import static cmd.Commands.displayNoteToRemind;
import static cmd.Commands.displayTitle;

public class ComparingExtra implements Example {

    @Override
    public void execute() {
        displayTitle("Libraries for Comparing");
        displayNoteToRemind("Apache Commons -> groupId = org.apache.commons and artifactId = commons-lang3");
        displayNoteToRemind("Guava -> groupId = com.google.guava and artifactId = guava");
    }
}