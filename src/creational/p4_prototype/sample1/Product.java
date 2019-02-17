package creational.p4_prototype.sample1;

public abstract class Product
        implements Cloneable      // todo: comment it out and explain result: why we've got the exception?
{

    private String SKU;
    private String description;

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String string) {
        description = string;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String string) {
        SKU = string;
    }
}
