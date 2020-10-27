package com.aplicacionescsge.oleohidraulica.certification.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CustomerPage {
    //PRINCIPAL PAGE
    public static Target BTN_ADD_CUSTOMER = Target.the("").located(By.xpath("//button[@class='btn-reg']"));
    public static Target TABLE_CUSTOMER = Target.the("").locatedBy("//tbody//td[contains(text(),'{0}')]//parent::tr");
    public static Target SEARCH_CUSTOMER = Target.the("").located(By.xpath("//div[@id='clienteTable_filter']//input[@type='search']"));
    //FORM REGISTER
    public static Target TXT_NAME = Target.the("").located(By.id("cliente"));
    public static Target TXT_EMAIL = Target.the("").located(By.id("correo_cliente"));
    public static Target TXT_NIT = Target.the("").located(By.id("nit"));
    public static Target TXT_ADDRESS = Target.the("").located(By.id("direccion"));
    public static Target TXT_TEL = Target.the("").located(By.id("telefono"));
    public static Target TXT_CONTACT = Target.the("").located(By.id("contacto"));
    public static Target TXT_EMAIL_CONTACT = Target.the("").located(By.id("correo_contacto"));
    public static Target TXT_CEL = Target.the("").located(By.id("celular"));
    public static Target BTN_CLOSE = Target.the("").located(By.xpath("//a[@class='btn-close ']//p[contains(text(),'Cerrar')][1]"));
    public static Target BTN_SAVE = Target.the("").located(By.xpath("//p[contains(text(),'Guardar')]"));

}
