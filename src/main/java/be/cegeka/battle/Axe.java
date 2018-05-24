package be.cegeka.battle;


public class Axe extends Weapon {

    public Axe() {
        super.weaponDamage = 3;
    }

    @Override
    int hasAdvantage(Weapon weapon) {
        if (weapon instanceof Spear) {
            return super.weaponDamage + 3;
        }

        return super.weaponDamage;
    }

}
