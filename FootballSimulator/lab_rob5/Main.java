package lab_rob5;

public class Main {
    public static void main(String[] args) {
        Team team = new Team(28, 9, 2);
        team.setTrophies(2);
        team.setCoaches(9);
        team.setPlayers(28);
        team.sumPersonalDemo();
        System.out.println("Трофеї команди: " + team.trophyDemo());
        System.out.println("Трофеї команди: " + team.trophyDem());
        team.improveDemo();
        team.showInformationAboutTeamDemo();
        team.results(true);  // перевантажений метод в ієрархії наслідування
        team.someInfo();   //метод із абстрактного класу


        System.out.println();

        Coach coach = new Coach("Luis Kastro", 50, 12, 2);
        coach.setName("Luis Kastro");
        coach.setAge(50);
        coach.setSkills(12);
        coach.setTrophies(2);
        coach.improveSkills(true, 1.5, 0.5);
        System.out.println("Вік тренера: " + coach.showAge());
        System.out.println("Вік тренера: " + coach.showAge(50.0));
        coach.improve(3, "MC","MU","RM");
        System.out.println("Навики тренера: " + coach.returnSkills(coach)); //методу із класу, екземпляр якого передано в якості параметру
        coach.showInformationAboutCoach(team, new Stadium(160, 140, 80455, "Donbas Arena"));
        coach.results(true);  // перевантажений метод в ієрархії наслідування
        coach.results();   // перевизначений метод в ієрархії наслідування
        coach.someInfo();        //метод із абстрактного класу


        System.out.println();

        Stadium stadium = new Stadium(160, 140, 80455, "Donbas Arena");
        Stadium stadium1 = new Stadium();
        Stadium stadium2 = new Stadium(160,140);
        Stadium stadium3 = new Stadium(800000, "Donbas Arena");
        stadium.setLength(160);
        stadium.setWidth(140);
        stadium.setCapacity(80455);
        stadium.setNameOfStadium("Donbas Arena");
        System.out.println("Площа стадіону становить: " + stadium.square());
        stadium.showStadium("Donetsk");
        System.out.println("Площа стадіону становить: " + stadium.square(160.0, 140.0));
        stadium.improve(100000, "Shakhtar Arena", "Donetsk Arena");
        stadium.stUp(10,2,"Arena");//метод посилкового типу
        System.out.println("Кількість секторів: 10, кількість фанатів в секторі: " + stadium.fans(10));
        stadium.showInformationAboutStadium(team, coach);
        stadium.matches(657);
        stadium.results(true);  // перевантажений метод в ієрархії наслідування
        stadium.someInfo();      //метод із абстрактного класу


        System.out.println();

        Footballer footballer = new Footballer();
        Footballer.index();
        Footballer.showInformationAboutPlayer();
        footballer.infoAboutPlayer();

        System.out.println();

        Training training = new Training();
        training.showInfo();
        training.trainingGround(160, 80);

        System.out.println();

        U19 u19 = new U19(21,5, 1);
        u19.test();
        u19.info();

        System.out.println();
        System.out.println("Динамічна диспетчеризація");
        System.out.println();

        Dispatch dispatch = new Dispatch();
        dispatch.choice("Coach");
        dispatch.choice("Team");
        dispatch.choice("Stadium");

    }
}
