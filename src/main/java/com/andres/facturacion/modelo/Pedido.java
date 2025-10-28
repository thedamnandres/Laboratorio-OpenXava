package com.andres.facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.ReferenceView;
import org.openxava.annotations.View;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter @Setter
@View(extendsView = "super.DEFAULT",
    members = "factura {factura}"
)
@View(name = "SinClienteNiFactura",
        members = "year, numero, date;" +
        "detalles;" +
        "observaciones"
)
public class Pedido extends DocumentoComercial{

    @ManyToOne
    @ReferenceView("SinClienteNiPedidos")
    Factura factura;
}
