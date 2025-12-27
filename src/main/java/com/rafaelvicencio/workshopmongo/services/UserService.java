package com.rafaelvicencio.workshopmongo.services;

import com.rafaelvicencio.workshopmongo.domain.User;
import com.rafaelvicencio.workshopmongo.respository.UserRepository;
import com.rafaelvicencio.workshopmongo.services.exception.ObjetctNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;
    public List<User> findAll(){
        return repo.findAll();
    }

    public User findById(String id) {
        return repo.findById(id)
                .orElseThrow(() -> new ObjetctNotFoundException("Objeto não encontrado"));
    }

}
