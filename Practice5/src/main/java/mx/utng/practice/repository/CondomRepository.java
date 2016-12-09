package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.utng.practice.model.Condom;
import mx.utng.practice.model.Customer;

public interface CondomRepository extends JpaRepository<Condom, Long> {

	@Query("select condom from Condom condom")
	public List<Condom> finAll();
}
