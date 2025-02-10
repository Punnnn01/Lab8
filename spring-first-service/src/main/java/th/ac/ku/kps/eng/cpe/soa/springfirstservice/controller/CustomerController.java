package th.ac.ku.kps.eng.cpe.soa.springfirstservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import th.ac.ku.kps.eng.cpe.soa.springfirstservice.model.CommonResponse;
import th.ac.ku.kps.eng.cpe.soa.springfirstservice.model.Customer;
import th.ac.ku.kps.eng.cpe.soa.springfirstservice.service.CustomerService;

@RestController
@RequestMapping(path = "/customers")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Customer>> getAll() {
		return new ResponseEntity<>(customerService.getAllCustomer(), HttpStatus.OK);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Customer> getById(@PathVariable int id) {
		Optional<Customer> cus = customerService.getById(id);
		if (cus.isEmpty()) {
			return new ResponseEntity<Customer>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Customer>(cus.get(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<CommonResponse<Customer>> create(@RequestBody Customer cus) {
		customerService.addCustomer(cus);
		
		CommonResponse<Customer> res = new CommonResponse<Customer>();
		res.setStatus("201");
		res.setMsg("created customer");
		res.setResult(cus);
		
		return new ResponseEntity<>(res, HttpStatus.CREATED);
	}
}
