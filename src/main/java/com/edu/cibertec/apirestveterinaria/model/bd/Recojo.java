package com.edu.cibertec.apirestveterinaria.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "recojo")
public class Recojo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idrecojo;

    @Column(name = "fecha")
    private String fecha;

    @ManyToOne
    @JoinColumn(name = "idservicio")
    private Servicio servicioonline;

}
