package com.andres.facturacion.modelo;

import com.andres.facturacion.calculadores.CalculadorSiguienteNumeroParaYear;
import lombok.Getter;
import lombok.Setter;
import org.apache.http.impl.io.ContentLengthInputStream;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;
import org.openxava.calculators.CurrentLocalDateCalculator;
import org.openxava.calculators.CurrentUserBirthDateYearCalculator;
import org.openxava.calculators.CurrentYearCalculator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;

@Entity
@Getter @Setter
public class Factura {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @Hidden
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(length = 32)
    String oid;

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
    Cliente cliente;

    @ElementCollection
            @ListProperties("producto.numero, producto.descripcion, cantidad")
    Collection<Detalle> detalles;

    @Stereotype("MEMO")
    String observaciones;
}
