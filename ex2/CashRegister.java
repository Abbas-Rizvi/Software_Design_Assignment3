package ex2;

public class CashRegister {
    Product currentProd = new Product();

    Scanner scanner = new Scanner();
    Keyboard keyboard = new Keyboard();
    ProductDB db = new ProductDB();
    Display display = new Display();
    TicketPrinter printer = new TicketPrinter();

    public void setCurrentProductUPC(int UPCCode){
        currentProd.setUPC(UPCCode);
        displayCurrent();

    }

    public Product getCurrentProductInfo(){
        int upcCode = scanner.getUPCCode();
        return db.getProductInfo(upcCode);
        
    }

    public void testScanner(int upcCode){
        currentProd.setUPC(scanner.scannedUPCCode(upcCode));
        displayCurrent();
    }

    public void displayCurrent(){
        display.DisplayProduct(currentProd);
    }

    public void printTicket(){
        printer.DisplayProduct(currentProd);
    }

}
