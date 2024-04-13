package marchMaadness;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import marchMaadness.Data;
public class SouthRegion extends EastRegion {
    private static int numOfRounds = 0;
    private ArrayList<String> southNames;
    private HashMap<String, String> s = new HashMap<>();
    public SouthRegion() {
        this.southNames = new ArrayList<>(Arrays.asList("Houston (1)", "Longwood (16)", "Nebraska (8)", "Texas A&M (9)", "Wisconsin (5)", "James Madison (12)", "Duke (4)", "Vermont (13)", "Texas Tech (6)", "NC State (11)", "Kentucky (3)", "Oakland (14)", "Florida (7)", "Colorado (10)", "Marquette (2)", "Western Ky. (15)"));
        for (int x = 0; x < southNames.size() - 1; x += 2) {
            this.s.put(southNames.get(x), southNames.get(x + 1));
        }
    }

    @Override
    public ArrayList<String> getTeamNames()
    {
        return this.southNames;
    }
    @Override
    public HashMap<String, String> getM()
    {
        return this.s;
    }
    @Override
    public void setM(HashMap<String, String> newM)
    {
        this.s = newM;
    }
    @Override
    public HashMap<String, Double> constructNextRound(ArrayList<String> names, int n)
    {
        HashMap<String, Double> r = new HashMap<>();
        HashMap<String, Double> newRound = new HashMap<>();
        Data x = new Data();
        if (n==2)
        {
            newRound = x.getSouthRound2();
        }
        if (n==3)
        {
            newRound = x.getSouthSweet16();
        }
        if (n==4)
        {
            newRound = x.getSouthElite8();
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
        System.out.println("South Region Loading..." + "\n");
        while (true){
            getCurrentMatchUp(getM(), getNumOfRounds());
            numOfRounds+=1;
            HashMap<String, Double> store = new HashMap<>();
            HashMap<String, String> copy = new HashMap<>();
            if (numOfRounds != 1) {
                store = constructNextRound(getTeamNames(), getNumOfRounds());
                copy = getM();
            } else {
                store = new Data().getSouthRound1();
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
            if (getNumOfRounds()==4)
            {
                System.out.println("South Region Completed" + "\n" + "\n");
                break;
            }
            System.out.println("Round " + numOfRounds + " completed!" + "\n");
            super.prepareNextRound(getTeamNames());
        }
    }
    @Override
    public void getCurrentMatchUp(HashMap<String, String> m, int n) {
        super.getCurrentMatchUp(getM(), getNumOfRounds());
    }
    @Override
    public int getNumOfRounds()
    {
        return numOfRounds;
    }
}
