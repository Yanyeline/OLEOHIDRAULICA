package com.aplicacionescsge.oleohidraulica.certification.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserPage {

    public static Target TABLE_USER = Target.the("").locatedBy("//tbody//td[contains(text(),'{0}')]//parent::tr");
    public static Target SEARCH_USER = Target.the("").located(By.xpath("//div[@id='userTable_filter']//input[@type='search']"));

    public static Target BTN_ADD_USER = Target.the("").located(By.xpath("//button[@class='btn-reg']"));

    public static Target TXT_NAME = Target.the("").located(By.id("name"));
    public static Target TXT_EMAIL = Target.the("").located(By.id("email"));
    public static Target TXT_ID = Target.the("").located(By.id("identificacion"));
    public static Target DDL_ROLE = Target.the("").located(By.name("rol"));
    public static Target DDL_ROLE_OPTION = Target.the("").locatedBy("(//div[@class='form-group']//select[@name='rol']//option[contains(text(),'{0}')])[1]");

    public static Target BTN_SAVE = Target.the("").located(By.xpath("//button[@class='btn-env ']//p[contains(text(),'Guardar')]"));
    public static Target BTN_CLOSE = Target.the("").located(By.xpath("(//a[@class='btn-close ']//p[contains(text(),'Cerrar')])[1]"));

    public static Target BTN_SORTING = Target.the("").locatedBy("//tbody//td[contains(text(),'{0}')]//parent::tr//td[@class='sorting_1']");
    public static Target BTN_EDIT = Target.the("").locatedBy("//tbody//parent::tr[td[contains(text(),'{0}')]]//parent::tbody//child::tr//td[@class='child']//button[@class='btn-edit']");


    public static Target TXT_NAME_UPDATE = Target.the("").located(By.id("names"));
    public static Target TXT_EMAIL_UPDATE = Target.the("").located(By.id("emails"));
    public static Target TXT_ID_UPDATE = Target.the("").located(By.id("identificacions"));
    public static Target DDL_ROLE_UPDATE = Target.the("").located(By.id("rol_update"));
    public static Target DDL_ROLE_OPTION_UPDATE = Target.the("").locatedBy("//div[@class='form-group']//select[@id='rol_update']//option[contains(text(),'{0}')]");
    public static Target BTN_UPDATE = Target.the("").located(By.id("buttonEdit"));

    // public static Target TABLE_USER_UPDATE = Target.the("").locatedBy("//tbody//tr[td//text()[contains(., '{0}}')] and td//text()[contains(., '{1}}')] and td//text()[contains(., '{2}}')]] ");

    public static Target BTN_VIEW = Target.the("").locatedBy("//tbody//parent::tr[td[contains(text(),'{0}')]]//parent::tbody//child::tr//td[@class='child']//button[@class='btn-view']");
    public static Target BTN_USERSTATUS = Target.the("").located(By.xpath("//td[@class='sorting_1']"));
}
