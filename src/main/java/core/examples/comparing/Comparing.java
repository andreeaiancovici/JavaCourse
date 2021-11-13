package core.examples.comparing;

import core.examples.Example;

import static cmd.Commands.*;

public class Comparing implements Example {

    @Override
    public void execute() {
        comparingPrimitives(1, 1);
        comparingBooleanPrimitives(true, true);

        pressEnterKeyToContinue();

        comparingPrimitiveWithWrapperCounterpart(1, 1);

        pressEnterKeyToContinue();

        comparingWrappersCreatedWithNew(1, 1);

        pressEnterKeyToContinue();

        comparingWrappersCreatedWithValueOf(1, 1);
        comparingBooleanWrappersCreatedWithValueOf(true, true);

        pressEnterKeyToContinue();

        comparingObjects(new Animal(2, "cat"), new Animal(2, "cat"));
    }

    @SuppressWarnings("UnnecessaryLocalVariable")
    private void comparingPrimitives(int x, int y) {
        displayTitle("Comparing Primitives");
        displayNoteToRemind("Primitive values are compared directly by their value.");

        byte xByte = (byte) x;
        byte yByte = (byte) y;
        displayInfo(String.format("byte x = %d compared to byte y = %d", xByte, yByte));
        displayExample(String.format("%d == %d is %s", xByte, yByte, xByte == yByte));

        short xShort = (short) x;
        short yShort = (short) y;
        displayInfo(String.format("short x = %d compared to short y = %d", xShort, yShort));
        displayExample(String.format("%d == %d is %s", xShort, yShort, xShort == yShort));

        displayInfo(String.format("int x = %d compared to int y = %d", x, y));
        displayExample(String.format("%d == %d is %s", x, y, x == y));

        long xLong = x;
        long yLong = y;
        displayInfo(String.format("long x = %d compared to long y = %d", xLong, yLong));
        displayExample(String.format("%d == %d is %s", xLong, yLong, xLong == yLong));

        float xFloat = x;
        float yFloat = y;
        displayInfo(String.format("float x = %f compared to float y = %f", xFloat, yFloat));
        displayExample(String.format("%f == %f is %s", xFloat, yFloat, xFloat == yFloat));

        double xDouble = x;
        double yDouble = y;
        displayInfo(String.format("double x = %f compared to double y = %f", xDouble, yDouble));
        displayExample(String.format("%f == %f is %s", xDouble, yDouble, xDouble == yDouble));

        char xChar = (char) x;
        char yChar = (char) y;
        displayInfo(String.format("char x = %c compared to char y = %c", xChar, yChar));
        displayExample(String.format("%c == %c is %s", xChar, yChar, xChar == yChar));
    }

    private void comparingBooleanPrimitives(boolean x, boolean y) {
        displayInfo(String.format("boolean x = %b compared to boolean y = %b", x, y));
        displayExample(String.format("%b == %b is %s", x, y, x == y));
    }

    private void comparingPrimitiveWithWrapperCounterpart(int x, int y) {
        displayTitle("Comparing Primitives with Wrapper counterpart");
        displayNoteToRemind("When comparing a primitive with its wrapper counterpart, values are compared directly due to auto-unboxing applied to the wrapper.");
        //noinspection CachedNumberConstructorCall
        Integer yWrapper = new Integer(y);
        displayInfo(String.format("int x = %d compared to Integer y = new Integer(%d)", x, yWrapper));
        displayExample(String.format("%d == %d is %s", x, yWrapper, x == yWrapper));
    }

    @SuppressWarnings("CachedNumberConstructorCall")
    private void comparingWrappersCreatedWithNew(int x, int y) {
        displayTitle("Comparing Wrappers created with new");
        displayNoteToRemind("The == operator will compare wrapper objects addresses.");
        displayNoteToRemind("The equals() method will compare un-boxed wrapper objects values.");

        Integer xWrapper = new Integer(x);
        Integer yWrapper = new Integer(y);

        displayInfo(String.format("Integer x = new Integer(%d) compared to Integer y = new Integer(%d) using == operator", xWrapper, yWrapper));
        //noinspection NumberEquality
        displayExample(String.format("%d == %d is %s", xWrapper, yWrapper, xWrapper == yWrapper));

        displayInfo(String.format("Integer x = new Integer(%d) compared to Integer y = new Integer(%d) using equals() method", xWrapper, yWrapper));
        displayExample(String.format("%d.equals(%d) is %s", xWrapper, yWrapper, xWrapper.equals(yWrapper)));
    }

