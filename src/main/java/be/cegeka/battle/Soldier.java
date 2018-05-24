package be.cegeka.battle;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import org.apache.commons.lang3.Validate;

public class Soldier {

    private String name;

    private Weapon weapon = new BareFist();

    boolean highlyTrained = false;

    public Weapon getWeapon() {
        return this.weapon;
    }

    public Soldier(String name) {
        Validate.isTrue(isNotBlank(name));

        this.name = name;
    }

    public Soldier(String name, boolean highlyTrained) {
        this(name);
        this.highlyTrained = highlyTrained;
    }

    String getName() {
        return this.name;
    }

    public Soldier fight(Soldier soldier) {
        Soldier loser = this;

        if (compareDamageAttackerAndDefender(soldier)) {
            loser = soldier;
        }

        return loser;
    }

    private boolean compareDamageAttackerAndDefender(Soldier soldier) {
        return this.getWeapon().getWeaponDamage(soldier) >= soldier.getWeapon().getWeaponDamage(this);
    }

    public void addWeapon(Weapon weapon) {
        if (this.highlyTrained == false && weapon.specializedWeapon == true) {
            throw new IllegalArgumentException("Kan geen specializedWeapon toekennen aan een normale Soldier!");
        }
        this.weapon = weapon;
    }

    public int getWeaponDamage(Soldier soldier) {
        return getWeapon().getWeaponDamage(soldier);
    }
}
