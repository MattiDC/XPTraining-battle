package be.cegeka.battle;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WarTest {


    @Test
    public void engageWarTest_AttackerWins() {
        Army defendArmy = new Army("defendArmy");
        Army attackArmy = new Army("attackArmy");

        Weapon weaponDefender = new BareFist();
        Soldier soldierWithBareFist = new Soldier("soldier1");
        soldierWithBareFist.addWeapon(weaponDefender);
        defendArmy.addSoldier(soldierWithBareFist);

        Weapon weaponAttacker = new Sword();
        Soldier soldierWithSword = new Soldier("soldier2");
        soldierWithSword.addWeapon(weaponAttacker);
        attackArmy.addSoldier(soldierWithSword);

        assertEquals("Attackers win!", War.engageWar(attackArmy.getArmy(), defendArmy.getArmy()));
    }

    @Test
    public void engageWarTest_DefenderWins() {
        Army defendArmy = new Army("defendArmy");
        Army attackArmy = new Army("attackArmy");

        Weapon weaponDefender = new Sword();
        Soldier soldierWithSword = new Soldier("soldier1");
        soldierWithSword.addWeapon(weaponDefender);
        defendArmy.addSoldier(soldierWithSword);

        Weapon weaponAttacker = new BareFist();
        Soldier soldierWithBareFist = new Soldier("soldier2");
        soldierWithBareFist.addWeapon(weaponAttacker);
        attackArmy.addSoldier(soldierWithBareFist);

        assertEquals("Defenders win!", War.engageWar(attackArmy.getArmy(), defendArmy.getArmy()));
    }
}

