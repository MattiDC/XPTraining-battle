package be.cegeka.battle;


public class BareFist extends Weapon {

    public BareFist() {
        super.weaponDamage = 1;
    }

    @Override
    int hasAdvantage(Weapon weapon) {
        return super.weaponDamage;
    }
}
