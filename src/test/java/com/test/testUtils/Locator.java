package testDemo;

public class Locator {
    private String name;
    private String by;
    private String value;
    private String desc;

    public String getName() {
        return name;
    }

    public Locator setName(String name) {
        this.name = name;
        return this;
    }

    public String getBy() {
        return by;
    }

    public Locator setBy(String by) {
        this.by = by;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Locator setValue(String value) {
        this.value = value;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Locator setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    @Override
    public String toString() {
        return "Locator{" +
                "name='" + name + '\'' +
                ", by='" + by + '\'' +
                ", value='" + value + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
