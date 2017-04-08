package com.proauge.claseorm.model;

import com.orm.SugarRecord;

/**
 * Created by RigoBono on 08/04/17.
 */

public class usuario extends SugarRecord {

    private String nombre;
    private  String apellido;

    public usuario() {
    }

    public usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
