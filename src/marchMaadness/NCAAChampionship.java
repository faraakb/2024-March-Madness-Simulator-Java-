package marchMaadness;

import java.util.ArrayList;
import java.util.HashMap;
import marchMaadness.Data;
public class NCAAChampionship extends EastRegion{
    ArrayList<String> last = new ArrayList<>();
    HashMap<String, Double> m = new HashMap<>();
    HashMap<String, String> m1 = new HashMap<>();

    public NCAAChampionship(ArrayList<String> last) {
        this.last = last;
        for (String key : last) {
            findCorrectProb(key);
        }
        m1.put(last.getFirst(), last.getLast());
    }

    public void findCorrectProb(String key) {
        Data x = new Data();
        if (x.getEastChamp().get(key) != null) {
            this.m.put(key, x.getEastChamp().get(key));
        } else if (x.getMidWestChamps().get(key) != null) {
            this.m.put(key, x.getMidWestChamps().get(key));
        } else if (x.getEastChamp().get(key) != null) {
            this.m.put(key, x.getEastChamp().get(key));
        } else {
            this.m.put(key, x.getSouthChamps().get(key));
        }
    }
    public HashMap<String, String> getM()
    {
        return this.m1;
    }

    public ArrayList<String> getTeamNames() {
        return this.last;
    }

    @Override
    public void playRound() {
        System.out.println("NCAA Championship In Progress: " + "\n");
        HashMap<String, Double> store = this.m;
        HashMap<String, String> copy = getM();
        double comp = 0.0;
        double comp2 = 0.0;
        double firstProb = 0.0;
        double secondProb = 0.0;
        double max = 0.0;
        double min = 0.0;
        double comp3 = 0.0;
        double comp4 = 0.0;
        for (String key : copy.keySet()) {
            comp = Math.random();
            comp2 = 1.0 - comp;
            firstProb = store.get(key);
            secondProb = store.get(copy.get(key));
            max = Math.max(firstProb, secondProb);
            min = Math.min(firstProb, secondProb);
            comp3 = 1.0 - max;
            comp4 = 1.0 - min;
            lastGameDrama();
            try {
                Thread.sleep(12500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (comp <= min) {
                super.onLowBoundary(store, min, copy, key);
            } else if (comp >= max) {
                super.onHiBoundary(store, max, copy, key);
            } else {
                if (comp2 >= comp3) {
                    super.leftIntersect(comp2, comp3, store, max, copy, key);
                } else if (comp2 <= comp4) {
                    super.rightIntersect(comp2, comp4, store, min, copy, key);
                }
            }
        }
    }
        public void getFinalMatchup(HashMap<String, String> m, int n)
        {
            for (String key : m.keySet()) {
                System.out.println(key + " plays " + m.get(key) + " in the NCAA Championship Game" + "\n");
            }
        }
        public void lastGameDrama()
        {
            String teamDown = "";
            double chance = Math.random();
            if (chance < .5)
            {
                teamDown = last.get(0);
            }
            else{
                teamDown = last.get(1);
            }
            System.out.println(last.get(0) + " and " + last.get(1) + " duke it out in a championship game for the ages, and a storybook ending awaits as we reach the end of the 4th... " + "\n" + "\n" +
                    teamDown + " has a chance to win it with a three at the end of regulation... " + "\n" + "\n" +
                    "The whistle is blown, the ball is inbounded, the crowd holds their breath as the " + teamDown + " player takes two dribbles, and hoists up a shot..." + "\n" + "\n" +
                    "The buzzer sounds as the ball rainbows towards the rim..."  + "\n" + "\n" + "\n");
        }
        @Override
    public String displayWinner(String winner, int n)
        {
            return winner + " IS YOUR 2024 MARCH MADNESS WINNER!!!";
        }
    }
