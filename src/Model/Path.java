package Model;

import java.util.ArrayList;

public class Path {

    private ArrayList<Point> points = new ArrayList<>();

    public Path(ArrayList<Point> points){
        this.points = points;
    }


    public ArrayList<Point> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }
}
