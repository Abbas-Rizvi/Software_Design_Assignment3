package ex2;

import java.util.ArrayList;

public class ProductDB {

    ArrayList<Product> products = new ArrayList<Product>();

    public Product getProductInfo(int upcCode){
        for (Product product: products){
            if (product.getUPC() == upcCode)
                return product;
        }

        return null;
    }

}
