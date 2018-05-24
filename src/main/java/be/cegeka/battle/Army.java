package be.cegeka.battle;

import java.util.ArrayList;
import java.util.List;

public class Army {


    private String name;


    private List<Soldier> army = new ArrayList<>();

    public Army(String name) {
        super();
        this.name = name;
    }

    public void enlistSoldier(Soldier soldier) {
        army.add(soldier);
    }

    public List<Soldier> getArmy() {
        return army;
    }


}
