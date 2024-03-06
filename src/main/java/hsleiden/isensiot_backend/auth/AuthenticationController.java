package hsleiden.isensiot_backend.auth;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import hsleiden.isensiot_backend.models.dtos.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SuppressFBWarnings({"RV_EXCEPTION_NOT_THROWN", "EI_EXPOSE_REP", "EI_EXPOSE_REP2"})
@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @CrossOrigin
    @PostMapping("/register")
    public void register(@RequestBody UserDTO userDTO) {
        authenticationService.register(userDTO);
    }

    @CrossOrigin
    @RequestMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(
            @RequestBody AuthenticationRequest authenticationRequest
    ) throws Exception {
        System.out.println(authenticationRequest);
        return ResponseEntity.ok(authenticationService.login(authenticationRequest));
    }
}
