package lang.immutable.address;

public class Address {
    private String structure;

    public Address(String structure) {
        this.structure = structure;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    @Override
    public String toString() {
        return "Address{" + "structure='" + structure + '\'' + '}';
    }
}
