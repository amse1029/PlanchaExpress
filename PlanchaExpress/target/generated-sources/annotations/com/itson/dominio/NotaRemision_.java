package com.itson.dominio;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-10T22:32:11", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(NotaRemision.class)
public class NotaRemision_ { 

    public static volatile SingularAttribute<NotaRemision, Float> total;
    public static volatile SingularAttribute<NotaRemision, Date> fecha_entrega;
    public static volatile SingularAttribute<NotaRemision, Long> folio;
    public static volatile SingularAttribute<NotaRemision, Date> fecha_recepcion;

}