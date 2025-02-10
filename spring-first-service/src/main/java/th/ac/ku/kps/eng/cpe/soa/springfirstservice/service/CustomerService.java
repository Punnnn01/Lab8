package th.ac.ku.kps.eng.cpe.soa.springfirstservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import th.ac.ku.kps.eng.cpe.soa.springfirstservice.model.Customer;
import th.ac.ku.kps.eng.cpe.soa.springfirstservice.respository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}
	
	public Optional<Customer> getById(int id) {
		return customerRepository.findById(id);
	}
	
	public void addCustomer(Customer cus) {
		customerRepository.save(cus);
	}
	
	public void deleteCustomer(int id) {
		customerRepository.deleteById(id);
	}
} 
