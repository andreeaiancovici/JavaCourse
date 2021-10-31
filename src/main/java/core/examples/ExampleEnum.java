package core.examples;

public enum ExampleEnum {

    COMPARING(1),
    COMPARABLE_INTERFACE(2),
    COMPARATOR_INTERFACE(3);

    int code;

    ExampleEnum(int code) {
        this.code = code;
    }

    public static ExampleEnum getExampleEnum(int code) {
        for(ExampleEnum value : values()) {
            if(value.code == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Unsupported example code");
    }
}
