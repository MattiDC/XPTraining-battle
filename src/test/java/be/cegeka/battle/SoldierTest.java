package be.cegeka.battle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class SoldierTest {

    private Soldier highlyTrainedSoldier, normalTrainedSoldier;

    @Before
    public void makeHighlyTrainedSoldiers() {
        highlyTrainedSoldier = new Soldier("Jos", true);
    }

    @Before
    public void makeNormalTrainedSoldier() {
        normalTrainedSoldier = new Soldier("Jos");
    }


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
    public void fight_attackerHasAxe_defenderHasBareFist_attackerWins() {
        Soldier attacker = new Soldier("Jan");
        Weapon weaponAttacker = new Axe();
        attacker.addWeapon(weaponAttacker);

        Weapon weaponDefender = new BareFist();
        Soldier defender = new Soldier("Jip");
        defender.addWeapon(weaponDefender);

        assertThat(attacker.fight(defender).equals(defender)).isTrue();
    }

    @Test
    public void fight_soldierHasBareFist_defenderHasSword_defenderWins() {
        Soldier attacker = new Soldier("Jan");
        Weapon weaponAttacker = new BareFist();
        attacker.addWeapon(weaponAttacker);

        Weapon weaponDefender = new Sword();
        Soldier defender = new Soldier("Jip");
        defender.addWeapon(weaponDefender);

        assertThat(attacker.fight(defender).equals(attacker)).isTrue();
    }

    @Test(expected = IllegalArgumentException.class)
    public void normalTrained_addSpecializedWeapon_throwsException() {
        Weapon specializedWeapon = new BroadAxe();
        normalTrainedSoldier.addWeapon(specializedWeapon);

    }

    @Test
    public void highlyTrained_addBroadAxe_willWork() {
        Weapon specializedWeapon = new BroadAxe();
        highlyTrainedSoldier.addWeapon(specializedWeapon);

        assertThat(highlyTrainedSoldier.getWeapon().equals(specializedWeapon));
    }


    @Test
    public void highlyTrained_addTrident_willWork() {
        Weapon specializedWeapon = new Trident();
        highlyTrainedSoldier.addWeapon(specializedWeapon);

        assertThat(highlyTrainedSoldier.getWeapon().equals(specializedWeapon));
    }

    @Test
    public void highlyTrained_addTwoHandedSword_willWork() {
        Weapon specializedWeapon = new TwoHandedSword();
        highlyTrainedSoldier.addWeapon(specializedWeapon);

        assertThat(highlyTrainedSoldier.getWeapon().equals(specializedWeapon));
    }

    @Test
    public void fight_soldiersOpponentHasEvenDamage_AttackerHasMagicPotion_OpponentLoses() {
        Weapon specializedWeapon = new MagicPotion();
        highlyTrainedSoldier.addWeapon(specializedWeapon);

        Weapon weapon = new Sword();
        normalTrainedSoldier.addWeapon(weapon);

        assertThat(highlyTrainedSoldier.fight(normalTrainedSoldier)).isEqualTo(normalTrainedSoldier);

    }

    @Test
    public void fight_soldiersOpponentHasUnevenDamage_AttackerHasMagicPotion_AttackerLoses() {
        Weapon specializedWeapon = new MagicPotion();
        highlyTrainedSoldier.addWeapon(specializedWeapon);

        Weapon weapon = new Axe();
        normalTrainedSoldier.addWeapon(weapon);

        assertThat(highlyTrainedSoldier.fight(normalTrainedSoldier).equals(highlyTrainedSoldier)).isTrue();

    }

    @Test
    public void fight_attackerHasSword_defenderHasAxe_attackerHasAdvantage_attackerWins() {
        Weapon sword = new Sword();
        highlyTrainedSoldier.addWeapon(sword);

        Weapon axe = new Axe();
        normalTrainedSoldier.addWeapon(axe);

        assertThat(highlyTrainedSoldier.fight(normalTrainedSoldier).equals(normalTrainedSoldier)).isTrue();
    }

    @Test
    public void fight_attackerHasSpear_defenderHasAxe_attackerDoesNotHaveAdvantege_attackerLoses() {
        Weapon spear = new Spear();
        highlyTrainedSoldier.addWeapon(spear);

        Weapon axe = new Axe();
        normalTrainedSoldier.addWeapon(axe);

        assertThat(highlyTrainedSoldier.fight(normalTrainedSoldier).equals(highlyTrainedSoldier)).isTrue();
    }

    @Test
    public void fight_attackerHasSpear_defenderHasSword_attackerHasAdvantege_attackerLoses() {
        Weapon spear = new Spear();
        highlyTrainedSoldier.addWeapon(spear);

        Weapon sword = new Sword();
        normalTrainedSoldier.addWeapon(sword);

        assertThat(highlyTrainedSoldier.fight(normalTrainedSoldier).equals(normalTrainedSoldier)).isTrue();
    }

}