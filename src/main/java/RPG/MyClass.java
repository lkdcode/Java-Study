package RPG;

public class MyClass {
    public Wizard getWizard() {
        return wizard;
    }

    private Wizard wizard;
    private int hp;
    private int mp;
    private int strength;
    private int intellect;

    public void setWizard() {
        this.wizard = new Wizard();
        this.hp = wizard.getHp();
        this.mp = wizard.getMp();
        this.strength = wizard.getStrength();
        this.intellect = wizard.getIntellect();
    }

    @Override
    public String toString() {
        System.out.print("👉 ");
        return wizard.toString();
    }

    public void setWarrior() {
//        this.playClass = new Warrior();
    }
}
