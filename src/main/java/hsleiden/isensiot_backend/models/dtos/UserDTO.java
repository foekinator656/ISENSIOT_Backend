package hsleiden.isensiot_backend.models.dtos;

import lombok.Data;

@Data
public class UserDTO {
    private String email;
    private String password;
}