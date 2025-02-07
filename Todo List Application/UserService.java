package com.listapp.todolistapp1;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository repo;


//save user data
   public ResponseEntity<User> save(User user) {
        return repo.save(user);
   }

//get all users
public ResponseEntity<List<User>> findAll(int id) {
   
  return repo.findAll();
}

//update user
public ResponseEntity<ResponseEntity<User>> updateUser(int userId, String description) {
   
    if(description==UserRepository.findByDescription(description)){
        
       repo.updateUser(userId,description)  
    }
        
     return description.isEmpty() ? ResponseEntity.ok(repo.updateUser(userId,description)) : ResponseEntity.badRequest().build();
       
}

//delete user
public ResponseEntity<ResponseEntity<User>> deleteUser(int userId) {
    

    return ResponseEntity.ok(repo.deleteUser(userId));
  }
}





