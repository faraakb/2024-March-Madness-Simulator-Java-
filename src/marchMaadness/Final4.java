package marchMaadness;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
import marchMaadness.Data;

public class Final4 extends EastRegion {
    private static int numOfRounds;
    ArrayList<String> teamNames = new ArrayList<>();
    HashMap<String, Double> m = new HashMap<>();
    HashMap<String, Double> m1 = new HashMap<>();
    HashMap<String, String> eastVSouth = new HashMap<>();
    HashMap<String, String> westVMidWest = new HashMap<>();
    HashMap<String, String> m3 = new HashMap<>();
    public Final4(ArrayList<String> east, ArrayList<String> west, ArrayList<String> south, ArrayList<String> midWest) {
        Data x = new Data();
        this.teamNames = new ArrayList<>((Arrays.asList(east.getFirst(), south.getFirst(), west.getFirst(), midWest.getFirst())));
        m.put(east.getFirst(), x.getEastFinal4().get(east.getFirst()));
        m.put(south.getFirst(), x.getSouthFinal4().get(south.getFirst()));
        m1.put(west.getFirst(), x.getWestFinal4().get(west.getFirst()));
        m1.put(midWest.getFirst(), x.getMidWestFinal4().get(midWest.getFirst()));
        this.eastVSouth.put(east.getFirst(), south.getFirst());
        this.westVMidWest.put(west.getFirst(), midWest.getFirst());
        m3.put(east.getFirst(), west.getFirst());
        m3.put(south.getFirst(), midWest.getFirst());
    }
    public HashMap<String, Double> getEastSouthProb()
    {
        return this.m;
    }
    public HashMap<String, Double> getWestMidWestProb()
    {
        return this.m1;
    }
    public HashMap<String, String> getEastVSouth()
    {
        return this.eastVSouth;
    }
    public HashMap<String, String> getWestVMidWest()
    {
        return this.westVMidWest;
    }
    public HashMap<String, String> getM()
    {
        return this.m3;
    }
    @Override
    public int getNumOfRounds()
    {
        return numOfRounds;
    }
    @Override
    public ArrayList<String> getTeamNames()
    {
        return this.teamNames;
    }

    @Override
    public void getCurrentMatchUp(HashMap<String, String> m, int n) {
        for (String key : m.keySet()) {
            System.out.println(key + " plays " + m.get(key) + " in the Final 4" + "\n");
        }
    }
    @Override
    public void playRound() {
        System.out.println("Playing Final 4..." + "\n");
            while (true) {
                numOfRounds+=1;
                HashMap<String, Double> store = new HashMap<>();
                HashMap<String, String> copy = new HashMap<>();
                if (getNumOfRounds()!=1)
                {
                    store = getWestMidWestProb();
                    copy = getWestVMidWest();
                    getCurrentMatchUp(copy, getNumOfRounds());
                }
                else{
                    store = getEastSouthProb();
                    copy = getEastVSouth();
                    getCurrentMatchUp(copy, getNumOfRounds());
                }
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
                if (getNumOfRounds()==2)
                {
                    break;
                }
            }
            System.out.println("Final 4 Completed!" + "\n");
        }
        @Override
        public String displayWinner(String advance, int n)
        {
            return advance + " is going to the NCAA CHAMPIONSHIP!!!" + "\n";
        }
    }