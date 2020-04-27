package Model;



public class BuildingsFactory {

    public static Building getInstance(String type){
        Building res = null;
        switch (type){
            case "classic tower":
                res = new Tower(5, 10, 1);
                break;


            default:
                break;
        }
        return res;
    }
}
