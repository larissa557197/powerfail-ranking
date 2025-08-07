package br.com.fiap.powerfail_ranking.power;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Power {

    // chave primaria
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // nome do super poder
    private String nome;

    // descrição
    private String descricao;

    // nivel da inutilidade do poder
    private int nivel_inutilidade;
    
}
