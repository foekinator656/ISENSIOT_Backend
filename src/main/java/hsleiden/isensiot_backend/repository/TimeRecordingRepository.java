package hsleiden.isensiot_backend.repository;

import hsleiden.isensiot_backend.models.TimeRecording;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeRecordingRepository extends JpaRepository<TimeRecording,Long> {
}
