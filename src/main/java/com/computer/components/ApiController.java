package com.computer.components;

import com.computer.components.entities.IntelEntity;
import com.computer.components.entities.SimpleIntelEntity;
import com.computer.components.repository.IntelRepository;
import com.computer.components.repository.SimpleIntelRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final IntelRepository intelRepository;
    private final SimpleIntelRepository simpleIntelRepository;

    public ApiController(IntelRepository intelRepository,SimpleIntelRepository simpleIntelRepository) {
        this.intelRepository = intelRepository;
        this.simpleIntelRepository = simpleIntelRepository;
    }

    /*@GetMapping("/visits")
    public Iterable<IntelEntity> getVisits() {
        return visitsRepository.findOne((long)1);
    }*/
    @GetMapping("/getbyid")
    public IntelEntity GetById(@RequestParam(value="id", defaultValue="1") long id) {
        return intelRepository.findOne(id);
    }
    @GetMapping("/gettwenty")
    public Iterable<SimpleIntelEntity>GetTwenty(@RequestParam(value = "number",defaultValue = "0")Long number){
        return simpleIntelRepository.findTop20ByIdGreaterThan(number*20);
    }
}