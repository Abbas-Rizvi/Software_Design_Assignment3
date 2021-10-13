package ex2;

public class TicketPrinter implements View {

    @Override
    public void DisplayProduct(Product product) {
        System.out.println("Ticket for" + product.getUPC() + " Was printed");                
    }
}
