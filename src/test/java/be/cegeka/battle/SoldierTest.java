package be.cegeka.battle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SoldierTest {

    @Test
    public void construction_ASoldierMustHaveAName() {
        Soldier soldier = new Soldier("name");

        assertThat(soldier.getName()).isEqualTo("name");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeNull() {
        new Soldier(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeEmpty() {
        new Soldier("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeBlank() {
        new Soldier("   ");
    }

    @Test
    public void fight_soldier_attackerWins() {
        Soldier attacker = new Soldier("Jan");
        Weapon weaponAttacker = new Axe();
        attacker.addWeapon(weaponAttacker);

        Weapon weaponDefender = new BareFist();
        Soldier defender = new Soldier("Jip");
        defender.addWeapon(weaponDefender);

        assertThat(attacker.fight(defender).equals(defender)).isTrue();
    }

    @Test
    public void fight_soldier_defenderWins() {
        Soldier attacker = new Soldier("Jan");
        Weapon weaponAttacker = new BareFist();
        attacker.addWeapon(weaponAttacker);

        Weapon weaponDefender = new Sword();
        Soldier defender = new Soldier("Jip");
        defender.addWeapon(weaponDefender);

        assertThat(attacker.fight(defender).equals(attacker)).isTrue();
    }

}