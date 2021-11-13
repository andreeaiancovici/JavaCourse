package chapter;

public enum ChapterEnum {

    COMPARING(1);

    int code;

    ChapterEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public static ChapterEnum getChapterEnum(int code) {
        for(ChapterEnum value : values()) {
            if(value.code == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Unsupported chapter code");
    }
}
