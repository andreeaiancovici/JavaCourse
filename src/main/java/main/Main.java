package main;

import chapter.ChapterEnum;
import chapter.ChapterFactory;

import static cmd.Commands.displayChapter;
import static cmd.Commands.getInteger;

public class Main {

    public static void main(String[] args) {
        ChapterFactory chapterFactory = new ChapterFactory();

        displayChapter();

        int option = getInteger();

        chapterFactory.getChapter(ChapterEnum.getChapterEnum(option))
                .display();
    }
}
