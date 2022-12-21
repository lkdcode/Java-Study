package RPG;

public class DungeonService implements Dungeon {

    private boolean isWin = false;

    @Override
    public void baseBall(Wizard wizard) {
        System.out.println("승리!");
        isWin = true;
        win(wizard);
    }

    private void win(Wizard wizard) {
        if (this.isWin) {
            wizard.setHp(5);
        }
    }

}
