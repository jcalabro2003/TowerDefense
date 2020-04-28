package Model;


import org.jetbrains.annotations.NotNull;

public class PNJ extends GameObject implements Movable {

    private int health;
    private int speed;
    private boolean alive = true;


    public PNJ(int health, int speed){
        super();
        this.health = health;
        this.speed = speed;


    }

    public double getDistance(@NotNull GameObject object) {
        return Math.sqrt(Math.pow(object.getPosX() - this.posX, 2) + Math.pow(object.getPosY() - this.posY, 2));
    }


    @Override
    public void move(int x, int y) {

    }

    public void receiveDamage(@NotNull Projectile p){
        health =- p.getDamage();
        if (health <= 0){
            alive = false;
        }
    }

}
