public class Attacker extends GameCharacter {
    public double bonusAttack;
    public double totalAttack;

    public Attacker(String name, int attack, int defence, int energy, double bonusAttack) {
        super(name, attack, defence, energy);
        this.bonusAttack = bonusAttack;
        this.totalAttack = ( 1 + bonusAttack/100) * attack;
    }

   /* double countTotalAttack() {
        return totalAttack = (((bonusAttack / 100) * attack) + attack);
    }*/
}

