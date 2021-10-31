package core.examples.comparing;

import core.examples.Example;

import static cmd.Commands.*;

public class Comparing implements Example {

    @Override
    public void execute() {
        comparingPrimitives(1, 1);

        pressEnterKeyToContinue();
        //noinspection CachedNumberConstructorCall
        comparingPrimitivesWithWrapperCounterpart(1, new Integer(1));

        pressEnterKeyToContinue();
        //noinspection CachedNumberConstructorCall
        comparingWrappersCreatedWithNew(new Integer(1), new Integer(1));

        pressEnterKeyToContinue();

        comparingWrappersCreatedWithValueOf(1, 1);

        pressEnterKeyToContinue();

        comparingObjects(new Animal(2, "cat"), new Animal(2, "cat"));
    }

    @SuppressWarnings("UnnecessaryLocalVariable")
    private void comparingPrimitives(int x, int y) {
        displayTitle("Comparing Primitives");
        displayNoteToRemind("Primitive values are compared directly by their value.");

        displayInfo("primitives are byte");
        byte xByte = (byte) x;
        byte yByte = (byte) y;
        displayExample(String.format("%d == %d is %s", xByte, yByte, xByte == yByte));

        displayInfo("short");
        short xShort = (short) x;
        short yShort = (short) y;
        displayExample(String.format("%d == %d is %s", xShort, yShort, xShort == yShort));

        displayInfo("int");
        displayExample(String.format("%d == %d is %s", x, y, x == y));

        displayInfo("long");
        long xLong = x;
        long yLong = y;
        displayExample(String.format("%d == %d is %s", xLong, yLong, xLong == yLong));

        displayInfo("float");
        float xFloat = x;
        float yFloat = y;
        displayExample(String.format("%f == %f is %s", xFloat, yFloat, xFloat == yFloat));

        displayInfo("double");
        double xDouble = x;
        double yDouble = y;
        displayExample(String.format("%f == %f is %s", xDouble, yDouble, xDouble == yDouble));

        displayInfo("boolean");
        //noinspection PointlessBooleanExpression
        displayExample(String.format("%b == %b is %s", true, true, true == true));

        displayInfo("char");
        char xChar = (char) x;
        char yChar = (char) y;
        displayExample(String.format("%c == %c is %s", xChar, yChar, xChar == yChar));
    }

    private void comparingPrimitivesWithWrapperCounterpart(int x, Integer y) {
        displayTitle("Comparing Primitives with Wrapper counterpart");
        displayNoteToRemind("Values are compared directly due to auto-unboxing applied to the wrapper.");
        displayExample(String.format("%d == %d is %s", x, y, x == y));
    }

    private void comparingWrappersCreatedWithNew(Integer x, Integer y) {
        displayTitle("Comparing Wrappers created with new");
        displayNoteToRemind("== will compare wrapper object address.");
        displayNoteToRemind("equals will compare un-boxed wrapper object value.");

        displayInfo("==");
        //noinspection NumberEquality
        displayExample(String.format("%d == %d is %s", x, y, x == y));

        displayInfo("equals");
        displayExample(String.format("%d.equals(%d) is %s", x, y, x.equals(y)));
    }

    @SuppressWarnings("NumberEquality")
    private void comparingWrappersCreatedWithValueOf(int x, int y) {
        displayTitle("Comparing Wrappers created with valueOf");
        displayNoteToRemind("valueOf returns the same object from internal cache for: Byte, Short, Integer, Long, Boolean");
        displayNoteToRemind("valueOf returns a new object for: Float, Double");

        displayInfo("Byte");
        Byte xByteWithValueOf = Byte.valueOf((byte) x);
        Byte yByteWithValueOf = Byte.valueOf((byte) y);
        displayExample(String.format("%d == %d is %s", xByteWithValueOf, yByteWithValueOf, xByteWithValueOf == yByteWithValueOf));

        displayInfo("Short");
        Short xShortWithValueOf = Short.valueOf((short) x);
        Short yShortWithValueOf = Short.valueOf((short) y);
        displayExample(String.format("%d == %d is %s", xShortWithValueOf, yShortWithValueOf, xShortWithValueOf == yShortWithValueOf));

        displayInfo("Integer");
        Integer xIntegerWithValueOf = Integer.valueOf(x);
        Integer yIntegerWithValueOf = Integer.valueOf(y);
        displayExample(String.format("%d == %d is %s", xIntegerWithValueOf, yIntegerWithValueOf, xIntegerWithValueOf == yIntegerWithValueOf));

        displayInfo("Long");
        Long xLongWithValueOf = Long.valueOf(x);
        Long yLongWithValueOf = Long.valueOf(y);
        displayExample(String.format("%d == %d is %s", xLongWithValueOf, yLongWithValueOf, xLongWithValueOf == yLongWithValueOf));

        displayInfo("Float");
        Float xFloatWithValueOf = Float.valueOf(x);
        Float yFloatWithValueOf = Float.valueOf(y);
        displayExample(String.format("%f == %f is %s", xFloatWithValueOf, yFloatWithValueOf, xFloatWithValueOf == yFloatWithValueOf));

        displayInfo("Double");
        Double xDoubleWithValueOf = Double.valueOf(x);
        Double yDoubleWithValueOf = Double.valueOf(y);
        displayExample(String.format("%f == %f is %s", xDoubleWithValueOf, yDoubleWithValueOf, xDoubleWithValueOf == yDoubleWithValueOf));

        displayInfo("Boolean");
        Boolean xBooleanWithValueOf = Boolean.valueOf(true);
        Boolean yBooleanWithValueOf = Boolean.valueOf(true);
        displayExample(String.format("%b == %b is %s", xBooleanWithValueOf, yBooleanWithValueOf, xBooleanWithValueOf == yBooleanWithValueOf));

        displayInfo("Character");
        Character xCharacterWithValueOf = Character.valueOf((char) x);
        Character yCharacterWithValueOf = Character.valueOf((char) y);
        displayExample(String.format("%c == %c is %s", xCharacterWithValueOf, yCharacterWithValueOf, xCharacterWithValueOf == yCharacterWithValueOf));
    }

    private void comparingObjects(Animal x, Animal y) {
        displayTitle("Comparing Objects");
        displayNoteToRemind("Shallow comparison uses object address.");
        displayNoteToRemind("Deep comparison (equals) uses object properties.");
        displayNoteToRemind("Object.equals is used for comparing properties easy when overriding.");


        displayInfo("null");
        displayExample(String.format("%s == %s is %s", null, null, null == null));

        displayInfo("shallow");
        displayExample(String.format("%s == %s is %s", x, y, x == y));

        displayInfo("deep");
        displayExample(String.format("%s.equals(%s) is %s", x, y, x.equals(y)));

        displayInfo("Object.equals(name, this.name) instead of name == null ? that.name == null : name.equals(that.name);");
    }
}