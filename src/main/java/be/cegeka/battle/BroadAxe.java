package be.cegeka.battle;


public class BroadAxe extends Axe {

    public BroadAxe() {
        super.weaponDamage = 2 + super.weaponDamage;
        super.specializedWeapon = true;
    }
}
