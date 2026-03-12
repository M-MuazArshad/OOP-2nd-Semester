public class Demo {
    public static void main(String[] args) {
        String[] names = {"Shahid", "Hassan", "Abu Bakr"};
        Game game1 = new Game(names);
        game1.playGame(5);  
        System.out.println(); 
        System.out.println("Final Scores:");
        System.out.println(game1);
        game1.printWinner();
    }
}