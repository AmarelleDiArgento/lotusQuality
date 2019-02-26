/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality.Configuracion;

import com.google.gson.JsonObject;
import java.util.List;

/**
 *
 * @author almoreno
 */
public interface DAO<K, O, N> {

    void insert(O o);

    void update(O o);

    void delete(K id);

    O oneId(K id);

    O oneName(N name);

    List<O> all();

    JsonObject jFile(List<O> lo);
}
