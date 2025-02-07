package com.listapp.todolistapp1;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{

    ResponseEntity<User> save(User user);

    
     ResponseEntity<List<User>> findAll();

     ResponseEntity<User> updateUser(int userId, String description);

    static String findByDescription(String description) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findByDescription'");
    }


    ResponseEntity<User> deleteUser(int userId);

}
