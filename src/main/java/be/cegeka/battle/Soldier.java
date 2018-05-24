package be.cegeka.battle;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import org.apache.commons.lang3.Validate;

public class Soldier {

    private String name;

    private Weapon weapon = new BareFist();

    public Soldier() {

    }

    public Soldier(String name) {
        Validate.isTrue(isNotBlank(name));

        this.name = name;
    }

    String getName() {
        return this.name;
    }

    public Soldier fight(Soldier soldier) {
        Soldier loser = this;

        if (this.weapon.weaponDamage >= soldier.weapon.weaponDamage) {
            loser = soldier;
        }

        return loser;
    }

    public void addWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
