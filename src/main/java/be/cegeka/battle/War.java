package be.cegeka.battle;

import java.util.List;

public class War {

    private static Headquarters hq;

    public static String engageWar(List<Soldier> attackers, List<Soldier> defenders) {
        String result;

        while (attackers.size() != 0 && defenders.size() != 0) {
            Soldier attacker = attackers.get(0);
            Soldier defender = defenders.get(0);

            Soldier loser = defender.fight(attacker);

            if (loser == attacker) {
                attackers.remove(0);
            } else {
                defenders.remove(0);
            }
        }
        if (attackers.size() == 0) {
            hq.ReportVictory(defenders.size());
            result = "Defenders win!";
        } else {
            hq.ReportVictory(defenders.size());
            result = "Attackers win!";
        }
        return result;

    }

}
