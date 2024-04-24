package org.generation.app.repository;

import java.util.List;

import org.generation.app.model.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer, Long> {

	  List<Customer> findByLastName(String lastName);

	  Customer findById(long id);

}
