package com.example.Invest.titulo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/titulos")
public class TituloController {

    @Autowired
    private TituloService tituloService;

    @PostMapping
    public Titulo criarTitulo(@RequestBody Titulo titulo) {
        return tituloService.criarTitulo(titulo);
    }

    @DeleteMapping("/{id}")
    public void excluirTitulo(@PathVariable Long id) {
        tituloService.excluirTitulo(id);
    }

    @GetMapping
    public List<Titulo> listarTitulos() {
        return tituloService.listarTitulos();
    }

    @GetMapping("/filtro")
    public List<Titulo> filtrarTitulosPorTipo(@RequestParam TipoInvestimento tipo) {
        return tituloService.filtrarTitulosPorTipo(tipo);
    }
}