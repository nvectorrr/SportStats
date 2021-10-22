package com.netcracker.sportstats.reposimpl;

import com.netcracker.sportstats.entities.Trainer;
import io.crnk.data.jpa.JpaEntityRepositoryBase;
import org.springframework.stereotype.Component;

@Component
public class TrainersRepoImpl extends JpaEntityRepositoryBase<Trainer, Long> implements TrainersRepo {

   public TrainersRepoImpl() { super(Trainer.class); }

}

