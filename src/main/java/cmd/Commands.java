package cmd;

import java.util.List;
import java.util.Scanner;

import static common.Color.*;
import static common.Emoji.LIGHT_BULB;

public class Commands {

    private static final Scanner console = new Scanner(System.in);
    private static final String TITLE_FORMAT = LIGHT_BULB + " %s%n";
    private static final String NOTE_FORMAT = ANSI_RED + "%s" + ANSI_RESET + "%n";
    private static final String INFO_FORMAT = ANSI_BLUE + "%s" + ANSI_RESET + "%n";

    public static void displayCategory() {
        System.out.println("Choose one of the following topics to learn about:");

        System.out.println("1. Comparing");
        System.out.println("2. Comparable Interface");
        System.out.println("3. Comparator Interface");
    }

    public static int getInteger() {
        return console.nextInt();
    }

    public static String getInput() {
        return console.next();
    }

    public static void displayTitle(String title) {
        System.out.printf(TITLE_FORMAT, title);
    }

    public static void displayNoteToRemind(String note) {
        System.out.printf(NOTE_FORMAT, note);
    }

    public static void displayInfo(String info) {
        System.out.println();
        System.out.printf(INFO_FORMAT, info);
    }

    public static void displayExample(String example) {
        System.out.println(example);
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static void pressEnterKeyToContinue() {
        System.out.println();
        System.out.println("Press Enter key to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void display(List<?> objects) {
        for (int i = 0; i < objects.size() - 1; i++) {
            System.out.print(objects.get(i));
            System.out.print(", ");
        }
        System.out.print(objects.get(objects.size() - 1));
    }
}
