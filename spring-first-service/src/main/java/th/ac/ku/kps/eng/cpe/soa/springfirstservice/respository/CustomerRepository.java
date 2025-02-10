package th.ac.ku.kps.eng.cpe.soa.springfirstservice.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import th.ac.ku.kps.eng.cpe.soa.springfirstservice.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	@Query("from Customer c where c.username = :name")
	Customer findByName(String name) ;

}
