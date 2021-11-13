package core.examples;

import core.examples.comparing.ComparableInterface;
import core.examples.comparing.ComparatorInterface;
import core.examples.comparing.Comparing;
import core.examples.comparing.ComparingExtra;

public class ExampleFactory {

    public Example getExample(ExampleEnum exampleEnum) {
        if (exampleEnum == null) {
            throw new IllegalArgumentException("Unsupported example");
        }
        switch (exampleEnum) {
            case COMPARING:
                return new Comparing();
            case COMPARABLE_INTERFACE:
                return new ComparableInterface();
            case COMPARATOR_INTERFACE:
                return new ComparatorInterface();
            case COMPARING_EXTRA_RESOURCES:
                return new ComparingExtra();
            default:
                throw new IllegalArgumentException("Unsupported example");
        }
    }
}
