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
        previousExperienceVersion.setTasks(experience.getTasks());
        return experienceRepository.save(previousExperienceVersion);
    }

    @DeleteMapping("/{id}")
    public Integer deleteUser(@PathVariable Integer id){
        experienceRepository.deleteById(id);
        return id;
    }
}