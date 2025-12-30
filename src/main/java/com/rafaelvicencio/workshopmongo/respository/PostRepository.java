package com.rafaelvicencio.workshopmongo.respository;

import com.rafaelvicencio.workshopmongo.domain.Post;
import com.rafaelvicencio.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
