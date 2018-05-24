package be.cegeka.battle;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private Headquarters hq;

    private String name;


    private List<Soldier> army = new ArrayList<>();

    public Army(String name) {
        super();
        this.name = name;
    }

    public void enlistSoldier(Soldier soldier) {
        army.add(soldier);
        soldier.setId(hq.ReportEnlistment(name));
    }

    public List<Soldier> getArmy() {
        return army;
    }


}
