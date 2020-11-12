package com.aplicacionescsge.oleohidraulica.certification.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MaintenancePage {

    //TABLE
    public static Target SEARCH_MAINTENANCE = Target.the("").located(By.xpath("//div[@id='mantenimientoTable_filter']//input[@type='search']"));
    //OPTIONS
    public static Target BTN_VIEW = Target.the("").locatedBy("//tbody//parent::tr[td[contains(text(),'{0}')]]//button[2]");
    //BTN MODAL OPTIONS
    public static Target BTN_CONTINUE_UPDATE = Target.the("").located(By.id("infoContinue_update"));
    public static Target BTN_ADS_CONTINUE_UPDATE = Target.the("").located(By.id("adsContinue_update"));

    //MODAL FIELDS
    public  static  Target TXT_N_COTIZACION_UPDATE = Target.the("").located(By.id("n_cotizacion_update"));
    public  static  Target TXT_F_COTIZACION_UPDATE = Target.the("").located(By.id("fecha_cotizacion_update"));
    public  static  Target TXT_CLIENTE_UPDATE = Target.the("").located(By.id("ContactoCliente_update"));
    public  static  Target TXT_OT_UPDATE = Target.the("").located(By.id("numeroOT_update"));
    public  static  Target TXT_PLACA_UPDATE = Target.the("").located(By.id("Placa_update"));
    
    //NEW MAINTENANCE COT -> COTIZACIÓN STEP 1
    public static  Target BTN_NEW = Target.the("").located(By.id("modalToggle"));
    public static  Target TXT_N_COT = Target.the("").located(By.id("n_cotizacion"));
    public static  Target TXT_FECHA_COT = Target.the("").located(By.id("fecha_cotizacion"));
    public static  Target BTN_COT_INICIAL = Target.the("").located(By.id("Cinicial"));
    public static  Target BTN_COT_FINAL = Target.the("").located(By.id("Cfinal"));
    public static  Target DDL_CONTACTO_CLIENTE = Target.the("").located(By.id("ContactoCliente"));
    public static  Target DDL_CONTACTO_CLIENTE_OPTION = Target.the("").locatedBy("//div[@class='form-group']//select[@name='ContactoCliente']//option[contains(text(),'{0}')]");
    public static  Target BTN_CONTINUE = Target.the("").located(By.id("infoContinue"));
    //STEP 2
    public static  Target TXT_OT = Target.the("").located(By.id("numeroOT"));
    public static  Target BTN_ADS_CONTINUE = Target.the("").located(By.id("adsContinue"));
    //STEP 3
    public static  Target TXT_DESCRIPCION = Target.the("").located(By.id("descripcionTrabajoRealizar"));
    public static  Target TXT_EQUIPO = Target.the("").located(By.id("Equipo"));
    public static  Target TXT_FECHA_INGRESO = Target.the("").located(By.id("fechaIngreso"));
    public static  Target TXT_FECHA_SALIDA = Target.the("").located(By.id("fechaSalida"));
    public static  Target TXT_KILOMETRAJE = Target.the("").located(By.id("Kilometraje"));
    public static  Target TXT_HORA_INGRESO = Target.the("").located(By.id("horaIngreso"));
    public static  Target TXT_HORA_SALIDA = Target.the("").located(By.id("horaSalida"));
    public static  Target TXT_UBICACION = Target.the("").located(By.id("spinnerUbicacion"));
    public static  Target TXT_PLACA= Target.the("").located(By.id("Placa"));
    public static  Target TXT_HOROMETRO = Target.the("").located(By.id("Horometro"));
    public static  Target BTN_PLACEMENT_CONTINUE = Target.the("").located(By.id("placementContinue"));
    //STEP 4
    public static  Target DDL_MIXER = Target.the("").located(By.id("spinnerMixer"));
    public static  Target DDL_MIXER_OPTION = Target.the("").locatedBy("//div[@class='form-group']//select[@name='spinnerMixer']//option[contains(text(),'{0}')]");
    public static  Target DDL_AUTOBOMBA = Target.the("").located(By.id("spinnerAutobomba"));
    public static  Target DDL_AUTOBOMBA_OPTION = Target.the("").locatedBy("//div[@class='form-group']//select[@name='spinnerAutobomba']//option[contains(text(),'{0}')]");
    public static  Target DDL_CARGADOR = Target.the("").located(By.id("spinnerCargador"));
    public static  Target DDL_CARGADOR_OPTION = Target.the("").locatedBy("//div[@class='form-group']//select[@name='spinnerCargador']//option[contains(text(),'{0}')]");
    public static  Target DDL_BOMBA = Target.the("").located(By.id("spinnerBombaEstacionaria"));
    public static  Target DDL_BOMBA_OPTION = Target.the("").locatedBy("//div[@class='form-group']//select[@name='spinnerBombaEstacionaria']//option[contains(text(),'{0}')]");
    public static  Target DDL_PLANTA = Target.the("").located(By.id("spinnerPlanta"));
    public static  Target DDL_PLANTA_OPTION = Target.the("").locatedBy("//div[@class='form-group']//select[@name='spinnerPlanta']//option[contains(text(),'{0}')]");
    public static  Target BTN_SCHEDULE_CONTINUE = Target.the("").located(By.id("scheduleContinue"));
    //STEP 5
    public static  Target BTN_ADD = Target.the("").located(By.id("add"));
    public static  Target TXT_PERSONAL = Target.the("").located(By.id("numero_personas"));
    public static  Target DDL_ESPECIALIDAD = Target.the("").located(By.xpath("//select[@class = 'form-control especialidad']"));
    public static  Target DDL_ESPECIALIDAD_OPTION = Target.the("").locatedBy("//select[@class = 'form-control especialidad']//option[contains(text(),'{0}')]");
    public static  Target TXT_FECHA = Target.the("").located(By.xpath("//input[@class = 'form-control fecha']"));
    public static  Target TXT_HOTEL = Target.the("").located(By.xpath("//input[@class = 'form-control hotel']"));
    public static  Target TXT_ALIMENTACION = Target.the("").located(By.xpath("//input[@class = 'form-control alimentacion']"));
    public static  Target TXT_TRANSPORTE = Target.the("").located(By.xpath("//input[@class = 'form-control transporte']"));
    public static  Target BTN_VIATICOS_CONTINUE = Target.the("").located(By.id("viaticosContinue"));
    //STEP 6
    public static  Target BTN_ADD_T = Target.the("").located(By.id("add_trabajos"));
    public static  Target TXT_DESCRIPCION_T = Target.the("").located(By.id("descripcion_t_e"));
    public static  Target TXT_COSTO_T = Target.the("").located(By.xpath("//input[@class = 'form-control costo_t']"));
    public static  Target TXT_AUI_T = Target.the("").located(By.xpath("//input[@class = 'form-control aui_t']"));
    public static  Target BTN_EXTERNOS_CONTINUE = Target.the("").located(By.id("externosContinue"));
    //STEP 7
    public static  Target BTN_ADD_MANO_O = Target.the("").located(By.id("add_mano_o"));
    public static  Target TXT_PERSONAL_MANO_O = Target.the("").located(By.id("personal_mano_o"));
    public static  Target DDL_ESPECIALIDAD_MANO_O = Target.the("").located(By.id("especialidad_mano_o"));
    public static  Target DDL_ESPECIALIDAD_MANO_O_OPTION = Target.the("").locatedBy("//select[@id = 'especialidad_mano_o']//option[contains(text(),'{0}')]");
    public static  Target TXT_DIURNO_M = Target.the("").located(By.xpath("diurno_mano"));
    public static  Target TXT_NOTURNO_M = Target.the("").located(By.id("nocturno_mano"));
    public static  Target TXT_FESTIVO_M = Target.the("").located(By.id("festivo_mano"));
    public static  Target TXT_HORAS_T = Target.the("").located(By.id("horas_trabajadas"));
    public static  Target BTN_MANO_CONTINUE = Target.the("").located(By.id("mano_oContinue"));
    //STEP 8
    public static  Target BTN_ADD_R = Target.the("").located(By.id("add_repuestos"));
    public static  Target TXT_DESCRIPCION_R = Target.the("").located(By.id("descripcion_repuesto"));
    public static  Target TXT_CANTIDAD_R = Target.the("").located(By.id("cantidad_repuesto"));
    public static  Target TXT_VALOR_UNITARIO = Target.the("").located(By.id("valor_unt_repuesto"));
    public static  Target TXT_AUI_R = Target.the("").located(By.id("aiu_repuesto"));
    public static  Target BTN_REPUESTOS_CONTINUE = Target.the("").located(By.id("repuestosContinue"));
    //STEP 9
    public static  Target TXT_IVA = Target.the("").located(By.id("iva"));
    public static  Target BTN_TOTAL_CONTINUE = Target.the("").located(By.id("totalContinue"));
    //STEP 10
    public static  Target TXT_IMAGEN_1 = Target.the("").located(By.id("imagen1"));
    public static  Target TXT_IMAGEN_2 = Target.the("").located(By.id("imagen2"));
    public static  Target TXT_IMAGEN_3 = Target.the("").located(By.id("imagen3"));
    public static  Target TXT_IMAGEN_4 = Target.the("").located(By.id("imagen4"));
    public static  Target TXT_IMAGEN_5 = Target.the("").located(By.id("imagen5"));
    public static  Target TXT_IMAGEN_6 = Target.the("").located(By.id("imagen6"));
    public static  Target DDL_FORMA = Target.the("").located(By.id("forma"));
    public static  Target DDL_FORMA_OPTION = Target.the("").locatedBy("//select[@id = 'forma']//option[contains(text(),'{0}')]");
    public static  Target TXT_VIGENCIA = Target.the("").located(By.id("vigencia"));
    public static  Target TXT_LUGAR = Target.the("").located(By.id("lugar"));
    public static  Target TXT_ATT = Target.the("").located(By.id("att"));
    public static  Target TXT_OBSERVACIONES_T = Target.the("").located(By.id("Observaciones"));
    public static  Target BTN_SAVE = Target.the("").located(By.id("save"));
    public static  Target BTN_CERRAR = Target.the("").located(By.id("limpiarbarra"));






}
