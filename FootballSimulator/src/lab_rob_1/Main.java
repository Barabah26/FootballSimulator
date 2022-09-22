package lab_rob_1;

public class Main {
    public static void main(String[] args) {
        Team team = new Team(28, 9, 0);
        team.sumPersonal(23);
        System.out.println("Трофеї команди: " + team.trophy());

        System.out.println();

        Coach coach = new Coach("Luis Kastro", 50, 12, 2);
        coach.improveSkills(true, 2.3, 1.6);
        System.out.println("Вік тренера: " + coach.showAge());

        System.out.println();

        Stadium stadium = new Stadium(160, 140, 80455, "Donbas Arena");
        System.out.println("Площа стадіону становить: " + stadium.square());
        stadium.showStadium("Donetsk");

    }
}
