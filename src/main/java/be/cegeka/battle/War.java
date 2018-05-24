package be.cegeka.battle;

import java.util.List;

public class War {

    public static String engageWar(List<Soldier> attackers, List<Soldier> defenders) {
        String result;

        while (attackers.size() != 0 && defenders.size() != 0) {
            Soldier attacker = attackers.get(0);
            Soldier defender = defenders.get(0);

            Soldier loser = defender.fight(attacker);

            if (loser == attacker) {
                attackers.remove(0);
            } else if (loser == defender) {
                defenders.remove(0);
            }
        }

        if (attackers.size() == 0) {
            result = "Defenders win!";
        } else {
            result = "Attackers win!";
        }

        return result;

    }

}
