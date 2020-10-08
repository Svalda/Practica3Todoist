package pages;

import control.Button;
import org.openqa.selenium.By;

public class MainPage {

    public Button startSessionButton = new Button(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/header/nav/div/ul[2]/li[1]/a"),"[startSession] Button on main page");

    public MainPage(){

    }

}


