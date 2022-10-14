package lab_rob2;

public class Coach{
    String name;
    int age;
    double skills;
    int trophies;

    Coach(String name, int age, double skills, int trophies) {
        this.name = name;
        this.age = age;
        this.skills = skills;
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
        System.out.println("Клуби в яких тренер проходив навчання: " + clubs);
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
}
