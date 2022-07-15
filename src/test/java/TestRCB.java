import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TestRCB
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("src/test/java/players.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray playerlist = (JSONArray) obj;
            System.out.println(playerlist);

            //Iterate over employee array
            playerlist.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parseEmployeeObject(JSONObject employee)
    {
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) employee.get("player");

        //Get employee first name
        String firstName = (String) employeeObject.get("name");
        System.out.println(firstName);

        //Get employee last name
        String lastName = (String) employeeObject.get("country");
        System.out.println(lastName);

        //Get employee website name
        String website = (String) employeeObject.get("role");
        System.out.println(website);
    }
}