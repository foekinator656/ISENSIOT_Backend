package hsleiden.isensiot_backend.repository;

import hsleiden.isensiot_backend.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
