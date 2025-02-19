package br.com.joaohenrique.servicex.categoria.repositores;



import br.com.joaohenrique.servicex.categoria.domain.Categoria;
import br.com.joaohenrique.servicex.categoria.resources.CategoriaResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}