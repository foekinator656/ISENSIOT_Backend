package hsleiden.isensiot_backend.services;

import hsleiden.isensiot_backend.models.Frituur;
import hsleiden.isensiot_backend.repository.FrituurRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class FrituurService {
    private final FrituurRepository frituurRepository;

    public List<Frituur> getFrituursByLocationId(Long locationId){
        return frituurRepository.findAllByLocationId(locationId);
    }

    public void setFrituurIp(Long frituurId, String string) {
        Frituur frituur = frituurRepository.getReferenceById(frituurId);

        frituur.setIpAddress(string);

        frituurRepository.save(frituur);
    }
}