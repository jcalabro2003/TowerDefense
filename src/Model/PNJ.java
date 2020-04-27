package Model;



public class PNJ extends GameObject implements Movable {

    private int health;
    private int speed;


    public PNJ(int health, int speed){
        this.health = health;
        this.speed = speed;

    }

    @Override
    public void move() {

    }
}
