/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality.Configuracion;

import com.lotusQuality.Modelo.Interfaces.Roles;
import com.lotusQuality.Modelo.Interfaces.Usuarios;

/**
 *
 * @author almoreno
 */
public interface Administrador {

    Usuarios getUsuario();

    Roles getRol();
}
