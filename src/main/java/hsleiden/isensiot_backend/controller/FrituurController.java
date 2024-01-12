package hsleiden.isensiot_backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/frituur")
public class FrituurController {
    private final FrituurMapper frituurMapper;
    private final FrituurService frituurService;

    @GetMapping("/{locationId}")
    public List<FrituurDto> getFrituursByLocationId(@PathVariable Long locationId) {
        return frituurMapper.toDto(frituurService.getFrituursByLocationId(locationId));
    }
}
