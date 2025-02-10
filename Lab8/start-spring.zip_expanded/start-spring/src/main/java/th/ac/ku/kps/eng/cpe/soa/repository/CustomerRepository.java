package th.ac.ku.kps.eng.cpe.soa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import th.ac.ku.kps.eng.cpe.soa.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
}
