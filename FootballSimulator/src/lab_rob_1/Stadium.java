package lab_rob_1;

public class Stadium {
    int length;
    int width;
    int capacity;
    String nameOfStadium;

    public Stadium(int length, int width, int capacity, String nameOfStadium) {
        this.length = length;
        this.width = width;
        this.capacity = capacity;
        this.nameOfStadium = nameOfStadium;
    }

    int square(){
        return length*width;
    }
    void showStadium(String city){
        System.out.println("Вмістимість стадіону: " + capacity + ", назва стадіону: " + nameOfStadium + ", місто в якому розташований стадіон: " + city);
    }
}
