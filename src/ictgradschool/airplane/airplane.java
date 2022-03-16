package ictgradschool.airplane;

// create class for an airplane
public class airplane {
    private String colour;
    private double ticketPrice;
    private boolean ticketAvailable;

    public airplane() {
        colour = "white";
        ticketPrice = 123.45;
        ticketAvailable = true;
    }

    public airplane(String colour, double ticketPrice, boolean ticketAvailable) {
        this.colour = colour;
        this.ticketPrice = ticketPrice;
        this.ticketAvailable = ticketAvailable;
    }

    public String checkTicketAvailable() {
        if (ticketAvailable) {
            return "Ticket still available";
        }
        else {
            return "Ticket no longer available";
        }
    }

    public double getTicketPrice() {
        return this.ticketPrice;
    }

    public void takeOff() {
        System.out.println("The " + colour + "plane is ready for take off!");
    }

    public void setTicketAvailable(boolean updatedAvailability) {
        ticketAvailable = updatedAvailability;
    }
}



