import java.io.IOException;

public class Cinema {
    public static void main(String[] args) throws IOException {
        TicketManager manager = new TicketManager();

        manager.addTicket(new MovieTicket("Avengers", "2025-05-01", "A1"));
        manager.addTicket(new MovieTicket("Avengers", "2025-05-01", "A2"));
        manager.addTicket(new MovieTicket("Avengers", "2025-05-01", "A1")); // ซ้ำ

        manager.addTicket(new MovieTicket("Titanic", "2025-05-02", "B1"));
        manager.addTicket(new MovieTicket("Titanic", "2025-05-02", "B2"));
        manager.addTicket(new MovieTicket("Titanic", "2025-05-02", "B3"));

        manager.addTicket(new MovieTicket("FastX", "2025-05-03", "C1"));
        manager.addTicket(new MovieTicket("FastX", "2025-05-03", "C2"));
        manager.addTicket(new MovieTicket("FastX", "2025-05-03", "C2")); // ซ้ำ
        manager.addTicket(new MovieTicket("FastX", "2025-05-03", "C3"));

        manager.displayAllBookings();
        manager.saveToFile("bookings.txt");
        System.out.println("All bookings saved to bookings.txt");
    }
}