package com.itson.dominio;

import com.itson.dominio.NotaRemision;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-03-20T10:55:37")
@StaticMetamodel(Servicio.class)
public class Servicio_ { 

    public static volatile SingularAttribute<Servicio, String> descripcion;
    public static volatile SingularAttribute<Servicio, Float> precio;
    public static volatile SingularAttribute<Servicio, Long> id;
    public static volatile ListAttribute<Servicio, NotaRemision> notasRemisiones;

}