package com.example.parcial2.repository;

import com.example.parcial2.Cine;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

public interface CineRepository extends JpaRepository<Cine, Long> {
    @Query("SELECT c FROM Cine c WHERE c.nit = :nit")
    Cine findByNit(@Param("nit") String nit);
}
