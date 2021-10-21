package com.netcracker.sportstats.dataloaders;

import com.netcracker.sportstats.entities.Trainer;
import com.netcracker.sportstats.reposimpl.TrainersRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class TrainersDataLoader {

    @Autowired
    private TrainersRepoImpl trainersRepo;

    @PostConstruct
    public void setup() {
        trainersRepo.save(new Trainer(121L, "Trainer one", 6457L));
        trainersRepo.save(new Trainer(123L, "Trainer three", 6459L));
        trainersRepo.save(new Trainer(122L, "Trainer two", 6458L));
    }

}
