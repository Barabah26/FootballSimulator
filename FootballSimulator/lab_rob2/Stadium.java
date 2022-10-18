package lab_rob2;

public class Stadium {
    int length;
    int width;
    int capacity;
    String nameOfStadium;

    Stadium(int length, int width, int capacity, String nameOfStadium) {
        this.length = length;
        this.width = width;
        this.capacity = capacity;
        this.nameOfStadium = nameOfStadium;
    }

    public Stadium() {
    }

    public Stadium(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Stadium(int capacity, String nameOfStadium) {
        this.capacity = capacity;
        this.nameOfStadium = nameOfStadium;
    }

    int square(){
        return length*width;
    }
    void showStadium(String city){
        System.out.println("Вмістимість стадіону: " + capacity + ", назва стадіону: " + nameOfStadium + ", місто в якому розташований стадіон: " + city);
    }
    double square(double length, double width){   //перевизначений метод
        return length*width;
    }

    void improve(int newCapacity, String... names){ //  метод із статичним імям і динамічною логікою
        System.out.println("Вмістимість стадіону після модернізації стадіону: " + newCapacity);
        System.out.println("Варіанти нової назви стадіону: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
    Stadium stUp(int i, int c, String n){
        Stadium stadium = new Stadium(length + i, width + i, capacity*c, nameOfStadium + n);  //метод посилкового типу
        return stadium;
    }
    int fans(int sector) {  // рекурсивний метод
        int c = 3;
        if (sector == 1) {
            return sector;
        }else if(sector <= 10){
            int s = fans(sector - 1)*c;
            return s;
        }else {
            return 0;
        }
    }

}
