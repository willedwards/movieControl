package demo;

public enum ParentalControlLevels {
    LEVEL_U,
    LEVEL_12,
    LEVEL_PG,
    LEVEL_15,
    LEVEL_18;//order is important

    @Override
    public String toString(){
        return this.name();
    }
}
