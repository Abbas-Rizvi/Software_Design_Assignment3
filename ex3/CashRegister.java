package ex3;

import java.util.ArrayList;

public class CashRegister extends Notifications {

    //create components
    Product currentProd = new Product();

    Scanner scanner = new Scanner();
    Keyboard keyboard = new Keyboard();
    ProductDB db = new ProductDB();
    Observers display = new Display();
    Observers printer = new TicketPrinter();

    //create list for observers
    ArrayList<Observers> obsList = new ArrayList<Observers>();

    //settings current upc
    public void setCurrentProductUPC(int UPCCode){
        currentProd.setUPC(UPCCode);
        notifyObservers();

    }

    //get upc from scanner
    public Product getCurrentProductInfo(){
        int upcCode = scanner.getUPCCode();
        return db.getProductInfo(upcCode);
        
    }

    //test code for scanner
    public void testScanner(int upcCode){
        currentProd.setUPC(scanner.scannedUPCCode(upcCode));
        notifyObservers();
    }

    //function to notify observers ie display
    @Override
    void notifyObservers() {
        for (Observers observer : obsList) {
            observer.DisplayProduct(currentProd);
        }
        
    }

    //add observers to list
    public void initalizeObservers(){
        obsList.add(display);   
        obsList.add(printer);

    }

}
