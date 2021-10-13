package ex1;

public class CashRegister {
    Product currentProd = new Product();

    Scanner scanner = new Scanner();
    Keyboard keyboard = new Keyboard();
    ProductDB db = new ProductDB();
    Display display = new Display();
    TicketPrinter printer = new TicketPrinter();

    //set the product info
    public void setCurrentProductUPC(int UPCCode){
        currentProd.setUPC(UPCCode);

        //send to views
        displayCurrent();
        printTicket();

    }

    //get infor from current product
    public Product getCurrentProductInfo(){
        int upcCode = scanner.getUPCCode();
        return db.getProductInfo(upcCode);
        
    }

    public void testScanner(int upcCode){
        currentProd.setUPC(scanner.scannedUPCCode(upcCode));
        
        //send to views
        displayCurrent();
        printTicket();

    }

    //send current product to display
    public void displayCurrent(){
        display.displayText(String.valueOf(currentProd.getUPC()));
    }

    //send current product to ticketPrinter
    public void printTicket(){
        printer.displayText(String.valueOf(currentProd.getUPC()));
    }

}
