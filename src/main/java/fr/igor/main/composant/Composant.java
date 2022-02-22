package fr.igor.main.composant;

public class Composant {
    private double price;
    private String name;
    private int id;

    public Composant(double price, String name, int id) {
        this.price = price;
        this.name = name;
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
