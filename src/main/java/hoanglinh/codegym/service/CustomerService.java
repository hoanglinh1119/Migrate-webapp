package hoanglinh.codegym.service;

import hoanglinh.codegym.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    Optional<Customer> findById(Long id);
    void save(Customer customer);
    void delete (Long id);
    Iterable<Customer> findAllByNameContainsOrEmailContainsOrAddressContains(String name, String email, String address);
    Page<Customer>  findAllByNameContainsOrEmailContainsOrAddressContains (String name, String email, String address, Pageable pageable);
}
