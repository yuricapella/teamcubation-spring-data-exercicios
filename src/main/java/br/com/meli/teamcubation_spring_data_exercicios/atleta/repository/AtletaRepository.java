package br.com.meli.teamcubation_spring_data_exercicios.atleta.repository;

import br.com.meli.teamcubation_spring_data_exercicios.atleta.model.Atleta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtletaRepository extends JpaRepository<Atleta, Integer> {
}
