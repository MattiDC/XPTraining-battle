package be.cegeka.battle;


public class Axe extends Weapon {

    public Axe() {
        super.weaponDamage = 3;
    }

    @Override
    int hasAdvantage(Weapon weapon) {
        if (weapon instanceof Spear) {
            return 3;
        }

        return 0;
    }

}
