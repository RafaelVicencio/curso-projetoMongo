package com.rafaelvicencio.workshopmongo.services;

import com.rafaelvicencio.workshopmongo.domain.Post;
import com.rafaelvicencio.workshopmongo.domain.User;
import com.rafaelvicencio.workshopmongo.dto.UserDTO;
import com.rafaelvicencio.workshopmongo.respository.PostRepository;
import com.rafaelvicencio.workshopmongo.respository.UserRepository;
import com.rafaelvicencio.workshopmongo.services.exception.ObjetctNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        return repo.findById(id)
                .orElseThrow(() -> new ObjetctNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text){
        return repo.findByTitleContainingIgnoreCase(text);
    }
}
