package magicnumber;

public enum Extension {
    JPG(0xFFD8FFE0), TXT(0x464F524D);

    private final int start;

    public int getStart() {
        return this.start;
    }

    private Extension(int start) {
        this.start = start;
    }
}
