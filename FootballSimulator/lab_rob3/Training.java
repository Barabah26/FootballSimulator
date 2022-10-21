package lab_rob3;

public class Training {
    final int players = 25;
    final int exercise = 5;
    final int skillsOfPlayers = 6;

    void showInfo(){
        System.out.println("Кількість гравців на тренуванні: " + players);
        if(exercise == 5){
            System.out.println("Скіли гравців прокачалися на: " + skillsOfPlayers);
        } else {
            System.out.println("Навики гравців не збільшилися");
        }
    }
    void trainingGround(final int l, final int w) {
        System.out.println("Кількість гравців на тренувальному полі: " + players);
        System.out.println("Площа тренувального поля: " + l*w);
    }
}
