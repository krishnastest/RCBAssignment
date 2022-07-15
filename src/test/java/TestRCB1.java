import Player.*;
import com.google.gson.Gson;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

import org.json.JSONObject.*;


public class TestRCB {

    @Test
    public void findLocation() throws IOException {
        Gson gson = new Gson();

        Path relativepath = Paths.get("src/test/java/players.json");
        String jsonText = Files.readString(relativepath);

        AllPlayers playersdata = gson.fromJson(jsonText, AllPlayers.class);

        Object playerlist = playersdata.getPlayer();
        System.out.println(playerlist);



    }
    public static void printJsonObject(JSONObject jsonObj) {
        for (String keyStr : jsonObj.keySet()) {
            Object keyvalue = jsonObj.get(keyStr);

            //Print key and value
            System.out.println("key: "+ keyStr + " value: " + keyvalue);

            //for nested objects iteration if required
            //if (keyvalue instanceof JSONObject)
            //    printJsonObject((JSONObject)keyvalue);
        }
    }

    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();

        Path relativepath = Paths.get("src/test/java/players.json");
        String jsonText = Files.readString(relativepath);

        JSONObject playersdata = gson.fromJson(jsonText, JSONObject);

        printJsonObject(playersdata);
    }
}
