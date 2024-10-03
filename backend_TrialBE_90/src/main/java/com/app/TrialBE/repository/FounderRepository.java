package com.app.TrialBE.repository;

import com.app.TrialBE.model.Founder;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class FounderRepository extends SimpleJpaRepository<Founder, String> {
    private final EntityManager em;
    public FounderRepository(EntityManager em) {
        super(Founder.class, em);
        this.em = em;
    }
    @Override
    public List<Founder> findAll() {
        return em.createNativeQuery("Select * from \"trialbe_610\".\"Founder\"", Founder.class).getResultList();
    }
}