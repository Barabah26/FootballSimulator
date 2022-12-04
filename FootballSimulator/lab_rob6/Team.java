package lab_rob6;

public class Team implements TeamDemo{    //Абстрактні класи можуть не реалізовувати усіх методів з інтерфейсу, який імплементують.
    int players;
    int coaches;
    int trophies;

    public Team(int players, int coaches, int trophies) {
        this.players = players;
        this.coaches = coaches;
        this.trophies = trophies;
    }

    public void showPlayers(){
        System.out.println("Кількість гравців в команді: " + players);
    }

    public void sumPersonal(int staff) {
        System.out.println("Кількість персоналу в команді: " + staff);
    }

    public void trophy(){
        System.out.println("Трофеї команди: " + trophies);

    }

}
