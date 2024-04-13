package marchMaadness;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import marchMaadness.Data;

public class WestRegion extends EastRegion{
private static int numOfRounds = 0;
private ArrayList<String> westNames;
private HashMap<String, String> w = new HashMap<>();
public WestRegion() {
    this.westNames = new ArrayList<>(Arrays.asList("North Carolina (1)", "Wagner (16)", "Mississippi St. (8)", "MSU (9)", "Saint Mary's (5)", "Grand Canyon (12)", "Alabama (4)", "Charleston (13)", "Clemson (6)", "New Mexico (11)", "Baylor (3)", "Colgate (14)", "Dayton (7)", "Nevada (10)", "Arizona (2)", "Long Beach St. (15)"));
    for (int x = 0; x < westNames.size() - 1; x += 2) {
        this.w.put(westNames.get(x), westNames.get(x + 1));
    }
}

@Override
public ArrayList<String> getTeamNames()
    {
        return this.westNames;
    }
    @Override
    public HashMap<String, String> getM()
    {
        return this.w;
    }
    @Override
    public void setM(HashMap<String, String> newM)
    {
        this.w = newM;
    }
    @Override
    public HashMap<String, Double> constructNextRound(ArrayList<String> names, int n)
    {
        HashMap<String, Double> r = new HashMap<>();
        HashMap<String, Double> newRound = new HashMap<>();
        Data x = new Data();
        if (n==2)
        {
            newRound = x.getWestRound2();
        }
        if (n==3)
        {
            newRound = x.getWestSweet16();
        }
        if (n==4)
        {
            newRound = x.getWestElite8();
        }
        for (int k = 0; k<names.size(); k++)
        {
            if (!r.containsKey(names.get(k)))
            {
                r.put(names.get(k), newRound.get(names.get(k)));
            }
        }
        return r;
    }
    @Override
    public void playRound() {
        System.out.println("West Region Loading..." + "\n");
        while (true) {
            getCurrentMatchUp(getM(), getNumOfRounds());
            numOfRounds += 1;
            HashMap<String, Double> store = new HashMap<>();
            HashMap<String, String> copy = new HashMap<>();
            if (numOfRounds!=1) {
                store = constructNextRound(getTeamNames(), getNumOfRounds());
                copy = getM();
            } else {
                store = new Data().getWestRound1();
                copy = getM();
            }
            double comp = 0.0;
            double comp2 = 0.0;
            double firstProb = 0.0;
            double secondProb = 0.0;
            double max = 0.0;
            double min = 0.0;
            double comp3 = 0.0;
            double comp4 = 0.0;
            System.out.println("Playing Round " + numOfRounds + "..." + "\n");
            for (String key : copy.keySet()) {
                comp = Math.random();
                comp2 = 1.0 - comp;
                firstProb = store.get(key);
                secondProb = store.get(copy.get(key));
                max = Math.max(firstProb, secondProb);
                min = Math.min(firstProb, secondProb);
                comp3 = 1.0 - max;
                comp4 = 1.0 - min;
                if (comp <= min && comp < max) {
                    super.onLowBoundary(store, min, copy, key);
                } else if (comp >= max && comp > min) {
                    super.onHiBoundary(store, max, copy, key);
                } else {
                    if (comp2 >= comp3) {
                        super.leftIntersect(comp2, comp3, store, max, copy, key);
                    } else if (comp2 <= comp4) {
                        super.rightIntersect(comp2, comp4, store, min, copy, key);
                    }
                }
            }
            if (getNumOfRounds() == 4) {
                System.out.println("West Region Complete" + "\n" + "\n");
                break;
            }
            System.out.println("Round " + numOfRounds + " completed!" + "\n");
            super.prepareNextRound(getTeamNames());
        }
    }
    @Override
    public void getCurrentMatchUp(HashMap<String, String> x, int n) {
        super.getCurrentMatchUp(getM(), getNumOfRounds());
    }
    @Override
    public int getNumOfRounds()
    {
        return numOfRounds;
    }
}
