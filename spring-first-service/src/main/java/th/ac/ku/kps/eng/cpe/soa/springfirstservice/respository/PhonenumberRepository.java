package th.ac.ku.kps.eng.cpe.soa.springfirstservice.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import th.ac.ku.kps.eng.cpe.soa.springfirstservice.model.Phonenumber;

public interface PhonenumberRepository extends JpaRepository<Phonenumber, Integer>{

}
