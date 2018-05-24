package be.cegeka.battle;


public abstract class Weapon {

    protected int weaponDamage;

    protected boolean specializedWeapon = false;

    public int getWeaponDamage(Soldier opponent) {
        if (this instanceof MagicPotion) {
            if (opponent.getWeapon().weaponDamage % 2 == 0) {
                this.weaponDamage = 10;
            } else {
                this.weaponDamage = 0;
            }
        }

        return weaponDamage;
    }
}
