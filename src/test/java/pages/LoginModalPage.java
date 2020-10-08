package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginModalPage {

    public TextBox emailTexBox = new TextBox(By.xpath("//*[@id=\"email\"]"),"[email] textbox on Login Modal Page");
    public TextBox passwordTexBox = new TextBox(By.xpath("//*[@id=\"password\"]"),"[password] textbox on Login Modal Page");
    public Button inicieSesionButton = new Button(By.xpath("//*[@id=\"login_form\"]/button"),"[inicieSesion] button on Login Modal Page");




}








