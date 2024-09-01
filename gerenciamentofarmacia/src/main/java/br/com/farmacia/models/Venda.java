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
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Funcionario vendedor;

    //Cascade: todas as operações de persistência aplicadas na entidade Venda serão
    //automaticamente aplicadas aos ItemVenda associados
    @OneToMany(cascade = CascadeType.ALL)
    private List<ItemVenda> itens;

    private BigDecimal valorTotal;

    
}

