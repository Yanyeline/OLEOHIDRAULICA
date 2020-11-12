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
    //OPTIONS FOR CUSTOMER
    public static Target BTN_SORTING = Target.the("").locatedBy("//tbody//td[contains(text(),'{0}')]//parent::tr//td[@class='sorting_1']");
    public static Target BTN_EDIT = Target.the("").locatedBy("//tbody//parent::tr[td[contains(text(),'{0}')]]//parent::tbody//child::tr//td[@class='child']//button[@class='btn-edit']");
    public static Target BTN_VIEW = Target.the("").locatedBy("//tbody//parent::tr[td[contains(text(),'{0}')]]//parent::tbody//child::tr//td[@class='child']//button[@class='btn-view']");
    //FORM EDIT-VIEW FIELDS
    public static Target TXT_NAME_UPDATE = Target.the("").located(By.id("cliente_update"));
    public static Target TXT_EMAIL_UPDATE = Target.the("").located(By.id("correo_cliente_update"));
    public static Target TXT_NIT_UPDATE = Target.the("").located(By.id("nit_update"));
    public static Target TXT_ADDRESS_UPDATE = Target.the("").located(By.id("direccion_update"));
    public static Target TXT_TEL_UPDATE = Target.the("").located(By.id("telefono_update"));
    public static Target TXT_CONTACT_UPDATE= Target.the("").located(By.id("contacto_update"));
    public static Target TXT_EMAIL_CONTACT_UPDATE = Target.the("").located(By.id("correo_contacto_update"));
    public static Target TXT_CEL_UPDATE = Target.the("").located(By.id("celular_update"));
    public static Target BTN_UPDATE = Target.the("").located(By.xpath("//p[contains(text(),'Actualizar')]"));








}
