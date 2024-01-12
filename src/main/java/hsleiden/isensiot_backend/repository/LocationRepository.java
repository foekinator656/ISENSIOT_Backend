package hsleiden.isensiot_backend.repository;

import hsleiden.isensiot_backend.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Long> {
    Optional<Location> findByName(String anme);
}
