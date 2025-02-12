public enum Players {
    One("R", 1, "red"),
    Two("Y", 2, "yellow"),
    Three("G", 3, "green"),
    Four("B", 4, "blue");

    private final String value;
    private final int index;
    private final String valueLong;

    Players(String value, int index, String valueLong) {
        this.value = value;
        this.index = index;
        this.valueLong = valueLong;
    }

    public String getValue() {
        return this.value;
    }

    public int getNumber() {
        return this.index;
    }

    public String getValueLong() {
        return this.valueLong;
    }
}