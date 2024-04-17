package com.example.Invest.investidor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/investidores")
public class InvestidorController {

    @Autowired
    private InvestidorService investidorService;

    @PostMapping
    public Investidor criarInvestidor(@RequestBody Investidor investidor) {
        return investidorService.criarInvestidor(investidor);
    }

    @DeleteMapping("/{id}")
    public void excluirInvestidor(@PathVariable Integer id) {
        investidorService.excluirInvestidor(id);
    }

    @GetMapping
    public List<Investidor> listarInvestidores() {
        return investidorService.listarInvestidores();
    }

    @GetMapping("/filtro")
    public List<Investidor> filtrarInvestidoresPorPerfil(@RequestParam PerfilInvestimento perfil) {
        return investidorService.filtrarInvestidoresPorPerfil(perfil);
    }
}