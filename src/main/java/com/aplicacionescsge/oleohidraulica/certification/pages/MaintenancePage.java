package com.aplicacionescsge.oleohidraulica.certification.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MaintenancePage {

    //TABLE
    public static Target SEARCH_MAINTENANCE = Target.the("").located(By.xpath("//div[@id='mantenimientoTable_filter']//input[@type='search']"));

    //OPTIONS
    public static Target BTN_VIEW = Target.the("").locatedBy("//tbody//parent::tr[td[contains(text(),'{0}')]]//button[2]");
    public static Target BTN_EDIT = Target.the("").locatedBy("//tbody//parent::tr[td[contains(text(),'{0}')]]//button[1]");

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
    public static  Target TXT_FECHA_SALIDA_MANO_O = Target.the("").locatedBy("//input[@class= 'form-control fecha_m']");
    public static  Target TXT_DIURNO_M = Target.the("").located(By.id("diurno_mano"));
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

    //EDIT MAINTENANCE COT -> COTIZACIÓN STEP 1
    public static  Target BTN_NEW_UPD = Target.the("").located(By.id("modalToggle_update"));
    public static  Target TXT_N_COT_UPD = Target.the("").located(By.id("n_cotizacion_update"));
    public static  Target TXT_FECHA_COT_UPD = Target.the("").located(By.id("fecha_cotizacion_update"));
    public static  Target DDL_TIPO_COT_UPD = Target.the("").locatedBy("//input[@name='C{0}_update']");
    public static  Target DDL_CONTACTO_CLIENTE_UPD = Target.the("").located(By.id("ContactoCliente_update"));
    public static  Target DDL_CONTACTO_CLIENTE_OPTION_UPD = Target.the("").locatedBy("//div[@class='form-group']//select[@name='ContactoCliente_update']//option[contains(text(),'{0}')]");
    public static  Target BTN_CONTINUE_UPD = Target.the("").located(By.id("infoContinue_update"));
    //STEP 2
    public static  Target TXT_OT_UPD = Target.the("").located(By.id("numeroOT_update"));
    public static  Target BTN_ADS_CONTINUE_UPD = Target.the("").located(By.id("adsContinue_update"));
    //STEP 3
    public static  Target TXT_DESCRIPCION_UPD = Target.the("").located(By.id("descripcionTrabajoRealizar_update"));
    public static  Target TXT_EQUIPO_UPD = Target.the("").located(By.id("Equipo_update"));
    public static  Target TXT_FECHA_INGRESO_UPD = Target.the("").located(By.id("fechaIngreso_update"));
    public static  Target TXT_FECHA_SALIDA_UPD = Target.the("").located(By.id("fechaSalida_update"));
    public static  Target TXT_KILOMETRAJE_UPD = Target.the("").located(By.id("Kilometraje_update"));
    public static  Target TXT_HORA_INGRESO_UPD = Target.the("").located(By.id("horaIngreso_update"));
    public static  Target TXT_HORA_SALIDA_UPD = Target.the("").located(By.id("horaSalida_update"));
    public static  Target TXT_UBICACION_UPD = Target.the("").located(By.id("spinnerUbicacion_update"));
    public static  Target TXT_PLACA_UPD= Target.the("").located(By.id("Placa_update"));
    public static  Target TXT_HOROMETRO_UPD = Target.the("").located(By.id("Horometro_update"));
    public static  Target BTN_PLACEMENT_CONTINUE_UPD = Target.the("").located(By.id("placementContinue_update"));
    //STEP 4
    public static  Target DDL_MIXER_UPD = Target.the("").located(By.id("spinnerMixer_update"));
    public static  Target DDL_MIXER_OPTION_UPD = Target.the("").locatedBy("//div[@class='form-group']//select[@name='spinnerMixer_update']//option[contains(text(),'{0}')]");
    public static  Target DDL_AUTOBOMBA_UPD = Target.the("").located(By.id("spinnerAutobomba_update"));
    public static  Target DDL_AUTOBOMBA_OPTION_UPD = Target.the("").locatedBy("//div[@class='form-group']//select[@name='spinnerAutobomba_update']//option[contains(text(),'{0}')]");
    public static  Target DDL_CARGADOR_UPD = Target.the("").located(By.id("spinnerCargador_update"));
    public static  Target DDL_CARGADOR_OPTION_UPD = Target.the("").locatedBy("//div[@class='form-group']//select[@name='spinnerCargador_update']//option[contains(text(),'{0}')]");
    public static  Target DDL_BOMBA_UPD = Target.the("").located(By.id("spinnerBombaEstacionaria_update"));
    public static  Target DDL_BOMBA_OPTION_UPD = Target.the("").locatedBy("//div[@class='form-group']//select[@name='spinnerBombaEstacionaria_update']//option[contains(text(),'{0}')]");
    public static  Target DDL_PLANTA_UPD = Target.the("").located(By.id("spinnerPlanta_update"));
    public static  Target DDL_PLANTA_OPTION_UPD = Target.the("").locatedBy("//div[@class='form-group']//select[@name='spinnerPlanta_update']//option[contains(text(),'{0}')]");
    public static  Target BTN_SCHEDULE_CONTINUE_UPD = Target.the("").located(By.id("scheduleContinue_update"));
    //STEP 5
    public static  Target BTN_ADD_UPD = Target.the("").located(By.id("add_v_update"));
    public static  Target TXT_PERSONAL_UPD = Target.the("").located(By.xpath("//input[@class = 'form-control personal_v']"));
    public static  Target DDL_ESPECIALIDAD_UPD = Target.the("").located(By.id("especialidad_update especialidad_v"));
    public static  Target DDL_ESPECIALIDAD_OPTION_UPD = Target.the("").locatedBy("//select[@id = 'especialidad_update especialidad_v']//option[contains(text(),'{0}')]");
    public static  Target TXT_FECHA_UPD = Target.the("").located(By.xpath("//input[@class = 'form-control fecha_v']"));
    public static  Target TXT_HOTEL_UPD = Target.the("").located(By.xpath("//input[@class = 'form-control hotel_v']"));
    public static  Target TXT_ALIMENTACION_UPD = Target.the("").located(By.xpath("//input[@class = 'form-control alimentacion_v']"));
    public static  Target TXT_TRANSPORTE_UPD = Target.the("").located(By.xpath("//input[@class = 'form-control transporte_v']"));
    public static  Target BTN_VIATICOS_CONTINUE_UPD = Target.the("").located(By.id("viaticosContinue_update"));
    //STEP 6
    public static  Target BTN_ADD_T_UPD = Target.the("").located(By.id("add_t_update"));
    public static  Target TXT_DESCRIPCION_T_UPD = Target.the("").located(By.id("descripcion_t_e_update"));
    public static  Target TXT_COSTO_T_UPD = Target.the("").located(By.xpath("//input[@class = 'form-control costo_t_u']"));
    public static  Target TXT_AUI_T_UPD = Target.the("").located(By.xpath("//input[@class = 'form-control aui_t_u']"));
    public static  Target BTN_EXTERNOS_CONTINUE_UPD = Target.the("").located(By.id("externosContinue_update"));
    //STEP 7
    public static  Target BTN_ADD_MANO_O_UPD = Target.the("").located(By.id("add_m_update"));
    public static  Target TXT_PERSONAL_MANO_O_UPD = Target.the("").located(By.xpath("//select[@class = 'form-control personal_m_u']"));
    public static  Target DDL_ESPECIALIDAD_MANO_O_UPD = Target.the("").located(By.xpath("//select[@id = 'form-control especialidad_m_u']"));
    public static  Target DDL_ESPECIALIDAD_MANO_O_OPTION_UPD = Target.the("").locatedBy("//select[@class = 'especialidad_m_u']//option[contains(text(),'{0}')]");
    public static Target TXT_FECHA_SALIDA_MANO_O_UPD = Target.the("").locatedBy("//input[@class= 'form-control fecha_m_u']");
    public static  Target TXT_DIURNO_M_UPD = Target.the("").located(By.xpath("//select[@class = 'form-control diurno_m_u']"));
    public static  Target TXT_NOTURNO_M_UPD = Target.the("").located(By.xpath("//select[@class = 'form-control nocturno_m_u']"));
    public static  Target TXT_FESTIVO_M_UPD = Target.the("").located(By.xpath("//select[@class = 'form-control festivo_m_u']"));
    public static  Target TXT_HORAS_T_UPD = Target.the("").located(By.xpath("//select[@class = 'form-control horas_m_u']"));
    public static  Target BTN_MANO_CONTINUE_UPD = Target.the("").located(By.id("mano_obraContinue_update"));
    //STEP 8
    public static  Target BTN_ADD_R_UPD = Target.the("").located(By.id("add_r_update"));
    public static  Target TXT_DESCRIPCION_R_UPD = Target.the("").located(By.xpath("//select[@class = 'form-control descripcion_r_u"));
    public static  Target TXT_CANTIDAD_R_UPD = Target.the("").located(By.xpath("//select[@class = 'form-control cantidad_r_u"));
    public static  Target TXT_VALOR_UNITARIO_UPD = Target.the("").located(By.xpath("//select[@class = 'form-control valor_r_u"));
    public static  Target TXT_AUI_R_UPD = Target.the("").located(By.xpath("//select[@class = 'form-control aiu_r_u"));
    public static  Target BTN_REPUESTOS_CONTINUE_UPD = Target.the("").located(By.id("repuestosContinue_update"));
    //STEP 9
    public static  Target V_UPD = Target.the("").located(By.id("v_u"));
    public static  Target M_O_UPD = Target.the("").located(By.id("m_u"));
    public static  Target T_E_UPD = Target.the("").located(By.id("t_u"));
    public static  Target R_UPD = Target.the("").located(By.id("r_u"));
    public static  Target SUBTOTAL_UPD = Target.the("").located(By.id("s_u"));
    public static  Target TXT_IVA_UPD = Target.the("").located(By.id("iva_u"));
    public static  Target TOTAL_UPD = Target.the("").located(By.id("to_u"));
    public static  Target BTN_TOTAL_CONTINUE_UPD = Target.the("").located(By.id("totalContinue_update"));
    //STEP 10
    public static  Target TXT_IMAGEN_1_UPD = Target.the("").located(By.id("imagen1_update"));
    public static  Target TXT_IMAGEN_2_UPD = Target.the("").located(By.id("imagen2_update"));
    public static  Target TXT_IMAGEN_3_UPD = Target.the("").located(By.id("imagen3_update"));
    public static  Target TXT_IMAGEN_4_UPD = Target.the("").located(By.id("imagen4_update"));
    public static  Target TXT_IMAGEN_5_UPD = Target.the("").located(By.id("imagen5_update"));
    public static  Target TXT_IMAGEN_6_UPD = Target.the("").located(By.id("imagen6_update"));
    public static  Target DDL_FORMA_UPD = Target.the("").located(By.id("forma_update"));
    public static  Target DDL_FORMA_OPTION_UPD = Target.the("").locatedBy("//select[@id = 'forma']//option[contains(text(),'{0}')]");
    public static  Target TXT_VIGENCIA_UPD = Target.the("").located(By.id("vigencia_update"));
    public static  Target TXT_LUGAR_UPD = Target.the("").located(By.id("lugar_update"));
    public static  Target TXT_ATT_UPD = Target.the("").located(By.id("att_update"));
    public static  Target TXT_OBSERVACIONES_T_UPD = Target.the("").located(By.id("Observaciones_update"));
    public static  Target BTN_SAVE_UPD = Target.the("").located(By.id("buttonEdit"));
    public static  Target BTN_CERRAR_UPD = Target.the("").located(By.id("limpiarbarra_update"));
}
