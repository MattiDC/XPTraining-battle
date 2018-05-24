package be.cegeka.battle;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import org.apache.commons.lang3.Validate;

public class Soldier {

    private String name;

    private int id;

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

    public String getName() {
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Soldier fight(Soldier soldier) {
        Soldier loser = this;

        if (this.getWeapon().weaponWinsFrom(soldier.getWeapon()) == true) {
            loser = soldier;
            return loser;
        }
        return loser;
    }

    public void addWeapon(Weapon weapon) {
        if (this.highlyTrained == false && weapon.specializedWeapon == true) {
            throw new IllegalArgumentException("Kan geen specializedWeapon toekennen aan een normale Soldier!");
        }
        this.weapon = weapon;
    }

    public int getWeaponDamage(Soldier soldier) {
        return getWeapon().getWeaponDamage(soldier.weapon);
    }
}
