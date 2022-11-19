package lab_rob5;

public class Stadium extends Coach {
    private int length;
    private int width;
    private int capacity;
    private String nameOfStadium;

    Stadium(int length, int width, int capacity, String nameOfStadium) {
        super();
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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        int c = capacity*2;
        this.capacity = c;
    }

    public String getNameOfStadium() {
        return nameOfStadium;
    }

    public void setNameOfStadium(String nameOfStadium) {
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
    void showInformationAboutStadium(Team team, Coach coach){
        System.out.println("Кількість людей які тренуються на полі: " + team.getPlayers() + ", імя коуча команди: " + super.getName());
    }

    void matches(int m){
        System.out.println(showAge(54.0));
        System.out.println("Кількість зіграних матчів на цьому стадіоні: " + m);
    }
    
    @Override
    void results(boolean k){
        int fans = 60000;
        System.out.println("Середня відвідуваність на початку сезону: " + fans);            // перевантажений метод в ієрархії наслідування
        if (k == true){
            fans += 10000;
            System.out.println("Команда проводить хороший сезон");
            System.out.println("Відвідуваність матчів збільшилась: " + fans);
        } else {
            System.out.println("Відвідуваність не змінилася");
        }
    }

    void someInfo() {
        String date = "11.08.2018";
        System.out.println("Найбільш відвідуваний матч відбувся: " + date);
    }
}
