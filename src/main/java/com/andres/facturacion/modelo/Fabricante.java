package com.andres.facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.Hidden;
import org.openxava.annotations.ListProperties;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter @Setter
public class Fabricante extends Identificable {

    @Column(length = 50)
    String nombre;

    @OneToMany(mappedBy = "fabricante", cascade = CascadeType.REMOVE)
    @ListProperties("numero, descripcion, precio")
    Collection<Producto> productos;

}
