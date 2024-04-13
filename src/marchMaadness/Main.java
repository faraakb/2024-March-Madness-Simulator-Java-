package marchMaadness;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the 2024 March Madness Simulator!");
        System.out.println("Press ( W ) to begin the tournament: ");
        Scanner scan = new Scanner(System.in);
        while (true) {
            if (scan.nextLine().compareToIgnoreCase("W") < 0)
            {
                System.out.println("Please enter ( W )  to begin: ");
            }
            else{
                break;
            }
        }
        WestRegion x = new WestRegion();
        x.playRound();
        System.out.println("Is Your Team Still In The Race? Scroll Up To See The Biggest Upsets out Of The West Region!" + "\n");
        System.out.println("Press ( W ) to play The East Region" + "\n");
        while (true) {
            if (scan.nextLine().compareToIgnoreCase("W") < 0)
            {
                System.out.println("Please enter ( W )  to begin: ");
            }
            else{
                break;
            }
        }
        EastRegion y = new EastRegion();
        y.playRound();
        System.out.println("Two Regions Down, Two to Go! Is Your Team Still Alive...");
        System.out.println("Press ( W ) to play the MidWest Region" + "\n");
        while (true) {
            if (scan.nextLine().compareToIgnoreCase("W") < 0)
            {
                System.out.println("Please enter ( W )  to begin: ");
            }
            else{
                break;
            }
        }
        MidWestRegion z = new MidWestRegion();
        z.playRound();
        System.out.println("Just One Region Left to Go! Will Your Team Make It All The Way...");
        System.out.println("Press ( W ) to play the South Region" + "\n");
        while (true) {
            if (scan.nextLine().compareToIgnoreCase("W") < 0)
            {
                System.out.println("Please enter ( W )  to begin: ");
            }
            else{
                break;
            }
        }
        SouthRegion p = new SouthRegion();
        p.playRound();
        System.out.println("We've Got Our Final 4 Folks! Will Your Team Rise To The Top...");
        System.out.println("Press ( W ) to play the FINAL 4!" + "\n");
        while (true) {
            if (scan.nextLine().compareToIgnoreCase("W") < 0)
            {
                System.out.println("Please enter ( W )  to begin: ");
            }
            else{
                break;
            }
        }
        Final4 games = new Final4(y.getTeamNames(), x.getTeamNames(), p.getTeamNames(), z.getTeamNames());
        games.playRound();
        System.out.println("ONE. MORE. GAME. \nWILL YOUR TEAM REALIZE GREATNESS...... \nPress ( W ) To Find OUT...");
        while (true) {
            if (scan.nextLine().compareToIgnoreCase("W") < 0)
            {
                System.out.println("Please enter ( W )  to begin: ");
            }
            else{
                break;
            }
        }
        NCAAChampionship game = new NCAAChampionship(games.getTeamNames());
        game.playRound();
        System.out.println(" \nThank You For Playing The 2024 March Madness Simulator");
    }
}
