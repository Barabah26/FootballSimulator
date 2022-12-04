package lab_rob6;

import java.net.InterfaceAddress;

public class Footballer extends Team {
    public Footballer(int players, int coaches, int trophies) {
        super(players, coaches, trophies);
    }
    public void sumPersonal(int staff){
        int i = players + coaches;
        System.out.println("Кількість людей в команді: " + i);
        System.out.println("Кількість персоналу в команді: " + staff);
    }
    public void trophy() {
        System.out.println("Трофеї команди: " + trophies);
    }


    public interface AddMethod {
        void showStadium(String city);  //Вкладений інтерфейс
    }
}
