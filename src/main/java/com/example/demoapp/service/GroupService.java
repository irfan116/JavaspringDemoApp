package com.example.demoapp.service;

import com.example.demoapp.domain.user.Group;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class GroupService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(Group group){
        entityManager.persist(group);
        return group.getId();
    }

    public Group find(Integer id){
        System.out.println("the id is is sis ===" + id);
        return entityManager.find(Group.class,id);
    }
    public List<Group> findAll(){
        Query query = entityManager.createNamedQuery("query_find_all_groups",Group.class);
        return query.getResultList();
    }
}
