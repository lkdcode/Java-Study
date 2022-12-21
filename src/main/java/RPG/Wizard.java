package RPG;

public class Wizard implements PlayClass {
    private int hp = 100 - 15;
    private int mp = 100 + 15;
    private int strength = 10 - 3;
    private int intellect = 10 + 3;

    @Override
    public String toString() {
        return "마법사 스탯 정보 [" +
          "HP=" + hp +
          ", MP=" + mp +
          ", STRENGTH=" + strength +
          ", INTELLECT=" + intellect +
          ']';
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp += hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public Wizard() {
        hp();
        mp();
        strength();
        intellect();
    }

    @Override
    public void hp() {
        this.hp = 100;
    }

    @Override
    public void mp() {

    }

    @Override
    public void strength() {

    }

    @Override
    public void intellect() {

    }
}