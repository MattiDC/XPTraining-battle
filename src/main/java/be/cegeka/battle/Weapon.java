package be.cegeka.battle;

public abstract class Weapon {

    protected int weaponDamage;

    protected boolean specializedWeapon = false;

    protected int bonusDamage = 3;

    public int getWeaponDamage(Weapon weapon) {
        if (this instanceof MagicPotion) {
            if (weapon.weaponDamage % 2 == 0) {
                this.weaponDamage = 10;
            } else {
                this.weaponDamage = 0;
            }
        }

        return weaponDamage;
    }

    public boolean weaponWinsFrom(Weapon otherWeapon) {
        int damage = this.hasAdvantage(otherWeapon) + this.getWeaponDamage(otherWeapon);
        if (damage >= otherWeapon.getWeaponDamage(this)) {
            return true;
        }
        return false;
    }

    abstract int hasAdvantage(Weapon weapon);

}
