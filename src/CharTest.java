public class CharTest {
    public static void main(String[] args) {

        GameCharacter[] gameCharacters = new GameCharacter[3];
        gameCharacters[0] = new GameCharacter("Filip", 120,80, 150);
        gameCharacters[1] = new GameCharacter("Filip", 120,80, 150);
        gameCharacters[2] = new GameCharacter("Maciej", 120,80, 150);

        GameCharacter[] gameCharacters1 = new GameCharacter[3];
        gameCharacters1[0] = new GameCharacter("Marta", 120,80, 150);
        gameCharacters1[1] = new GameCharacter("Marcin", 130,40, 200);
        gameCharacters1[2] = new GameCharacter("Andrzej", 110,180, 50);

        Team team1 = new Team(gameCharacters, "RSB");
        System.out.println("Całkowity atak drużyny " + team1.name + " wynosi: " + team1.totalAttack);
        System.out.println("Całkowity obrona drużyny " + team1.name+ "  wynosi: " + team1.totalDefense);
        System.out.println("Całkowity energia drużyny " + team1.name + " wynosi: " + team1.totalEnergy);
        System.out.println("****");
        
        Team team2 = new Team(gameCharacters1, "Ziomeczki");
        System.out.println("Całkowity atak drużyny " + team2.name + " wynosi: " + team2.totalAttack);
        System.out.println("Całkowity obrona drużyny " + team2.name+ "  wynosi: " + team2.totalDefense);
        System.out.println("Całkowity energia drużyny " + team2.name + " wynosi: " + team2.totalEnergy);

        System.out.println(doAttack(team2, team1));

      /*  team2.totalEnergy = doAttack(team2, team1);
        if ( team2.totalEnergy <= 0 ){
            System.out.println("Drużyna " + team1.name + " wygrywa z drużyną " + team2.name );
        } else {
           team1.totalEnergy = doAttack(team1, team2);
        }*/

        while (team2.totalEnergy > 0 && team1.totalEnergy > 0 ) {
            team2.totalEnergy = doAttack(team2, team1);
            if (team2.totalEnergy <= 0) {
                System.out.println("Drużyna " + team1.name + " wygrywa z drużyną " + team2.name);
            } else {
                team1.totalEnergy = doAttack(team1, team2);
                if (team1.totalEnergy <= 0) {
                    System.out.println("Drużyna " + team2.name + " wygrywa z drużyną " + team1.name);
                }
                System.out.println("Energia drużyny " + team1.name + " = " + team1.totalEnergy);
                System.out.println("Energia drużyny " + team2.name + " = " + team2.totalEnergy);
            }
        }

    }
    public static double doAttack(Team team1, Team team2){
       return team1.totalEnergy - team2.totalAttack + team1.totalDefense;

    }
}
