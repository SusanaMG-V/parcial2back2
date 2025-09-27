package com.example.parcial2;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Cine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String nit;

    @OneToOne(mappedBy = "cine", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private DetalleCine detalle;

    @OneToMany(mappedBy = "cine", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Sala> salas = new ArrayList<>();

    public Cine() {}

    public Cine(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNit() { return nit; }
    public void setNit(String nit) { this.nit = nit; }

    public DetalleCine getDetalle() { return detalle; }
    public void setDetalle(DetalleCine detalle) {
        this.detalle = detalle;
        if (detalle != null) detalle.setCine(this);
    }

    public List<Sala> getSalas() { return salas; }
    public void setSalas(List<Sala> salas) { this.salas = salas; }
}
