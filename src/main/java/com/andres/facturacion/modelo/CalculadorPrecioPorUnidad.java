package com.andres.facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.calculators.ICalculator;

import static org.openxava.jpa.XPersistence.getManager;


public class CalculadorPrecioPorUnidad implements ICalculator {

    @Getter @Setter
    int numeroProducto;

    @Override
    public Object calculate() throws Exception {
        Producto producto = getManager()
                .find(Producto.class, numeroProducto);
        return producto.getPrecio();
    }
}
