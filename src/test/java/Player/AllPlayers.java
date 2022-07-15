package Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllPlayers {
    private String name;
    private String location;
    private Object player = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Object getPlayer() {
        return player;
    }

    public void setPlayer(Object player) {
        this.player = player;
    }
}