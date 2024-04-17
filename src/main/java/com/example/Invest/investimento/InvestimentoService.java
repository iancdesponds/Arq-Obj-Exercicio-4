package com.example.Invest.investimento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestimentoService {

    @Autowired
    private InvestimentoRepository investimentoRepository;

    public Investimento criarInvestimento(Investimento investimento) {
        return investimentoRepository.save(investimento);
    }

    public List<Investimento> listarInvestimentosPorInvestidor(String cpf) {
        return investimentoRepository.findByInvestidorCpf(cpf);
    }
}