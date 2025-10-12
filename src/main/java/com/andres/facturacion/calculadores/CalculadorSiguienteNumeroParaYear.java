package com.andres.facturacion.calculadores;

import lombok.Getter;
import lombok.Setter;
import org.openxava.calculators.ICalculator;
import org.openxava.jpa.XPersistence;

import javax.persistence.Query;

public class CalculadorSiguienteNumeroParaYear implements ICalculator{

    @Getter
    @Setter
    int year;

    @Override
    public Object calculate() throws Exception{
        Query query = XPersistence.getManager().createQuery("select max(f.numero) from Factura f where f.year = :year");

        query.setParameter("year",year);
        
        Integer ultimoNumero = (Integer) query.getSingleResult();
        return ultimoNumero == null ? 1 : ultimoNumero + 1;
    }
}
