package com.aplicacionescsge.oleohidraulica.certification.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuOption {

    public static Target OPTIONS_USER_ICON = Target.the("").located(By.xpath("//img[@class='rounded-circle']"));
    public static Target LOGOUT_ICON = Target.the("").located(By.xpath("//nav[1]/ul[1]/li[4]/div[1]/a[2]/span[1]"));
    public static Target PROFILE_ICON = Target.the("").located(By.xpath("//nav[1]/ul[1]/li[4]/div[1]/a[1]"));

    public static Target OPTION_USER = Target.the("").located(By.xpath("//span[contains(text(),'Usuarios')]"));
    public static Target OPTION_CUSTOMER = Target.the("").located(By.xpath("//span[contains(text(),'Clientes')]"));


}
