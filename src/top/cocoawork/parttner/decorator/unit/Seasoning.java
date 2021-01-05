package top.cocoawork.parttner.decorator.unit;

public abstract class Seasoning implements Drink {

    private Drink drink;

    private String name;
    private Double price;

    public Drink getCoffee() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

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
        return this.price + drink.getCost();
    }
}
