package hoanglinh.codegym.service.Impl;

import hoanglinh.codegym.model.Customer;
import hoanglinh.codegym.repositories.CustomerRepository;
import hoanglinh.codegym.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Iterable<Customer> findAllByNameContainsOrEmailContainsOrAddressContains(String name, String email, String address) {
        return customerRepository.findAllByNameContainsOrEmailContainsOrAddressContains(name,email,address);
    }

    @Override
    public Page<Customer> findAllByNameContainsOrEmailContainsOrAddressContains(String name, String email, String address, Pageable pageable) {
        return customerRepository.findAllByNameContainsOrEmailContainsOrAddressContains(name, email, address, pageable);
    }

}
