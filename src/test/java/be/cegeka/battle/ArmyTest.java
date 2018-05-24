package be.cegeka.battle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ArmyTest {

    @Test
    public void AddSoldiersToArmy() {

        Army army = new Army("Army1");

        Soldier soldier = new Soldier("soldier");
        army.enlistSoldier(soldier);

        Assertions.assertThat(army.getArmy()).containsOnly(soldier);
    }


}