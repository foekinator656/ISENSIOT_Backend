package hsleiden.isensiot_backend.repository;

import hsleiden.isensiot_backend.models.TimeRecording;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRecordingRepository extends JpaRepository<TimeRecording,Long> {
}
