package SAO.Andruha.play.Enum;

public enum ProcessorType implements Describable {
    BIT_32("bit_32"),
    BIT_64("bit-64");
    private String name;

    ProcessorType(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return name + " description";
    }
}

