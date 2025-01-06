package VendingMachine;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Inventory {
    private final Map<Product,Integer> products;

    public Inventory(){
        products = new ConcurrentHashMap<>();
    }

    public void addPoduct(Product product,int quality){
        products.put(product,quality);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public void updateQuantity(Product product,int quantity){
        products.put(product,quantity);
    }

    public int getQuantity(Product product){
        return products.getOrDefault(product,0);
    }

    public boolean isAvailable(Product product){
        return products.containsKey(product) && products.get(product)>0;
    }

}
