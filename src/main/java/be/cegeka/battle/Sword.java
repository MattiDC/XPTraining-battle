package be.cegeka.battle;


public class Sword extends Weapon {

    public Sword() {
        super.weaponDamage = 2;
    }

    @Override
    int hasAdvantage(Weapon weapon) {
        if (weapon instanceof Axe) {
            return 3;
        }

        return 0;
    }
}
