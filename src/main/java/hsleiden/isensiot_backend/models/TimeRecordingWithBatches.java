package hsleiden.isensiot_backend.models;

import lombok.Data;

import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class TimeRecordingWithBatches implements Serializable {
    private Long batchId;
    private int time;
}
