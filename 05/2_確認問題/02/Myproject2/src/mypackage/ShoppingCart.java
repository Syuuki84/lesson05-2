package mypackage;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> items;
    private static final int CART_CAPACITY = 10;
 
    public ShoppingCart() {
        items = new ArrayList<>();
    }

   
    public void addItem(Product product) { 
    	if (items.size() < CART_CAPACITY) { 
    		items.add(product);
    } else { 
    	System.out.println("カートがいっぱいです。商品を追加できません。"); }
    }

    
    public double getTotalPrice() {
        double total = 0.0;
        for (Product item : items) {
        	total += item.getPrice();
        }
        return total;
    }
}

