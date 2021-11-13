package chapter;

import chapter.impl.Comparing;

public class ChapterFactory {

    public Chapter getChapter(ChapterEnum chapterEnum) {
        if (chapterEnum == null) {
            throw new IllegalArgumentException("Unsupported chapter");
        }
        switch (chapterEnum) {
            case COMPARING:
                return new Comparing();
            default:
                throw new IllegalArgumentException("Unsupported example");
        }
    }
}
