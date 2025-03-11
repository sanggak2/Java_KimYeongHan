package map.ex.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();
    public void add(Product product, int i) {
        int existing = cartMap.getOrDefault(product, 0);
        cartMap.put(product, existing + i);
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품: "+entry.getKey() + ", 수량: " + entry.getValue());
        }
    }

    public void minus(Product product, int i) {
        int existing = cartMap.getOrDefault(product, 0);
        int minas = existing - i;

        if(minas <= 0) cartMap.remove(product);
        else cartMap.put(product, minas);
    }
}
