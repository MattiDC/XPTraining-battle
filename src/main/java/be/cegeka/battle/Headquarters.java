package be.cegeka.battle;


public class Headquarters implements IHeadquarters {

    @Override
    public int ReportEnlistment(String soldierName) {
        return 69;
    }

    @Override
    public void ReportCasualty(int soldierId) {
        throw new UnsupportedOperationException("implement me (after test)");
    }

    @Override
    public void ReportVictory(int remainingNumberOfSoldiers) {
        throw new UnsupportedOperationException("implement me (after test)");
    }

}
