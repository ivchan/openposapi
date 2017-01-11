package com.opencloud.openposapi.repositories;

import com.opencloud.openposapi.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Created by ivanchan on 10/1/2017.
 */
@Repository
public interface MemberRepository extends JpaRepository<Member, UUID> {
}
