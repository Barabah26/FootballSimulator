package lab_rob5;

public class Team extends Stadium{
    private int players;
    private int coaches;
    private int trophies;

    Team(int players, int coaches, int trophies) {
        super();
        this.players = players;
        this.coaches = coaches;
        this.trophies = trophies;
    }

    public Team() {

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
    void improve(int transfers, String... names){ //  метод із статичним імям і динамічною логікою
        System.out.println("Кількість трансферів команди: " + transfers);
        System.out.println("Прізвища новачків: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
//    Coach c = new Coach("Luis Kastro", 50, 12, 2);//створюю екземпляр класу Coach
//    Stadium s = new Stadium(160, 140, 80455, "Donbas Arena");//створюю екземпляр класу Stadium

    private void showInformationAboutTeam(){
        System.out.println("Імя тренера команди: " + super.getName() + " , назва стадіону на якому грає команда: " + super.getNameOfStadium());
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

    void showName(String nameOfTeam){
        System.out.println("Назва команди: " + nameOfTeam);
    }

    @Override
    void results(boolean p){
        int budget = 400;
        System.out.println("Бюджет команди на початку сезону: " + budget);    // перевантажений метод в ієрархії наслідування
        if(p == true){
            budget = budget + 20;
            System.out.println("Команда провела хороший вдалий сезон, бюджет збільшився: " + budget);
        } else{
            System.out.println("Бюджет не змінився");
        }
    }

    void someInfo() {
        String name = "Messi";
        int goals = 54;
        int assists = 35;
        System.out.println("Статистика " + name + " в цьому сезоні: " );
        System.out.println("- " + goals + " голів;");
        System.out.println("- " + assists + " асистів;");
    }
}
