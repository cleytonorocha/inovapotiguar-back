package com.cleytonorocha.app.inovapotiguar.reporsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleytonorocha.app.inovapotiguar.model.entity.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>{
    
}
