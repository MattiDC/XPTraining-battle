package be.cegeka.battle;


public class MagicPotion extends Weapon {

    public MagicPotion() {
        super.specializedWeapon = true;
    }

    @Override
    int hasAdvantage(Weapon weapon) {
        return super.weaponDamage;
    }
}
