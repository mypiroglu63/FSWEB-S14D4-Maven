package org.example.model;

public class Store {

    public static void main(String[] args) {
        ProductForSale chocolate = new Chocolate("Chocolate", 10.0, "Dark Chocolate", true);
        ProductForSale coke = new Coke("Coke", 2.0, "Refreshing Drink", true);
        ProductForSale bread = new Bread("Bread", 1.5, "Whole Grain Bread", "Whole Grain");

        ProductForSale[] products = {chocolate, coke, bread};

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
      for(ProductForSale product : products) {
          product.showDetails();
      }
    }
}
