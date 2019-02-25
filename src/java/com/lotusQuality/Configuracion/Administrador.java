/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality.Configuracion;

import com.lotusQuality.Modelo.Interfaces.Eventos;
import com.lotusQuality.Modelo.Interfaces.Procesos;
import com.lotusQuality.Modelo.Interfaces.Roles;
import com.lotusQuality.Modelo.Interfaces.SubProcesos;
import com.lotusQuality.Modelo.Interfaces.Usuarios;
import com.lotusQuality.Modelo.Interfaces.Actividades;
import com.lotusQuality.Modelo.Interfaces.Tareas;

/**
 *
 * @author almoreno
 */
public interface Administrador {

    Usuarios getUsuario();

    Roles getRol();

    Eventos getEvento();

    Procesos getProceso();

    SubProcesos getSubProceso();

    Actividades getActividades();

    Tareas getTareas();

}
