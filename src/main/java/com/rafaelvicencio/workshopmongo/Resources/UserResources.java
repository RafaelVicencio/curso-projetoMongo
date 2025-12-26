package com.rafaelvicencio.workshopmongo.Resources;

import com.rafaelvicencio.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User rafael = new User("1", "Rafael", "rafael@hotmail.com");
        User sabrina = new User("1", "Sabrina", "sabrina@hotmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(rafael, sabrina));
        return ResponseEntity.ok().body(list);
    }
}
