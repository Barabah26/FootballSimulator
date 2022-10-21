package lab_rob3;


public class Team {
    private int players;
    private int coaches;
    private int trophies;

    Team(int players, int coaches, int trophies) {
        this.players = players;
        this.coaches = coaches;
        this.trophies = trophies;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public int getCoaches() {
        return coaches;
    }

    public void setCoaches(int coaches) {
        this.coaches = coaches;
    }

    public int getTrophies() {
        return trophies;
    }

    public void setTrophies(int trophies) {
        int t = trophies*2;
        this.trophies = t;
    }

    private void sumPersonal(int staff){
        int i = players + coaches;
        System.out.println("Кількість людей в команді: " + i);
        System.out.println("Кількість персоналу в команді: " + staff);
    }
    private int trophy() {
        return trophies;
    }
    private double trophy(double trophies){  //перевизначений метод
        return trophies;
    }
    private void improve(int transfers, String... names){ //  метод із статичним імям і динамічною логікою
        System.out.println("Кількість трансферів команди: " + transfers);
        System.out.println("Прізвища новачків: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
    Coach c = new Coach("Luis Kastro", 50, 12, 2);//створюю екземпляр класу Coach
    Stadium s = new Stadium(160, 140, 80455, "Donbas Arena");//створюю екземпляр класу Stadium

    private void showInformationAboutTeam(){
        System.out.println("Імя тренера команди: " + c.getName() + " , назва стадіону на якому грає команда: " + s.getNameOfStadium());
    }

    public void sumPersonalDemo(){  //спеціальний (допоміжний) метод, що приймає на вхід та повертає результат роботи закритого методу
        sumPersonal(23);
    }
    public int trophyDemo(){ //спеціальний (допоміжний) метод, що приймає на вхід та повертає результат роботи закритого методу
        return trophy();
    }
    public double trophyDem(){   //спеціальний (допоміжний) метод, що приймає на вхід та повертає результат роботи закритого методу
        return trophy(2.0);
    }
    public void improveDemo(){  //спеціальний (допоміжний) метод, що приймає на вхід та повертає результат роботи закритого методу
        improve(2, "Mudryk", "Bondarenko");
    }

    public void showInformationAboutTeamDemo(){//спеціальний (допоміжний) метод, що приймає на вхід та повертає результат роботи закритого методу
        showInformationAboutTeam();
    }
}
