package lab_rob_1;

public class Team {
    int players;
    int coaches;
    int trophies;

    public Team(int players, int coaches, int trophies) {
        this.players = players;
        this.coaches = coaches;
        this.trophies = trophies;
    }

    void sumPersonal(int staff){
        int i = players + coaches;
        System.out.println("ʳ������ ����� � ������: " + i);
        System.out.println("ʳ������ ��������� � ������: " + staff);
    }
    int trophy() {
        return trophies;
    }

}
