package lab_rob4;

public class U19 extends Team{
    U19(int players, int coaches, int trophies) {
        super(players, coaches, trophies);
    }

    public U19() {

    }


    void averageAge(int a, int b, int c){
        showInformationAboutTeamDemo();
        int age = ((a*7) + (b*8) + (c*6))/21;
        System.out.println("Середній вік футболістів: " + age);
    }
    void test(){
        Striker striker = new Striker();
        striker.strikers(3);
    }
    class Striker{
        void strikers(int s){
            System.out.println("Кількість нападників в команді: " + s);
            averageAge(20,18,19);
        }
    }
    void info(){
        showName("Shakhtar Donetsk");
        System.out.println("Кількість гравців в команді: " + getPlayers() + ", кількість тренерів: " + getCoaches() + ", кількість трофеїв: " + getTrophies());
    }
}
