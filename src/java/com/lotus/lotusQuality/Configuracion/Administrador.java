/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Configuracion;

import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Causas;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Detalles;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Encabezados;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Fincas;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Monitores;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Novedades;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Parametros;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Postcosechas;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Productos;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Programas;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.PtoCortes;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Tipos;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Variedades;
import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Interfaces.Eventos;
import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Interfaces.Procesos;
import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Interfaces.Roles;
import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Interfaces.SubProcesos;
import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Interfaces.Usuarios;
import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Interfaces.Actividades;
import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Interfaces.Tareas;

/**
 *
 * @author almoreno
 */
public interface Administrador {

    void closeSession();

    // Presentacion y seguridad
    Usuarios getUsuario();

    Roles getRol();

    Eventos getEvento();

    Procesos getProceso();

    SubProcesos getSubProceso();

    Actividades getActividades();

    Tareas getTareas();

    // Monitoreo
    Causas getCausas();

    Detalles geDetalles();

    Encabezados getEncabezado();

    Fincas getFinca();

    Monitores getMonitor();

    Novedades getNovedad();

    Parametros getParametro();

    Postcosechas getPostcosecha();

    Productos getProductos();

    Programas getPrograma();

    PtoCortes getPtoCorte();

    Tipos getTipo();

    Variedades getVariedad();
}
