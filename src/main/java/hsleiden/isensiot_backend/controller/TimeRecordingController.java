package hsleiden.isensiot_backend.controller;

import hsleiden.isensiot_backend.models.dtos.TimeRecordingDTO;
import hsleiden.isensiot_backend.services.TimeRecordingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/batch")
public class TimeRecordingController {
    final TimeRecordingService timeRecordingService;

    @PostMapping("/{batchId}/{time}")
    public void postTimeRecording(
            @PathVariable Long batchId,
            @PathVariable int time,
            @RequestBody TimeRecordingDTO timeRecordingDTO
    ) {
        timeRecordingService.save(timeRecordingDTO, batchId, time);
    }
}
