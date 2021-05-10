package verynice.thefinalproject.user;

import verynice.thefinalproject.user.Users1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users1,Integer> {
    Users1  findByUsername(String username);
}