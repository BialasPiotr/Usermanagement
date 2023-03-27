package com.ZadanieCRUD.ZadanieCRUD.UserRepo;

import com.ZadanieCRUD.ZadanieCRUD.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
}
