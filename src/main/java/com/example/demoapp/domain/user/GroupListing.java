package com.example.demoapp.domain.user;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.criteria.CriteriaBuilder;

public interface GroupListing {
    @Value("#{target.id}")
    Integer getId();

    @Value("#{target.groupName}")
    String getGroupName();
}
