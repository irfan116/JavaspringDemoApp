package com.example.demoapp.repository;

import com.example.demoapp.domain.user.Group;
import com.example.demoapp.domain.user.GroupListing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;


public interface GroupRepository extends JpaRepository <Group ,Integer>{
    Collection<GroupListing> findAllProjectedBy();
}
