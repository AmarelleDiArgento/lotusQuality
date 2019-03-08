/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Presentacion.Servicios;

import com.lotus.lotusQuality.Modulos.Presentacion.Servicios.Interfaces.RolService;
import com.google.gson.JsonObject;
import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.RolImp;
import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Tabs.Rol;
import java.util.List;

public class RolServiceImpl implements RolService {

    private RolImp _Rol;

    @Override
    public void insert(Rol o) {
        _Rol.insert(o);
    }

    @Override
    public void update(Rol o) {
        _Rol.update(o);
    }

    @Override
    public void delete(Long id) {
        _Rol.delete(id);
    }

    @Override
    public Rol oneId(Long id) {
        return _Rol.oneId(id);
    }

    @Override
    public Rol oneName(String name) {
        return _Rol.oneName(name);
    }

    @Override
    public List<Rol> all() {
        return _Rol.all();
    }

    @Override
    public JsonObject jFile(List<Rol> lo) {
        return _Rol.jFile(lo);
    }

}
