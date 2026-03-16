public class Movie {

    private String title;
    private String genre;
    private int duration;
    private String showTime;

    public Movie(String title, String genre, int duration, String showTime){
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.showTime = showTime;
    }

    public String getTitle(){
        return title;
    }

    public String getGenre(){
        return genre;
    }

    public int getDuration(){
        return duration;
    }

    public String getShowTime(){
        return showTime;
    }

    public String toString(){
        return String.format("%s (%s) %d mins Show:%s", title, genre, duration, showTime);
    }
}
