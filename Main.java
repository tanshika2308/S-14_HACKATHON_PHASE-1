import java.util.Scanner;

class MovieTicket {
    String movieName;
    double ticketPrice;
    int numberOfTickets;

    MovieTicket(String name, double price, int tickets) {
        movieName = name;
        ticketPrice = price;
        numberOfTickets = tickets;
    }

    double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 10 / 100;
        }
        return 0;
    }

    double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    void displayBill() {
        System.out.println("Movie: " + movieName);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Tickets: " + numberOfTickets);
        System.out.println("Total: " + calculateTotal());
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Final Amount: " + calculateFinalAmount());
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter movie name:");
        String movie = sc.nextLine();

        System.out.println("Enter ticket price:");
        double price = sc.nextDouble();

        System.out.println("Enter number of tickets:");
        int tickets = sc.nextInt();

        MovieTicket m = new MovieTicket(movie, price, tickets);

        m.displayBill();
        sc.close();
    }
}
