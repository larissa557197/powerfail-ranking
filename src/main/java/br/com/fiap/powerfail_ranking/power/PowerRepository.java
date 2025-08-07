package br.com.fiap.powerfail_ranking.power;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PowerRepository extends JpaRepository<Power, Long>{

    List<Power> findAllByOrderByNivelInutilidadeDesc();

}
