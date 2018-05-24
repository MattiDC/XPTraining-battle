package be.cegeka.battle;


public class Spear extends Weapon {

    public Spear() {
        super.weaponDamage = 2;
    }

    @Override
    int hasAdvantage(Weapon weapon) {
        if (weapon instanceof Sword) {
            return super.weaponDamage + 3;
        }

        return super.weaponDamage;
    }
}
