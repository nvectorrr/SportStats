package com.netcracker.sportstats.dataloaders;

import com.netcracker.sportstats.entities.Trainer;
import io.crnk.core.engine.transaction.TransactionRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import java.util.concurrent.Callable;

@Configuration
public class TrainersDataLoader {

    @Autowired
    private TransactionRunner transactionRunner;

    @Autowired
    private EntityManager entityManager;

    @PostConstruct
    public void setup() {
        transactionRunner.doInTransaction(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                Trainer t1 = new Trainer(121L, "Trainer one", 6457L);
                entityManager.persist(t1);

                Trainer t2 = new Trainer(123L, "Trainer three", 6459L);
                entityManager.persist(t2);

                Trainer t3 = new Trainer(122L, "Trainer two", 6458L);
                entityManager.persist(t3);

                entityManager.flush();
                return null;
            }
        });
    }
}

/*
 @Transactional
    @PostConstruct
    public void setup() {
        trainersRepository.save(new Trainer(121L, "Trainer one", 6457L));
        trainersRepository.save(new Trainer(123L, "Trainer three", 6459L));
        trainersRepository.save(new Trainer(122L, "Trainer two", 6458L));
    }

 */

