package TUyen;

public class Athlete extends HomoSapien {
    public Athlete(int weight, int height, int age) {
        super(weight, height, age);
    }
    public void run(){
        System.out.println("run ");
    }
    public void jump(){
        System.out.println("jump ");
    }
}
