package hsleiden.isensiot_backend.controller;


import hsleiden.isensiot_backend.models.User;
import hsleiden.isensiot_backend.models.dtos.UserDTO;
import hsleiden.isensiot_backend.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/api/v1/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll(
            @RequestHeader("Authorization") String bearerToken
    ) {

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> find(
            @RequestHeader("Authorization") String bearerToken,
            @PathVariable Long id
    ) {


        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }

    @GetMapping("/current")
    public ResponseEntity<User> getCurrentUser(
            @RequestHeader("Authorization") String bearerToken
    ) {
        return ResponseEntity.ok(userService.getUser(bearerToken));
    }

    @PostMapping
    public ResponseEntity<User> create(
            @RequestHeader("Authorization") String token,
            @RequestBody UserDTO userDTO
    ) throws Exception {

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }

}
