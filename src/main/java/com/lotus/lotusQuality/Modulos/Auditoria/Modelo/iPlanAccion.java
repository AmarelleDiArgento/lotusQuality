/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Auditoria.Modelo;

import com.lotus.lotusQuality.Modulos.Auditoria.Modelo.Interfaces.PlanesAccion;
import com.lotus.lotusQuality.Modulos.Auditoria.Modelo.Tabs.PlanAccion;
import java.util.List;
import org.hibernate.Session;

public class iPlanAccion implements PlanesAccion {

    private Session session;

    public iPlanAccion(Session session) {
        this.session = session;
    }

    @Override
    public void insert(PlanAccion o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(PlanAccion o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PlanAccion oneId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PlanAccion oneName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PlanAccion> all() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
