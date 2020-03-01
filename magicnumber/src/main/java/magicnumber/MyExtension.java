package magicnumber;

public enum MyExtension {
    JPG(new int[]{0xFF, 0xD8, 0xFF, 0xE0}, "jpg"), TXT(new int[]{0x46, 0x4F, 0x52, 0x4D}, "txt"), UNKNOWN(new int[1], "");

    private final int[] start;
    private final String name;

    public int[] getStart() {
        return this.start;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    MyExtension(int[] start, String name) {
        this.start = start;
        this.name = name.toLowerCase();
    }
}
