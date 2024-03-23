package br.com.joaohenrique.servicex.categoria.repositores;

import br.com.joaohenrique.servicex.categoria.domain.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository  extends JpaRepository<Servico, Integer> {
}