package lab_rob6;

public class CoachStadium implements MethodsForStadium, Footballer.AddMethod{
    int length;
    int width;
    int capacity;
    String nameOfStadium;

    String name;
    int age;
    double skills;
    int trophies;

    public CoachStadium(int length, int width, int capacity, String nameOfStadium, String name, int age, double skills, int trophies) {
        this.length = length;
        this.width = width;
        this.capacity = capacity;
        this.nameOfStadium = nameOfStadium;
        this.name = name;
        this.age = age;
        this.skills = skills;
        this.trophies = trophies;
    }

    public int showAge() {
        return age;
    }


    public void improveSkills(boolean win, double w, double lD) {
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


    public int square() {
        return length*width;
    }


    public void matches(int m) {
        System.out.println("Кількість зіграних матчів на цьому стадіоні: " + m);
    }

    public void showStadium(String city){ //Метод вкладеного інтерфейсу
        System.out.println("Вмістимість стадіону: " + capacity + ", назва стадіону: " + nameOfStadium + ", місто в якому розташований стадіон: " + city);
    }
}
