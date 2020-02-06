public enum Value {
    ACE (1, 14),
    TWO (2),
    THREE (3),
    FOUR (4),
    FIVE (5),
    SIX (6),
    SEVEN (7),
    EIGHT (8),
    NINE (9),
    TEN (10),
    KNIGHT (11),
    QUEEN (12),
    KING (13);

    private final int numericValue;
    private int aceValue;

    Value(int numericValue) {
        this.numericValue = numericValue;
    }

    Value(int numericValue, int aceValue) {
        this.numericValue = numericValue;
        this.aceValue = aceValue;
    }

    public int getNumericValue() {
        return numericValue;
    }

    public int getAceValue() {
        return aceValue;
    }

    public void setAceValue(int aceValue) {
        this.aceValue = aceValue;
    }
}

