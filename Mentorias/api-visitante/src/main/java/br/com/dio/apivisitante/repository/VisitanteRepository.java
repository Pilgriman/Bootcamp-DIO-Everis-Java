package br.com.dio.apivisitante.repository;


import br.com.dio.apivisitante.entity.Visitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitanteRepository extends JpaRepository<Visitante, String>{
}
