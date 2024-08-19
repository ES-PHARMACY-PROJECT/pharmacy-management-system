package br.com.farmacia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.farmacia.models.Medicamento;
import br.com.farmacia.service.MedicamentoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/medicamentos")
public class MedicamentoController {

    @Autowired
    private MedicamentoService medicamentoService;

    @GetMapping("/search/{nome}")
    public ResponseEntity<List<Medicamento>> buscarPorNome(@PathVariable String nome) {
        List<Medicamento> medicamentos = medicamentoService.buscarPorNome(nome);
        if (medicamentos.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(medicamentos);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Medicamento>> buscarPorId(@PathVariable Long id) {
        Optional<Medicamento> medicamento = medicamentoService.buscarPorId(id);
        if (medicamento.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(medicamento);
        }
    }

    @GetMapping()
    public List<Medicamento> listar() {
        return medicamentoService.listar();
    }
}
