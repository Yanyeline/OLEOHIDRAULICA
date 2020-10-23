package com.aplicacionescsge.oleohidraulica.certification.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProfilePage extends PageObject {

    public static Target BTN_CHANGE_NAME = Target.the("").located(By.xpath("(//button[@class='btn-env family' and contains(text(),'Cambiar nombre')])[1]"));
    public static Target TXT_NAME = Target.the("").located(By.name("name"));
    public static Target BTN_SAVE_NAME = Target.the("").located(By.xpath("(//button[@class='btn-env family' and contains(text(),'Guardar')])[2]"));
    public static Target MESSAGE_CHANGE_NAME = Target.the("").located(By.xpath("//main[1]/div[1]/div[1]/div[1]/div[2]/div[1]"));

}
