package com.example.Invest.titulo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TituloService {

    @Autowired
    private TituloRepository tituloRepository;

    public Titulo criarTitulo(Titulo titulo) {
        return tituloRepository.save(titulo);
    }

    public void excluirTitulo(Long id) {
        tituloRepository.deleteById(id);
    }

    public List<Titulo> listarTitulos() {
        return tituloRepository.findAll();
    }

    public List<Titulo> filtrarTitulosPorTipo(TipoInvestimento tipo) {
        return tituloRepository.findAllByTipoInvestimento(tipo);
    }
}