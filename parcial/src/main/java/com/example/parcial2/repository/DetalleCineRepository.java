package com.example.parcial2.repository;

import com.example.parcial2.DetalleCine;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface DetalleCineRepository extends JpaRepository<DetalleCine, Long> {
    @Query("SELECT d FROM DetalleCine d WHERE d.ciudad = :ciudad")
    List<DetalleCine> findByCiudad(@Param("ciudad") String ciudad);
}
