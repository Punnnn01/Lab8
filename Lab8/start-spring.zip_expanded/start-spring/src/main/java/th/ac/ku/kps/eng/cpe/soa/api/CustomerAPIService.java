package th.ac.ku.kps.eng.cpe.soa.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import th.ac.ku.kps.eng.cpe.soa.model.Customer;
import th.ac.ku.kps.eng.cpe.soa.service.CustomerService;

@RestController
public class CustomerAPIService {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/")
	public List<Customer> findAll() {
		return customerService.findAll();
	}
}