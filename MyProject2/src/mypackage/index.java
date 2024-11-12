package mypackage;

public class index {
    public static void main(String[] args) {
        
        ShoppingCart cart = new ShoppingCart();

        
        cart.addItem(new Product("商品A", 50.0));
        cart.addItem(new Product("商品B", 30.0));
        cart.addItem(new Product("商品C", 20.0));

  
        System.out.println("ショッピングカートの合計金額: $" + cart.getTotalPrice());
    }
}
