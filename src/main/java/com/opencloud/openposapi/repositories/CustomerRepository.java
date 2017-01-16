package com.opencloud.openposapi.repositories;

import com.opencloud.openposapi.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Created by ivanchan on 16/1/2017.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, UUID>{
}
