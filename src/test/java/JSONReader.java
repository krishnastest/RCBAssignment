import Player.Player;
import Player.AllPlayers;
import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class JSONReader {
    public static ArrayList<Player> getPlayerArrayList() throws IOException {
        Gson gson = new Gson();

        Path relativepath = Paths.get("src/test/java/players.json");
        String jsonText = Files.readString(relativepath);

         AllPlayers playersdata = gson.fromJson(jsonText, AllPlayers.class);

        ArrayList<Player> playerlist = playersdata.getPlayer();
        return playerlist;
    }
}
