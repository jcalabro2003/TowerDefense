package Model;



import java.util.ArrayList;

public class Tower extends Building implements Runnable{

    private int damage;
    private int range;
    private int reloading;
    private Thread thread;
    private ArrayList<PNJ> pnjsInRange = new ArrayList<>();

    public Tower(int damage, int range, int reloading){
        super();
        this.damage = damage;
        this.range = range;
        this.reloading = reloading;
        this.thread.start();

    }

    public void shoot(PNJ pnj){
            Projectile newProjectile = new Projectile(pnj);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(reloading);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
