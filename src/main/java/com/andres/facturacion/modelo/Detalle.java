package com.andres.facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.*;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Embeddable
@Getter @Setter
public class Detalle {

    int cantidad;

    @ManyToOne(fetch = FetchType.LAZY,
            optional = true)
    Producto producto;

    @Money
    @Depends("precioPorUnidad, cantidad")
    public BigDecimal getImporte() {
        if (precioPorUnidad == null ) return BigDecimal.ZERO;
        return new BigDecimal(cantidad).multiply(precioPorUnidad);
    }

    @Money
    @DefaultValueCalculator(value = CalculadorPrecioPorUnidad.class,
            properties = @PropertyValue(name = "numeroProducto", from = "producto.numero"))
    BigDecimal precioPorUnidad;
}

