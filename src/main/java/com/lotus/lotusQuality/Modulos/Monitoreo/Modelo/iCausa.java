/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Monitoreo.Modelo;

import com.lotus.lotusQuality.Configuracion.Configuracion;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Causas;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.Causa;
import java.util.List;

public class iCausa extends Configuracion implements Causas {

    @Override
    public void insert(Causa o) {
        getSession().persist(o);

    }

    @Override
    public void update(Causa o) {
        getSession().update(o);

    }

    @Override
    public void delete(Long id) {
        Causa c = oneId(id);
        if (c != null) {
            getSession().delete(c);
        }
    }

    @Override
    public Causa oneId(Long id) {
        return (Causa) getSession().get(Causa.class, id);
    }

    @Override
    public Causa oneName(String name) {
        return (Causa) getSession().createQuery(
                "from Causa where  NombreAct = :name")
                .setParameter("name", name).uniqueResult();
    }

    @Override
    public List<Causa> all() {
        return (List<Causa>) getSession().createQuery("from Causa").list();
    }

}
