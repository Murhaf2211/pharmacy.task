package org.example;

public class Medication {
    private String name;
    private double price;
    private boolean available;

    public Medication(String name, double price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
    }

    public String getName(){
        return name;
    }
    public Double getPrice(){
        return price;
    }
    public boolean getAvailability(){
        return available;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Medication{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", available=").append(available);
        sb.append('}');
        return sb.toString();
    }
}
