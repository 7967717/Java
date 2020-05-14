package io.rr.springJpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends PagingAndSortingRepository<UserRecord, Integer> {
    List<UserRecord> findByLocation(@Param("location") String location);

    List<UserRecord> findByName(@Param("name") String name);

    List<UserRecord> findAll();
}
