package ex3;
//use abstract class for observer functions
public class TicketPrinter extends Observers{

    @Override
    void DisplayProduct(Product product) {
        System.out.println("Ticket for" + product.getUPC() + " Was printed");
    }
}
