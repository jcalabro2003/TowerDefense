package Model;



import java.util.ArrayList;

public class Tower extends Building implements Runnable, Updatable{

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

    public void addPnjInRange(PNJ pnj){
        pnjsInRange.add(pnj);
    }

    public PNJ getNearest(){
        PNJ res = null;
        double distance = 0;
        for(int i=0; i<pnjsInRange.size(); i++){
            if (i == 0){
                distance = pnjsInRange.get(i).getDistance(this);
                res = pnjsInRange.get(i);
            } else {
                if (distance > pnjsInRange.get(i).getDistance(this)){
                    distance = pnjsInRange.get(i).getDistance(this);
                    res = pnjsInRange.get(i);
                }
            }
        }
        return res;
    }

    public void shoot(PNJ pnj){
            Projectile newProjectile = new Projectile(pnj, damage);
    }

    @Override
    public void run() {
        try {
            shoot(getNearest());
            Thread.sleep(reloading);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {

    }
}
