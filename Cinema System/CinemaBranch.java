public class CinemaBranch {
    private String cinemaName;
    private String city;
    private String address;
    private Screen[] screens;

    public CinemaBranch(String cinemaName, String city, String address, int screenCount) {
        this.cinemaName = cinemaName;
        this.city = city;
        this.address = address;
        screens = new Screen[screenCount];
        for (int i = 0; i < screenCount; i++) {
            Movie movie = new Movie("Movie " + (i+1), "Genre " + (i+1), 120 + i*10, "7:00 PM");
            screens[i] = new Screen("Cinema Screen", "Screen " + (i+1), ScreenType.Screen_2D, 5, movie);
        }
    }

    public String getCinemaName() { 
        return cinemaName; }

    public String getCity() { 
        return city; }

    public String getAddress() { 
        return address; }
        
    public Screen[] getScreens() { 
        return screens; }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Branch: ").append(cinemaName).append(", ").append(city).append(", ").append(address).append("\n");
        for (int i = 0; i < screens.length; i++) {
            stringBuilder.append(screens[i]).append("\n");
        }
        return stringBuilder.toString();
    }
}