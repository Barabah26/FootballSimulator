package lab_rob2;

public class Main {
    public static void main(String[] args) {
        Team team = new Team(28, 9, 2);
        team.sumPersonal(23);
        System.out.println("Трофеї команди: " + team.trophy());
        System.out.println("Трофеї команди: " + team.trophy(2.0));
        team.improve(2, "Mudryk", "Bondarenko");


        System.out.println();

        Coach coach = new Coach("Luis Kastro", 50, 12, 2);
        coach.improveSkills(true, 2.3, 1.6);
        System.out.println("Вік тренера: " + coach.showAge());
        System.out.println("Вік тренера: " + coach.showAge(50.0));
        coach.improve(3, "MC","MU","RM");
        System.out.println("Навики тренера: " + coach.returnSkills(coach)); //методу із класу, екземпляр якого передано в якості параметру

        System.out.println();

        Stadium stadium = new Stadium(160, 140, 80455, "Donbas Arena");
        Stadium stadium1 = new Stadium();
        Stadium stadium2 = new Stadium(160,140);
        Stadium stadium3 = new Stadium(800000, "Donbas Arena");
        System.out.println("Площа стадіону становить: " + stadium.square());
        stadium.showStadium("Donetsk");
        System.out.println("Площа стадіону становить: " + stadium.square(160.0, 140.0));
        stadium.improve(100000, "Shakhtar Arena", "Donetsk Arena");
        stadium.stUp(10,2,"Arena");//метод посилкового типу
        System.out.println("Кількість секторів: 10, кількість фанатів в секторі: " + stadium.fans(10));

    }
}
