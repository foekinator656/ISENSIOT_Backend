package hsleiden.isensiot_backend.seeders;

import hsleiden.isensiot_backend.models.User;
import hsleiden.isensiot_backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserSeeder implements CommandLineRunner {
    private final UserRepository userRepository;

    private void createUser(String email, String password) {
        Optional<User> existingUser = userRepository.findByEmail(email);

        if (existingUser.isPresent()) {
            return;
        }

        User user = User.builder()
                .email(email)
                .password(passwordEncoder.encode(password))
                .build();

        userRepository.save(user);
    }

    private void runThroughList() {
        for (int i = 0; i < emails.size(); i++) {
            String email = emails.get(i);
            String password = passwords.get(i);

            createUser(email, password);
        }
    }

    @Override
    public void run(String... args) {
        runThroughList();
    }
}
