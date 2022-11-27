package com.portfolio.backend.controller;

import com.portfolio.backend.model.Experience;
import com.portfolio.backend.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ExperienceController {
    @Autowired
    private ExperienceRepository experienceRepository;

    @GetMapping("/")
    public List<Experience> getExperiences(){
        return experienceRepository.findAll();
    }

    @GetMapping("/{id}")
    public Experience getExperience(@PathVariable Integer id){
        return experienceRepository.findById(id).orElse(null);
    }

    @PostMapping("/")
    public Experience postExperience(@RequestBody Experience experience){
        return experienceRepository.save(experience);
    }

    @PutMapping("/")
    public Experience putExperience(@RequestBody Experience experience){
        Experience previousExperienceVersion= experienceRepository.findById(experience.getId()).orElse(null);
        previousExperienceVersion.setCompanyName(experience.getCompanyName());
        previousExperienceVersion.setPositionName(experience.getPositionName());
        previousExperienceVersion.setStartDate(experience.getStartDate());
        previousExperienceVersion.setEndDate(experience.getEndDate());
        previousExperienceVersion.setTask_1(experience.getTask_1());
        previousExperienceVersion.setTask_2(experience.getTask_2());
        previousExperienceVersion.setTask_3(experience.getTask_3());
        previousExperienceVersion.setTask_4(experience.getTask_4());
        previousExperienceVersion.setTask_5(experience.getTask_5());
        previousExperienceVersion.setTask_6(experience.getTask_6());
        previousExperienceVersion.setTask_7(experience.getTask_7());
        previousExperienceVersion.setTask_8(experience.getTask_8());
        previousExperienceVersion.setTask_9(experience.getTask_9());
        previousExperienceVersion.setTask_10(experience.getTask_10());
        return experienceRepository.save(previousExperienceVersion);
    }

    @DeleteMapping("/{id}")
    public Integer deleteUser(@PathVariable Integer id){
        experienceRepository.deleteById(id);
        return id;
    }
}