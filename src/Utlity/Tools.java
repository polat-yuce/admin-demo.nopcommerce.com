package Utlity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Tools {

    public static void Bekle(int sn) {

        try {
            Thread.sleep(1000 * sn);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static int randomGenerator(int sinir){
        return (int)(Math.random()*sinir);
    }


}
