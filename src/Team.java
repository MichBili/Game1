public class Team {
    public double totalEnergy;
    public double totalAttack;
    public double totalDefense;
    public String name;

    GameCharacter[] gameCharacters ;

    public Team(GameCharacter[] gameCharacters, String name ) {
        this.gameCharacters = gameCharacters;
        this.totalEnergy = getTotalEnergy();
        this.totalAttack = getTotalAttack();
        this.totalDefense = getTotalDefense();
        this.name = name;
    }

    double getTotalEnergy() {
        double localTotalEnergy = 0;
        for (GameCharacter gamer : gameCharacters) {
            localTotalEnergy += gamer.energy;
        }
        return localTotalEnergy;
    }

    double getTotalAttack() {
        double localTotalAttack = 0;
        for (GameCharacter gamer : gameCharacters) {
            localTotalAttack += gamer.attack;
        }
        return localTotalAttack;
    }

    double getTotalDefense() {
        double localTotalDefense = 0;
        for (GameCharacter gamer : gameCharacters) {
            localTotalDefense += gamer.defence;
        }
        return localTotalDefense;
    }
}
