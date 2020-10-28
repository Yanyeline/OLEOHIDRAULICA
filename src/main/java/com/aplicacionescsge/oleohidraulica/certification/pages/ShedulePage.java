package com.aplicacionescsge.oleohidraulica.certification.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShedulePage {

    public static Target TABLE_SCHEDULE = Target.the("").locatedBy("//tbody//td[contains(text(),'{0}')]//parent::tr");
    public static Target TXT_SEARCH_SCHEDULE = Target.the("").located(By.xpath("//div[@id='cronogramaTable_filter']//input[@type='search']"));

    public static Target BTN_ADD_SCHEDULE = Target.the("").located(By.xpath("//button[@class='btn-reg']"));

    public static Target BTN_SORTING = Target.the("").locatedBy(
            "//tbody//td[contains(text(),'{0}')]//parent::tr//td[@class='sorting_1']");
    public static Target BTN_EDIT = Target.the("").locatedBy(
            "//tbody//parent::tr[td[contains(text(),'{0}')]]//parent::tbody//child::tr//td[@class='child']//button[@class='btn-edit']");

    public static Target BTN_VIEW = Target.the("").locatedBy(
            "//tbody//parent::tr[td[contains(text(),'{0}')]]//parent::tbody//child::tr//td[@class='child']//button[@class='btn-view']");



    public static Target DDL_PLANT = Target.the("").located(By.id("planta"));
    public static Target DDL_PLANT_OPTION = Target.the("").locatedBy(
            "//div[@class='form-group']//select[@id='planta']//option[contains(text(),'{0}')]");

    public static Target TXT_EXECUTANT = Target.the("").located(By.id("ejecutor"));
    public static Target DDL_LOCATION = Target.the("").located(By.id("ubicacion"));
    public static Target DDL_LOCATION_OPTION = Target.the("").locatedBy(
            "//div[@class='form-group']//select[@id='ubicacion']//option[contains(text(),'{0}')]");

    public static Target TXT_START_DATE = Target.the("").located(By.id("fechaTemprano"));
    public static Target TXT_TEAM = Target.the("").located(By.id("equipo"));
    public static Target TXT_START_END_DATE = Target.the("").located(By.id("fechaFinTemprano"));
    public static Target TXT_DENOMINATION = Target.the("").located(By.id("denominacion"));

    public static Target TXT_START_TIME = Target.the("").located(By.id("horaTemprano"));

    public static Target TXT_ORDER = Target.the("").located(By.id("orden"));
    public static Target TXT_START_END_TIME = Target.the("").located(By.id("horaFinTemprano"));
    public static Target TXT_OPERATION = Target.the("").located(By.id("operacion"));

    public static Target BTN_SAVE = Target.the("").located(By.xpath("//button[@class='btn-env ']//p[contains(text(),'Guardar')]"));
    public static Target BTN_CLOSE = Target.the("").located(By.xpath("(//a[@class='btn-close ']//p[contains(text(),'Cerrar')])[1]"));


}
