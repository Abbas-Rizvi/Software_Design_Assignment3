package ex3;

//use abstract class for observer functions
public class Display extends Observers {


    @Override
    void DisplayProduct(Product product) {
        System.out.println(product.getUPC());
    }
}
