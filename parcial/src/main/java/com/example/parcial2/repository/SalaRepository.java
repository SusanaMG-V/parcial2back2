package com.example.parcial2.repository;

import com.example.parcial2.Sala;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface SalaRepository extends JpaRepository<Sala, Long> {
    @Query("SELECT s FROM Sala s WHERE s.tipo = :tipo")
    List<Sala> findByTipo(@Param("tipo") String tipo);
}
