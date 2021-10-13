package ex2;

public class Display implements View{

    @Override
    public void DisplayProduct(Product product) {
        System.out.println(product.getUPC());        
    }
}
