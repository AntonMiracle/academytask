package magicnumber;

public enum MyExtension {
    JPG(0xFFD8FFE0,
            "jpg")
    , TXT(0x464F524D, "txt"), UNKNOWN(0, "");

    private final int start;
    private final String name;

    public int getStart() {
        return this.start;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    MyExtension(int start, String name) {
        this.start = start;
        this.name = name.toLowerCase();
    }
}
