package com.andres.facturacion.modelo;

import com.andres.facturacion.calculadores.CalculadorSiguienteNumeroParaYear;
import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.*;
import org.openxava.calculators.CurrentLocalDateCalculator;
import org.openxava.calculators.CurrentYearCalculator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;

@Entity
@Getter @Setter
@View(members=
        "year, numero, date;" +
        "datos {" +
            "cliente;" +
            "detalles;" +
            "observaciones" +
        "}"
)
abstract public class DocumentoComercial extends Identificable {

    @DefaultValueCalculator(CurrentYearCalculator.class)
    @Column(length = 4)
    int year;

    @Column(length = 5)
    @DefaultValueCalculator(value = CalculadorSiguienteNumeroParaYear.class,
            properties = @PropertyValue( name = "year"))
    int numero;

    @Required
            @DefaultValueCalculator(CurrentLocalDateCalculator.class)
    LocalDate date;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @ReferenceView("Simple")
    Cliente cliente;

    @ElementCollection
            @ListProperties("producto.numero, producto.descripcion, cantidad")
    Collection<Detalle> detalles;

    @Stereotype("MEMO")
    String observaciones;
}
