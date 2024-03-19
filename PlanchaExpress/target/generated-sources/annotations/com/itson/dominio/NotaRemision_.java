package com.itson.dominio;

import com.itson.dominio.Cliente;
import com.itson.dominio.Servicio;
import com.itson.dominio.Usuario;
import enumeradores.Estado;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-18T17:00:28", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(NotaRemision.class)
public class NotaRemision_ { 

    public static volatile SingularAttribute<NotaRemision, Float> anticipo;
    public static volatile ListAttribute<NotaRemision, Servicio> servicios;
    public static volatile SingularAttribute<NotaRemision, Cliente> cliente;
    public static volatile SingularAttribute<NotaRemision, Float> total;
    public static volatile SingularAttribute<NotaRemision, Estado> estado;
    public static volatile SingularAttribute<NotaRemision, Date> fecha_entrega;
    public static volatile SingularAttribute<NotaRemision, Long> folio;
    public static volatile SingularAttribute<NotaRemision, Date> fecha_recepcion;
    public static volatile SingularAttribute<NotaRemision, Usuario> usuario;

}