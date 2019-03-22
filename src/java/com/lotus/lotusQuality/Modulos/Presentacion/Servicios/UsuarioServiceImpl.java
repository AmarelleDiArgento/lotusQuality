/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Presentacion.Servicios;

import com.lotus.lotusQuality.Modulos.Presentacion.Servicios.Interfaces.UsuarioService;
//import com.google.gson.JsonObject;
import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Tabs.Usuario;
import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.UsuarioImp;
import java.util.List;

public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioImp _Usuario;

    @Override
    public void insert(Usuario o) {
        _Usuario.insert(o);
    }

    @Override
    public void update(Usuario o) {
        _Usuario.update(o);
    }

    @Override
    public void delete(String id) {
        _Usuario.delete(id);
    }

    @Override
    public Usuario oneId(String id) {
        return _Usuario.oneId(id);
    }

    @Override
    public Usuario oneName(String name) {
        return _Usuario.oneName(name);
    }

    @Override
    public List<Usuario> all() {
        return _Usuario.all();
    }

//    @Override
//    public JsonObject jFile(List<Usuario> lo) {
//        return _Usuario.jFile(lo);
//    }
}
