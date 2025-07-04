package br.com.meli.teamcubation_spring_data_exercicios.atleta.repository;

import br.com.meli.teamcubation_spring_data_exercicios.atleta.model.Atleta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AtletaRepository extends JpaRepository<Atleta, Integer> {

    @Query("SELECT a FROM Atleta a WHERE a.posicao = :posicao")
    Page<Atleta> buscarPorPosicao(@Param("posicao") String posicao, Pageable pageable);
}
