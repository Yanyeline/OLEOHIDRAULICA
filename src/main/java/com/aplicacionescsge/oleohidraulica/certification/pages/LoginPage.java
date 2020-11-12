package com.aplicacionescsge.oleohidraulica.certification.pages;

import com.aplicacionescsge.oleohidraulica.certification.utils.constants.Constants;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl(Constants.URL_LOGIN_PAGE) // indica la página que abrirá el driver al iniciar la prueba.

public class LoginPage extends PageObject {

    public static Target TXT_EMAIL = Target.the("").located(By.id("email"));
    public static Target TXT_PASSWORD = Target.the("").located(By.id("password"));
    public static Target BTN_LOGIN = Target.the("").located(By.xpath("//button[contains(text(),'Iniciar')]"));
    public static Target MESSAGE_INVALID = Target.the("").located(By.xpath("//span[@class='invalid-feedback']"));
    public static Target LINK_RECOVER_PASSWORD = Target.the("").located(By.xpath("//a[@class='family btn btn-link']"));
    public static Target BTN_RECOVER_PASSWORD = Target.the("").located(By.xpath("//button[@type='submit' or contains(@class,'btn-res')]"));

}
