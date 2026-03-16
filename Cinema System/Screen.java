public class Screen {
    private String name;
    private String id;
    private ScreenType type;
    private String[] rows = {"A","B","C","D","E","F","G","H","I","J"};
    private Seat[][] seats;
    private Movie movie;

    public Screen(String name, String id, ScreenType type, int rowCount, Movie movie) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.movie = movie;
        seats = new Seat[rowCount][];
        for (int i = 0; i < rowCount; i++) {
            seats[i] = new Seat[5 + i * 2]; // front rows fewer seats
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = new Seat(getSeatType(rows[i]), rows[i], j+1);
            }
        }
    }

    public String getName() { 
        return name; }

    public String getId() { 
        return id; }

    public ScreenType getType() { 
        return type; }

    public Seat[][] getSeats() { 
        return seats; }

    public Movie getMovie() { 
        return movie; }

    public SeatType getSeatType(String row) {
        if (row.equals("A") || row.equals("B")) return SeatType.VIP;
        else if (row.equals("C") || row.equals("D")) return SeatType.PREMIUM;
        else return SeatType.REGULAR;
    }

    public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("\nScreen: ").append(name).append(" (").append(id).append(") - ").append(type).append("\nMovie: ").append(movie).append("\n");
    for (int i = 0; i < seats.length; i++) {
        for (int j = 0; j < seats[i].length; j++) {
            stringBuilder.append(seats[i][j]).append(" ");
        }
        stringBuilder.append("\n"); 
    }

    return stringBuilder.toString();
}
}

enum ScreenType {
    Screen_2D, Screen_3D, Screen_IMAX
}