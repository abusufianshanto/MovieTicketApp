import java.util.Random;

public class Ticket {
    private long ticketNumber;

    public long getTicketNumber() {
        return setTicketNumberGen();
    }

    public int setTicketNumberGen() {
        Random random = new Random();
        int firstDigit = 1000;
        int lastDigit = 100000;
        int ticketNumberGenr = random.nextInt(80001) + 10000;
        return ticketNumberGenr;
    }


}
