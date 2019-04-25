/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Auditoria.Modelo;

import com.lotus.lotusQuality.Modulos.Auditoria.Modelo.Interfaces.ListasChequeo;
import com.lotus.lotusQuality.Modulos.Auditoria.Modelo.Tabs.ListaChequeo;
import java.util.List;
import org.hibernate.Session;

public class iListasChequeo implements ListasChequeo {

    private Session session;

    public iListasChequeo(Session session) {
        this.session = session;
    }

    @Override
    public void insert(ListaChequeo o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ListaChequeo o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListaChequeo oneId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListaChequeo oneName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ListaChequeo> all() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
