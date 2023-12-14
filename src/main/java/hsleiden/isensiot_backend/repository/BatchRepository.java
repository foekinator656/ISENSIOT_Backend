package hsleiden.isensiot_backend.repository;

import hsleiden.isensiot_backend.models.Batch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatchRepository extends JpaRepository<Batch,Long> {
}
