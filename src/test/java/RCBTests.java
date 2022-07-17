import Player.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;


public class RCBTests {
    ArrayList<Player> playerlist;

    //1. Arrange

    @BeforeClass
    public void beforeClass() throws IOException {
         this.playerlist = JSONReader.getPlayerArrayList();

    }

    @Test
    public void validateFourForeignPlayers() {


        int count = 0;
        //2. Act
        for (Player player: playerlist)
        {
            if (!player.getCountry().equals("India")){
                count+= 1;
            }
        }
        //3. Assert
        Assert.assertEquals(count,4);
    }

    @Test
    public void wicketKeeperTest(){
        int count = 0;
        //2. Act
        for (Player player: playerlist)
        {
            if (player.getRole().equals("Wicket-keeper")){
                count+= 1;
            }
        }
        //3. Assert
        Assert.assertEquals(count, 1);

    }

}


