package com.example.Invest.titulo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TituloRepository extends JpaRepository<Titulo, Long> {
    List<Titulo> findAllByTipoInvestimento(TipoInvestimento tipo);
}