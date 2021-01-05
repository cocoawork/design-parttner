package top.cocoawork.parttner.decorator.unit;

public abstract class Coffee implements Drink {

    private String name;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public Double getCost() {
        return this.price;
    }
}
