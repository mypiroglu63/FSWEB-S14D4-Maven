package org.example.model;

public class Chocolate extends ProductForSale {

    private boolean withMilk;

    // Constructor
    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, boolean withMilk) {
        super(type, price, description);
        this.withMilk = withMilk;
    }

    public boolean isWithMilk() {
        return withMilk;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate{" +
                "withMilk=" + withMilk +
                ", type=" + getType() +
                ", price=" + getPrice() +
                ", description=" + getDescription() +
                '}');
    }
}
