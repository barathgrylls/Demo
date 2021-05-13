package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.Users;
@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

}
