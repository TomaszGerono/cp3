package cinema_ticket;

public class CinemaTicket {
    static String CINEMA_NAME = "Morning Star Cinema";
    static String FILM_TITLE = "Gladiator";
    int row;
    int seat;
    int price;

    
    public CinemaTicket() {}

    public CinemaTicket(int row, int seat) {
        this.row = row;
        this.seat = seat;

        if (this.row <= 2) {
            this.price = 10;
        }

        else {
            this.price = 25;
        }
    }

    String display() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "CinemaTicket {" +
                "cinemaName = " + CINEMA_NAME + 
                ", filmTitle = " + FILM_TITLE + 
                ", row=" + this.row + 
                ", seat=" + this.seat +
                ", price=" + this.price +
                '}';
    }
}