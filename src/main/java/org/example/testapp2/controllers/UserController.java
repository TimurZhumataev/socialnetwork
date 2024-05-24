package org.example.testapp2.controllers;

import org.example.testapp2.models.MyUser;
import org.example.testapp2.repositories.MyUserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/users")
public class UserController {

    final private MyUserRepository myUserRepository;

    public UserController(MyUserRepository usersRepository) {
        this.myUserRepository = usersRepository;
    }

    @GetMapping(value = {"", "/"})
    public List<MyUser> getUsers() {
        return myUserRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MyUser> findById(@PathVariable Long id){
        Optional<MyUser> user = myUserRepository.findById(id);
        return user.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/create")
    public ResponseEntity<MyUser> createUser(@RequestBody MyUser user) {
        MyUser newUser = myUserRepository.save(user);
        return ResponseEntity.ok(newUser);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<MyUser> updateUser(@PathVariable long id, @RequestBody MyUser updatedUser ){
        return myUserRepository.findById(id).map(existingUser -> {
            if(updatedUser.getUsername() != null){
                existingUser.setUsername(updatedUser.getUsername());
            }
            if(updatedUser.getEmail() != null){
                existingUser.setEmail(updatedUser.getEmail());
            }
            if(updatedUser.getPassword() != null){
                existingUser.setPassword(updatedUser.getPassword());
            }
            MyUser savedUser = myUserRepository.save(existingUser);
            return ResponseEntity.ok(savedUser);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<MyUser> deleteUser(@PathVariable long id){
        if(!myUserRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        myUserRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/delete/all")
    public ResponseEntity<MyUser> deleteAllUsers(){
        List <MyUser> users = myUserRepository.findAll();
        myUserRepository.deleteAll(users);
        return ResponseEntity.noContent().build();
    }
}
