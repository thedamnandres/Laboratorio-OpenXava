package com.andres.facturacion.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter @Setter
public class Direccion {

    @Column(length = 30)
    String viaPublica;

    @Column(length = 5)
    int codigoPostal;

    @Column(length = 20)
    String ciudad;

    @Column(length = 20)
    String provincia;
}
