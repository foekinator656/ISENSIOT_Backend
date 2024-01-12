package hsleiden.isensiot_backend.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
@Table(name = "locations")
public class Location {
    @Id
    private Long id;
    private String name;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "locations_users",
            joinColumns = { @JoinColumn(name = "user_id") },
            inverseJoinColumns = { @JoinColumn(name = "location_id") }
    )
    private List<User> users = new ArrayList<>();
    @OneToMany(fetch = FetchType.EAGER)
    private List<Frituur> frituurs;
}
