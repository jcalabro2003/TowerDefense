package Model;



public class Projectile extends GameObject implements Movable {

    private Tower tower;
    private PNJ target;


    public Projectile(PNJ pnj){
        target = pnj;

    }



    @Override
    public void move() {

    }
}
