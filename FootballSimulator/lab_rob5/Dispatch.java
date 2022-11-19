package lab_rob5;

public class Dispatch {
    Coach coach = new Coach("Luis Kastro", 50, 12, 2);
    Team team = new Team(28, 9, 2);
    Stadium stadium = new Stadium(160, 140, 80455, "Donbas Arena");

    Coach c; //виконання динамічної диспетчеризації реалізовано за допомогою посилкової змінної с.

    void choice(String clas){
        if(clas == "Coach"){
            c = coach;
            c.someInfo();
            c.results(true);
        } else if (clas == "Team") {
            c = team;
            c.someInfo();
            c.results(true);
        } else if(clas == "Stadium"){
            c = stadium;
            c.someInfo();
            c.results(true);
        } else {
            System.out.println("Немає такого класу");
        }
    }
}
