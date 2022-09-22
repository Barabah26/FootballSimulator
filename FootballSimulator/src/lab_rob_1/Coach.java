package lab_rob_1;

public class Coach {
    String name;
    int age;
    double skills;
    int trophies;

    public Coach(String name, int age, double skills, int trophies) {
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

}
