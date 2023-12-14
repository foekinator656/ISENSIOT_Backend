package hsleiden.isensiot_backend.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "frituren")
public class Frituur {
    @Id
    private Long id;
    private int oilVolume;
    private int panCount;
    private int panVolume;
    private Long locationId;
}
