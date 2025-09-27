package com.example.parcial2.service;

import com.example.parcial2.Sala;
import com.example.parcial2.repository.SalaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SalaService {

    private final SalaRepository repository;

    public SalaService(SalaRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Sala guardar(Sala sala) {
        if (sala.getNombre() == null || sala.getNombre().isBlank())
            throw new IllegalArgumentException("El nombre es requerido");
        if (sala.getCapacidad() <= 0)
            throw new IllegalArgumentException("La capacidad debe ser mayor a 0");
        return repository.save(sala);
    }
}
