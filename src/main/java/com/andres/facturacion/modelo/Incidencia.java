package com.andres.facturacion.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Incidencia {

    @Getter @Setter
    int cantidad;

    @Getter @Setter
    int precio;

    public int getImporte() {
        return cantidad * precio;
    }
}


