package com.opencloud.openposapi.repositories;

import com.opencloud.openposapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Created by ivanchan on 20/1/2017.
 */

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
