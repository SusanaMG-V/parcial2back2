package com.example.parcial2.service;

import com.example.parcial2.Cine;
import com.example.parcial2.repository.CineRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CineService {

    private final CineRepository cineRepository;

    public CineService(CineRepository cineRepository) {
        this.cineRepository = cineRepository;
    }

    @Transactional
    public Cine guardar(Cine cine) {
        if (cine.getNombre() == null || cine.getNombre().isBlank())
            throw new IllegalArgumentException("El nombre del cine es solicitado");
        if (cine.getNit() == null || cine.getNit().isBlank())
            throw new IllegalArgumentException("El NIT es solicitado");
        return cineRepository.save(cine);
    }
}
