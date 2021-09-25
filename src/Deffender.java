public class Deffender extends GameCharacter {
    public double bonusDefense;
    public double totalDefense;

    public Deffender(String name, int attack, int defence, int energy, double bonusDefense) {
        super(name, attack, defence, energy);
        this.bonusDefense = bonusDefense;
        this.totalDefense = (1 + bonusDefense / 100) * defence;
    }
}