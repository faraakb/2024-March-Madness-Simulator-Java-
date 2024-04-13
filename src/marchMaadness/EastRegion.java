package marchMaadness;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import marchMaadness.Data;
public class EastRegion {
    private ArrayList<String> eastNames;
    private HashMap<String, String> m = new HashMap<>();
    private static int numOfRounds = 0;
    public EastRegion() {
        this.eastNames = new ArrayList<>(Arrays.asList("UConn (1)", "Stetson (16)", "FAU (8)", "Northwestern (9)", "SDSU (5)", "UAB (12)", "Auburn (4)", "Yale (13)", "BYU (6)", "Duquesne (11)", "Illinois (3)", "Morehead St. (14)", "Washington St. (7)", "Drake (10)", "Iowa St. (2)", "South Dakota St. (15)"));
        for (int x = 0; x < eastNames.size() - 1; x+=2) {
            this.m.put(eastNames.get(x), eastNames.get(x + 1));
        }
    }
    public HashMap<String, String> getM()
    {
        return this.m;
    }
    public void setM(HashMap<String, String> newM)
    {
        this.m = newM;
    }
    public ArrayList<String> getTeamNames() {
        return this.eastNames;
    }
    public int getNumOfRounds()
    {
        return numOfRounds;
    }
    public HashMap<String, Double> constructNextRound(ArrayList<String> names, int n){
        HashMap<String, Double> r = new HashMap<>();
        HashMap<String, Double> newRound = new HashMap<>();
        Data x = new Data();
        if (n==2)
        {
            newRound = x.getEastRound2();
        }
        if (n==3)
        {
            newRound = x.getEastSweet16();
        }
        if (n==4)
        {
            newRound = x.getEastElite8();
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
    public void getCurrentMatchUp(HashMap<String, String> m, int n) {
        int actualRound = n+1;
        for (String key : m.keySet()) {
            System.out.println(key + " plays " + m.get(key) + " in round " + actualRound + "\n");
        }
    }

    public void playRound() {
        System.out.println("East Region Loading..." + "\n");
        while (true) {
            getCurrentMatchUp(getM(), getNumOfRounds());
            numOfRounds += 1;
            HashMap<String, Double> store = new HashMap<>();
            HashMap<String, String> copy = new HashMap<>();
            if (numOfRounds != 1) {
                store = constructNextRound(getTeamNames(), getNumOfRounds());
                copy = getM();
            } else {
                store = new Data().getEastRound1();
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
                if (comp <= min) {
                    onLowBoundary(store, min, copy, key);
                } else if (comp >= max) {
                    onHiBoundary(store, max, copy, key);
                } else {
                    if (comp2 >= comp3) {
                        leftIntersect(comp2, comp3, store, max, copy, key);
                    } else if (comp2 <= comp4) {
                        rightIntersect(comp2, comp4, store, min, copy, key);
                    }
                }
            }
            if (getNumOfRounds()==4)
            {
                System.out.println("East Region Complete" + "\n" + "\n");
                break;
            }
            System.out.println("Round " + numOfRounds + " completed!" + "\n");
            prepareNextRound(getTeamNames());
        }
    }
    public void eliminated(String name)
    {
        getTeamNames().remove(name);
    }
    public void prepareNextRound(ArrayList<String> names) {
        HashMap<String, String> newM = new HashMap<>();
        for (int y = 0; y<names.size()-1; y+=2)
        {
            newM.put(names.get(y), names.get(y+1));
        }
        setM(newM);
    }
    public void onLowBoundary(HashMap<String, Double> store, double min, HashMap<String, String> copy, String key) {
        if (store.get(key) == min) {
            adv1(key);
        }
        else if (store.get(copy.get(key)) == min) {
            adv3(copy.get(key), key);
        }
    }
    public void onHiBoundary(HashMap<String, Double> store, double max, HashMap<String, String> copy, String key){
        if (store.get(key)==max)
        {
            adv1(key);
        }
        else if (store.get(copy.get(key))==max)
        {
            adv3(copy.get(key), key);
        }
    }
    public void leftIntersect(double comp2, double comp3, HashMap<String, Double> store, double max, HashMap<String, String> copy, String key){
        if (store.get(key)==max)
        {
            adv1(key);
        }
        else if (store.get(copy.get(key))==max)
        {
            adv3(copy.get(key), key);
        }
    }
    public void rightIntersect(double comp2, double comp4, HashMap<String, Double> store, double min, HashMap<String, String> copy, String key){
    if (store.get(key)==min)
    {
        adv1(key);
    }
    else if (store.get(copy.get(key))==min)
    {
        adv2(copy.get(key));
    }
}
    public void adv1(String x) {
        System.out.println(displayWinner(x, getNumOfRounds()));
        eliminated(getM().get(x));
    }
    public void adv2(String x)
    {
        System.out.println(displayWinner(x, getNumOfRounds()));
        eliminated(x);
    }
    public void adv3(String x, String toBeRemoved)
    {
        System.out.println(displayWinner(x, getNumOfRounds()));
        eliminated(toBeRemoved);
    }
    public String displayWinner(String advance, int n)
    {
        if (n==1)
        {
            return advance + " advances to the Round of 32!";
        }
        else if (n==2)
        {
            return advance + " advances to the Sweet 16!";
        }
        else if (n==3) {
            return advance + " advances to the Elite 8!";
        }
        else{
            return advance + " is moving on to the FINAL 4!!!";
        }
    }
    }