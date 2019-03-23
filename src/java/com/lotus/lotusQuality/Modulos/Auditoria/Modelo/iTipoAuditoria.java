/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Auditoria.Modelo;

import com.lotus.lotusQuality.Modulos.Auditoria.Modelo.Interfaces.TiposAuditoria;
import com.lotus.lotusQuality.Modulos.Auditoria.Modelo.Tabs.TipoLista;
import java.util.List;
import org.hibernate.Session;

public class iTipoAuditoria implements TiposAuditoria {

    private Session session;

    public iTipoAuditoria(Session session) {
        this.session = session;
    }

    @Override
    public void insert(TipoLista o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(TipoLista o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TipoLista oneId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TipoLista oneName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TipoLista> all() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
