package hsleiden.isensiot_backend.services;

import hsleiden.isensiot_backend.models.User;
import hsleiden.isensiot_backend.repository.UserRepository;
import hsleiden.isensiot_backend.services.config.JwtService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final JwtService jwtService;

    public User getUser(String bearerToken) {
        String jwt = bearerToken.substring(7);

        String email = jwtService.extractUsername(jwt);
        log.info("Username/Email is: {}", email);
        return userRepository.findByEmail(email).orElseThrow(EntityNotFoundException::new);
    }
}