    @SuppressWarnings("NumberEquality")
    private void comparingWrappersCreatedWithValueOf(int x, int y) {
        displayTitle("Comparing Wrappers created with valueOf");
        displayNoteToRemind("The valueOf() method returns the same object from internal cache for: Byte, Short, Integer, Long, Boolean.");
        displayNoteToRemind("The above statement doesn't apply for: Float, Double. We can see these exceptions in the examples.");

        Byte xByteWithValueOf = Byte.valueOf((byte) x);
        Byte yByteWithValueOf = Byte.valueOf((byte) y);
        displayInfo(String.format("Byte x = Byte.valueOf(%d) compared to Byte y = Byte.valueOf(%d)", (byte) x, (byte) y));
        displayExample(String.format("%d == %d is %s", xByteWithValueOf, yByteWithValueOf, xByteWithValueOf == yByteWithValueOf));

        Short xShortWithValueOf = Short.valueOf((short) x);
        Short yShortWithValueOf = Short.valueOf((short) y);
        displayInfo(String.format("Short x = Short.valueOf(%d) compared to Short y = Short.valueOf(%d)", (short) x, (short) y));
        displayExample(String.format("%d == %d is %s", xShortWithValueOf, yShortWithValueOf, xShortWithValueOf == yShortWithValueOf));

        Integer xIntegerWithValueOf = Integer.valueOf(x);
        Integer yIntegerWithValueOf = Integer.valueOf(y);
        displayInfo(String.format("Integer x = Integer.valueOf(%d) compared to Integer y = Integer.valueOf(%d)", x, y));
        displayExample(String.format("%d == %d is %s", xIntegerWithValueOf, yIntegerWithValueOf, xIntegerWithValueOf == yIntegerWithValueOf));

        Long xLongWithValueOf = Long.valueOf(x);
        Long yLongWithValueOf = Long.valueOf(y);
        displayInfo(String.format("Long x = Long.valueOf(%d) compared to Long y = Long.valueOf(%d)", x, y));
        displayExample(String.format("%d == %d is %s", xLongWithValueOf, yLongWithValueOf, xLongWithValueOf == yLongWithValueOf));

        Float xFloatWithValueOf = Float.valueOf(x);
        Float yFloatWithValueOf = Float.valueOf(y);
        displayInfo(String.format("Float x = Float.valueOf(%d) compared to Float y = Float.valueOf(%d)", x, y));
        displayExample(String.format("%f == %f is %s", xFloatWithValueOf, yFloatWithValueOf, xFloatWithValueOf == yFloatWithValueOf));

        Double xDoubleWithValueOf = Double.valueOf(x);
        Double yDoubleWithValueOf = Double.valueOf(y);
        displayInfo(String.format("Double x = Double.valueOf(%d) compared to Double y = Double.valueOf(%d)", x, y));
        displayExample(String.format("%f == %f is %s", xDoubleWithValueOf, yDoubleWithValueOf, xDoubleWithValueOf == yDoubleWithValueOf));

        Character xCharacterWithValueOf = Character.valueOf((char) x);
        Character yCharacterWithValueOf = Character.valueOf((char) y);
        displayInfo(String.format("Character x = Character.valueOf(%c) compared to Character y = Character.valueOf(%c)", (char) x, (char) y));
        displayExample(String.format("%c == %c is %s", xCharacterWithValueOf, yCharacterWithValueOf, xCharacterWithValueOf == yCharacterWithValueOf));
    }

    private void comparingBooleanWrappersCreatedWithValueOf(boolean x, boolean y) {
        Boolean xBooleanWithValueOf = Boolean.valueOf(x);
        Boolean yBooleanWithValueOf = Boolean.valueOf(y);
        displayInfo(String.format("Boolean x = Boolean.valueOf(%b) compared to Boolean y = Boolean.valueOf(%b)", x, y));
        displayExample(String.format("%b == %b is %s", xBooleanWithValueOf, yBooleanWithValueOf, xBooleanWithValueOf == yBooleanWithValueOf));
    }

    private void comparingObjects(Animal x, Animal y) {
        displayTitle("Comparing Objects");
        displayNoteToRemind("Shallow comparison uses objects addresses.");
        displayNoteToRemind("Deep comparison (using equals() method) uses objects properties. By default, if equals() method is not overridden it will compare objects addresses.");
        displayNoteToRemind("Object.equals() method is used for comparing properties easy when overriding.");

        displayInfo("null compared to null");
        displayExample(String.format("%s == %s is %s", null, null, null == null));

        displayInfo("Objects compared using == operator (shallow)");
        displayExample(String.format("%s == %s is %s", x, y, x == y));

        displayInfo("Objects compared using equals (deep)");
        displayExample(String.format("%s.equals(%s) is %s", x, y, x.equals(y)));
    }
}