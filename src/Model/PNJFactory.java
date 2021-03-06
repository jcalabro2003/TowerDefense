package Model;

import org.jetbrains.annotations.NotNull;

public class PNJFactory {

    public static PNJ getInstance(@NotNull String type){
        PNJ res = null;
        switch (type){
            case ("basic"):
                res = new PNJ(100, 5);
                break;
            case ("tank"):
                res = new PNJ(500, 3);
                break;
            case ("fast"):
                res = new PNJ(70, 10);
                break;
            default: break;
        }
        return res;
    }
}
