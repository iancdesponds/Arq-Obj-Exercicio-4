package com.example.Invest.investimento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/investimentos")
public class InvestimentoController {

    @Autowired
    private InvestimentoService investimentoService;

    @PostMapping
    public Investimento criarInvestimento(@RequestBody Investimento investimento) {
        return investimentoService.criarInvestimento(investimento);
    }

    @GetMapping("/investidor/{cpf}")
    public List<Investimento> listarInvestimentosPorInvestidor(@PathVariable String cpf) {
        return investimentoService.listarInvestimentosPorInvestidor(cpf);
    }
}