package com.springboot.locations_deployment.Users;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserClass, Long> {
 
    @Query("SELECT u FROM UserClass u WHERE u.username = :username")
    public UserClass getUserByUsername(@Param("username") String username);
}