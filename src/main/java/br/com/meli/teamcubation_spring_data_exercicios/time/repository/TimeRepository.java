package br.com.meli.teamcubation_spring_data_exercicios.time.repository;

import br.com.meli.teamcubation_spring_data_exercicios.time.model.Time;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRepository extends JpaRepository<Time, Integer> {

}
