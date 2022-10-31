package br.com.coachme.repositories;

import br.com.coachme.models.Disponibility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisponibilityRepository extends JpaRepository<Disponibility, Long> {
}
