package net.codejava.customer.config;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
 
public interface CustomerRepository extends CrudRepository<Customer, Long> {
     
}