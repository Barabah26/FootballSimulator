package lab_rob3;

public class Footballer {
    static int age = 23;
    static double weight;
    static double height;
    static {
        weight = 76.9;
        height = 85.6;
    }
    static void index() {
        double index = weight / (height*height);  // індекс маси тіла
        System.out.println("Індекс маси тіла: " + index);
    }
    static void showInformationAboutPlayer(){
        System.out.println("Вік гравця: " + age + ", вага: " + weight + ", зріст: " + height + ", ");
        index();
    }
}
