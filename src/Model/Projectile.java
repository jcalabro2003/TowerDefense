package Model;



public class Projectile extends GameObject implements Movable {

    private Tower tower;
    private PNJ target;
    private int velocity;
    private int damage;


    public Projectile(PNJ target, int damage){
        super();
        this.target = target;
        this.damage = damage;

    }



    @Override
    public void move(int x, int y) {
        double theta = Math.atan2(y - this.getPosY(), x - this.getPosX());          //calcul l'angle entre la droite qui relie le projectile et le pnj et l'axe des x
        this.setPosX( (int) (this.posX + velocity * Math.cos(theta) ));             //déplacement du projectile vers le pnj
        this.setPosY( (int) (this.posY + velocity * Math.sin(theta) ));

    }

    public int getDamage() {
        return damage;
    }
}
