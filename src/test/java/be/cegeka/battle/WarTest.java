package be.cegeka.battle;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mock;

public class WarTest {


    @Test
    public void engageWarTest_AttackerWins() {
        Army defendArmy = new Army("defendArmy");
        Army attackArmy = new Army("attackArmy");

        Weapon weaponDefender = new BareFist();
        Soldier soldierWithBareFist = new Soldier("soldier1");
        soldierWithBareFist.addWeapon(weaponDefender);
        defendArmy.enlistSoldier(soldierWithBareFist);

        Weapon weaponAttacker = new Sword();
        Soldier soldierWithSword = new Soldier("soldier2");
        soldierWithSword.addWeapon(weaponAttacker);
        attackArmy.enlistSoldier(soldierWithSword);

        assertEquals("Attackers win!", War.engageWar(attackArmy.getArmy(), defendArmy.getArmy()));
    }

    @Test
    public void EngageWarBetweenArmys_DefenderHasBareFist_AttackerHasSword_AttackerWins() {
        Army defendArmy = new Army("defendArmy");
        Army attackArmy = new Army("attackArmy");

        Weapon weaponDefender = new Sword();
        Soldier soldierWithSword = new Soldier("soldier1");
        soldierWithSword.addWeapon(weaponDefender);
        defendArmy.enlistSoldier(soldierWithSword);

        Weapon weaponAttacker = new BareFist();
        Soldier soldierWithBareFist = new Soldier("soldier2");
        soldierWithBareFist.addWeapon(weaponAttacker);
        attackArmy.enlistSoldier(soldierWithBareFist);

        assertEquals("Defenders win!", War.engageWar(attackArmy.getArmy(), defendArmy.getArmy()));
    }

    @Mock
    private Soldier soldierMock;

    @Test
    public void EngageWarBetweenArmys_DefenderHasSword_AttackerHasBareFist_DefenderWins() {
        Army defendArmy = new Army("defendArmy");
        Army attackArmy = new Army("attackArmy");

        Weapon weaponDefender = new Sword();
        Soldier soldierWithSword = new Soldier("soldier1");
        soldierWithSword.addWeapon(weaponDefender);
        defendArmy.enlistSoldier(soldierWithSword);

        Weapon weaponAttacker = new BareFist();
        Soldier soldierWithBareFist = new Soldier("soldier2");
        soldierWithBareFist.addWeapon(weaponAttacker);
        attackArmy.enlistSoldier(soldierWithBareFist);

        assertEquals("Defenders win!", War.engageWar(attackArmy.getArmy(), defendArmy.getArmy()));
    }
}

