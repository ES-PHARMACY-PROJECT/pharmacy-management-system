package br.com.farmacia.service;

import br.com.farmacia.models.Estoque;
import br.com.farmacia.models.Medicamento;
import br.com.farmacia.repository.MedicamentoRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


class MedicamentoServiceTest {

    @Autowired
    MedicamentoRepository medicamentoRepository;

    @Autowired
    MedicamentoService medicamentoService;


    @Test
    void save() {
    }

    @Test
    void buscarPorNome() {
    }

    @Test
    void buscarPorId() {
        Estoque estoque = new Estoque();
        Long id = 1L;
        Medicamento medicamento = new Medicamento();
        medicamento.setId(1L);
        medicamento.setNome("dipirona");
        medicamento.setDescricao("para dores de cabeca");
        medicamento.setPrecisaReceita(false);
        medicamento.setEstoque(estoque);
        medicamento.setDataEntrada(LocalDate.now());


        try{
            Optional<Medicamento> founded  = this.medicamentoRepository.findById(id);

            Assertions.assertTrue(founded.isEmpty());
            Assertions.assertEquals("Ibuprofeno", founded);
        }catch(Exception ex){
            System.out.println("nao ha medicamentos");
        }
    }

    @Test
    void listar() {
        if(medicamentoRepository == null){
            System.out.println(" Sem resultados");
        }
        else
            medicamentoRepository.findAll();

    }
}