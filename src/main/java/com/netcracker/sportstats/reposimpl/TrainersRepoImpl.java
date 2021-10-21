package com.netcracker.sportstats.reposimpl;

import com.netcracker.sportstats.entities.Trainer;
import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.resource.list.ResourceList;
import org.springframework.stereotype.Component;
import io.crnk.core.repository.ResourceRepositoryBase;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class TrainersRepoImpl extends ResourceRepositoryBase<Trainer, Long> {

    private static final AtomicLong ID_GENERATOR = new AtomicLong(124);

    private Map<Long, Trainer> trainers = new HashMap<>();

    public TrainersRepoImpl() { super(Trainer.class); }

    @Override
    public synchronized void delete(Long id) { trainers.remove(id); }

    @Override
    public synchronized <S extends Trainer> S save(S trainer) {
        if (trainer.getId() == null) {
            trainer.setId(ID_GENERATOR.getAndIncrement());
        }
        trainers.put(trainer.getId(), trainer);
        return trainer;
    }

    @Override
    public synchronized ResourceList<Trainer> findAll(QuerySpec querySpec) {
        return querySpec.apply(trainers.values());
    }
}
