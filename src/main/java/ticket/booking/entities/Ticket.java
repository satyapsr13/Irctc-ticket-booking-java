package ticket.booking.entities;

import java.util.Date;

public class Ticket {
    private String ticketId;
    private String source;
    private String destination;

    private Date dateOfArrival;
    private Train train;


    // No-argument constructor
    public Ticket() {
    }

    // All-argument constructor
    public Ticket(String ticketId, String source, String destination, Date dateOfArrival, Train train) {
        this.ticketId = ticketId;
        this.source = source;
        this.destination = destination;
        this.dateOfArrival = dateOfArrival;
        this.train = train;
    }

    // Getters
    public String getTicketId() {
        return ticketId;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public Date getDateOfArrival() {
        return dateOfArrival;
    }

    public Train getTrain() {
        return train;
    }

    // Setters
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDateOfArrival(Date dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    // Custom method to return ticket info as string
    public String getTicketInfo() {
        return "TicketID: " + ticketId +
                ", Source: " + source +
                ", Destination: " + destination +
                ", Arrival Date: " + dateOfArrival +
                ", Train: " + (train != null ? train.getTrainNo() : "N/A");
    }
}
