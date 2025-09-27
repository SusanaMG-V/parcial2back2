package com.example.parcial2.service;

import com.example.parcial2.DetalleCine;
import com.example.parcial2.repository.DetalleCineRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DetalleCineService {

    private final DetalleCineRepository repository;

    public DetalleCineService(DetalleCineRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public DetalleCine guardar(DetalleCine detalle) {
        if (detalle.getCiudad() == null || detalle.getCiudad().isBlank())
            throw new IllegalArgumentException("La ciudad es requerida");
        return repository.save(detalle);
    }
}
