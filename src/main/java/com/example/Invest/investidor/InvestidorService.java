package com.example.Invest.investidor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestidorService {

    @Autowired
    private InvestidorRepository investidorRepository;

    public Investidor criarInvestidor(Investidor investidor) {
        return investidorRepository.save(investidor);
    }

    public void excluirInvestidor(Integer id) {
        investidorRepository.deleteById(id);
    }

    public List<Investidor> listarInvestidores() {
        return investidorRepository.findAll();
    }

    public List<Investidor> filtrarInvestidoresPorPerfil(PerfilInvestimento perfil) {
        return investidorRepository.findAllByPerfilInvestimento(perfil);
    }
}