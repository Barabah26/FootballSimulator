package lab_rob6;

public class Main {
    public static void main(String[] args) {
        Team team = new Team(28, 9, 2);
        team.sumPersonal(32);
        team.trophy();
        team.showPlayers();

        System.out.println();

        Footballer footballer = new Footballer(27, 6, 5);
        footballer.trophy();
        footballer.sumPersonal(32);
        footballer.showPlayers();

        System.out.println();

        CoachStadium coachStadium = new CoachStadium(120, 70, 80000,"Donbass Arena", "Pavlo Barabah", 28, 12, 2);
        coachStadium.improveSkills(true, 3.5, 0.5);
        coachStadium.matches(600);
        coachStadium.showAge();
        coachStadium.showStadium("Donetsk");
        coachStadium.square();

    }
}
