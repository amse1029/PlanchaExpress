package com.itson.dominio;

import com.itson.dominio.NotaRemision;
import com.itson.dominio.Servicio;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-30T18:55:09", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(NotaServicio.class)
public class NotaServicio_ { 

    public static volatile SingularAttribute<NotaServicio, Float> precio;
    public static volatile SingularAttribute<NotaServicio, Servicio> servicio;
    public static volatile SingularAttribute<NotaServicio, Integer> cant;
    public static volatile SingularAttribute<NotaServicio, String> detalles;
    public static volatile SingularAttribute<NotaServicio, Long> id;
    public static volatile SingularAttribute<NotaServicio, NotaRemision> nota;

}