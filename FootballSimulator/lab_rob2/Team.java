package lab_rob2;

public class Team{
    int players;
    int coaches;
    int trophies;

    Team(int players, int coaches, int trophies) {
        this.players = players;
        this.coaches = coaches;
        this.trophies = trophies;
    }

    void sumPersonal(int staff){
        int i = players + coaches;
        System.out.println("Кількість людей в команді: " + i);
        System.out.println("Кількість персоналу в команді: " + staff);
    }
    int trophy() {
        return trophies;
    }
    double trophy(double trophies){  //перевизначений метод
        return trophies;
    }
    void improve(int transfers, String... names){ //  метод із статичним імям і динамічною логікою
        System.out.println("Кількість трансферів команди: " + transfers);
        System.out.println("Прізвища новачків: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }

}
