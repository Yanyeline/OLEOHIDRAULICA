package com.aplicacionescsge.oleohidraulica.certification.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProfilePage extends PageObject {

    public static Target BTN_CHANGE_NAME = Target.the("").located(By.xpath("(//button[@class='btn-env family' and contains(text(),'Cambiar nombre')])[1]"));
    public static Target TXT_NAME = Target.the("").located(By.name("name"));
    public static Target BTN_SAVE_NAME = Target.the("").located(By.xpath("(//button[@class='btn-env family' and contains(text(),'Guardar')])[2]"));
    public static Target MESSAGE_CHANGE_NAME = Target.the("").located(By.xpath("//main[1]/div[1]/div[1]/div[1]/div[2]/div[1]"));

    public static Target BTN_CHANGE_PHOTO = Target.the("").located(By.xpath("//button[contains(text(),'Cambiar foto')]"));
    public static Target TXT_PHOTO_PROFILE = Target.the("").located(By.id("photo"));
    public static Target BTN_SAVE_PHOTO = Target.the("").located(By.xpath("(//button[@class='btn-env family' and contains(text(),'Guardar')])[1]"));

   /* public void loadLogoFrom(String filename) {
        upload(filename).to((WebElement) TXT_PHOTO_PROFILE);
    }*/

}
