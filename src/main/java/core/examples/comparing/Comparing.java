package core.examples.comparing;

public class Comparing {
    public static final String LIGHT_BULB = "\uD83D\uDCA1";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        int x = 1, y = 1;
        Integer xWithNew = new Integer(x), yWithNew = new Integer(y);
        Integer xWithValueOf = Integer.valueOf(x), yWithValueOf = Integer.valueOf(y);
        Animal xAnimal = new Animal(2, "cat"), yAnimal = new Animal(2, "cat");

        System.out.println(LIGHT_BULB + " Comparing primitives means comparing directly the values");
        System.out.println(ANSI_RED + "Values are compared directly" + ANSI_RESET);
        System.out.printf("byte: %d == %d is %s\n", (byte) x, (byte) y, (byte) x == (byte) y);
        System.out.printf("short: %d == %d is %s\n", (short) x, (short) y, (short) x == (short) y);
        System.out.printf("int: %d == %d is %s\n", x, y, x == y);
        System.out.printf("long: %d == %d is %s\n", (long) x, (long) y, (long) x == (long) y);
        System.out.printf("float: %f == %f is %s\n", (float) x, (float) y, (float) x == (float) y);
        System.out.printf("double: %f == %f is %s\n", (double) x, (double) y, (double) x == (double) y);
        System.out.printf("boolean: %b == %b is %s\n", true, true, true == true);
        System.out.printf("char: %c == %c is %s\n", (char) x, (char) y, (char) x == (char) y);

        System.out.println("\n" + LIGHT_BULB + " Comparing primitives with wrapper counterpart");
        System.out.println(ANSI_RED + "Values are compared directly due to auto-unboxing applied to the wrapper" + ANSI_RESET);
        System.out.printf("%d == %d is %s\n", x, yWithNew, x == yWithNew);

        System.out.println("\n" + LIGHT_BULB + " Comparing wrapper objects created with new");
        System.out.println(ANSI_RED + "Address is compared here" + ANSI_RESET);
        System.out.printf("%d == %d is %s\n", xWithNew, yWithNew, xWithNew == yWithNew);

        System.out.println("\n" + LIGHT_BULB + " Comparing wrapper objects created with valueOf");
        System.out.println(ANSI_RED + "valueOf returns the same object from and internal cache" + ANSI_RESET);
        System.out.println(ANSI_RED + "The same logic applies for String" + ANSI_RESET);
        System.out.printf("%d == %d is %s\n", xWithValueOf, yWithValueOf, xWithValueOf == yWithValueOf);

        System.out.println("\n" + LIGHT_BULB + " Comparing wrapper objects created with new");
        System.out.println(ANSI_RED + "Equals will compare un-boxed wrapper value" + ANSI_RESET);
        System.out.printf("%d.equals(%d) is %s\n", xWithNew, yWithNew, xWithNew.equals(yWithNew));

        System.out.println("\n" + LIGHT_BULB + " Comparing null");
        System.out.printf("%s == %s is %s\n", null, null, null == null);

        System.out.println("\n" + LIGHT_BULB + " Comparing objects");
        System.out.println(ANSI_RED + "Address is compared here (shallow)" + ANSI_RESET);
        System.out.printf("%s == %s is %s\n", xAnimal, yAnimal, xAnimal == yAnimal);

        System.out.println("\n" + LIGHT_BULB + " Comparing objects");
        System.out.println(ANSI_RED + "Properties are compared here (deep)" + ANSI_RESET);
        System.out.printf("%s.equals(%s) is %s\n", xAnimal, yAnimal, xAnimal.equals(yAnimal));

        System.out.println("\n" + LIGHT_BULB + " Static Objects.equals");
        System.out.println(ANSI_RED + "Object.equals(name, this.name) is used for comparing properties easy when overriding " +
                "(instead of name == null ? that.name == null : name.equals(that.name);)" + ANSI_RESET);

        System.out.println("\n" + LIGHT_BULB + " Comparable Interface");
        //TODO
    }
}