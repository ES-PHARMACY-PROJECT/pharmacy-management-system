package br.com.farmacia.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private BigDecimal preco;

    private String descricao;

    private boolean precisaReceita;

    @OneToOne(cascade = CascadeType.ALL)
    private Estoque estoque;

    private LocalDate validade;

    private LocalDate dataEntrada;

    @ManyToMany(mappedBy = "medicamentos")
    private List<Receita> receitas;

    
}

