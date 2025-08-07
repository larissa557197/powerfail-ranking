package br.com.fiap.powerfail_ranking.power;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PowerService {

    private final PowerRepository powerRepository;

    // construtor
    public PowerService(PowerRepository powerRepository) {
        this.powerRepository = powerRepository;
    }

    // metodo que retorna a orgem de inutilidade
    public List<Power> getAllPowers(){
        return powerRepository.findAllByOrderByNivelInutilidadeDesc();
    }
    
}
