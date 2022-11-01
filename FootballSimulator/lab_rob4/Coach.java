package lab_rob4;

public class Coach {
    private String name;
    private int age;
    private double skills;
    private int trophies;

    Coach(String name, int age, double skills, int trophies) {
        super();
        this.name = name;
        this.age = age;
        this.skills = skills;
        this.trophies = trophies;
    }
    public Coach(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSkills() {
        return skills;
    }

    public void setSkills(double skills) {
        double s = skills*2;
        this.skills = skills;
    }

    public int getTrophies() {
        return trophies;
    }

    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }

    void improveSkills(boolean win, double w, double lD){
        if (win == true){
            double s = skills + w;
            System.out.println("Навики тренера збільшилися на: " + w);
            System.out.println("Нові навики тренера: " + s);
        } else {
            double n = skills - lD;
            System.out.println("Навики тренера зменшилися на: " + lD);
            System.out.println("Нові навики тренера: " + n);
        }

    }
    int showAge(){
        return age;
    }
    double showAge(double age){  //перевизначений метод
        return age;
    }

    void improve(int study, String... clubs) { //  метод із статичним імям і динамічною логікою
        System.out.println("Кількість пройдених курсів тренера: " + study);
        System.out.println("Клуби в яких тренер проходив навчання: " );
        for (int i = 0; i < clubs.length; i++) {
            System.out.println(clubs[i]);
        }
        if (study >= 3) {
            skills++;
            System.out.println("Нові навики тренера: " + skills);
        } else {
            System.out.println("Навики не змінилися");
        }
    }
    double returnSkills(Coach coach){
        improveSkills(true, 3.2, 1.6);  //методу із класу, екземпляр якого передано в якості параметру
        return coach.skills;
    }
    void showInformationAboutCoach(Team team, Stadium stadium){
        System.out.println("Кількість гравців яких тренує: " + team.getPlayers() + " , назва домашнього стадіону: " + stadium.getNameOfStadium());
    }

}
