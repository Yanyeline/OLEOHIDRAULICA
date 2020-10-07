package com.aplicacionescsge.oleohidraulica.certification.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserPage {

    public static Target TABLE_USER = Target.the("").located(By.xpath("//td[contains(text(),'admin servicios')]//parent::tr//td[@tabindex]"));
    public static Target SEARCH_USER = Target.the("").located(By.xpath("//div[@id='userTable_filter']//input[@type='search']"));


}
