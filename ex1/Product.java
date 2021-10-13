package ex1;

public class Product {
    String name;
    int upcCode;

    public Product(){
    }

    public Product(String name, int upcCode){
        this.name = name;
        this.upcCode = upcCode;
    }

    public int getUPC() {
        return upcCode;
    }
    public void setUPC(int upc){
        this.upcCode = upc;
    }
    
}
