package br.com.farmacia.repository;

import br.com.farmacia.models.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {

	List<Medicamento> findByNomeContainingIgnoreCase(String nome);
}
