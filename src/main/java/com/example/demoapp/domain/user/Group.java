package com.example.demoapp.domain.user;


import javax.persistence.*;

import static javax.persistence.AccessType.PROPERTY;

@Entity
@NamedQuery(name = "query_find_all_groups", query = "select g from Group g")
@Table(name = "groups")
public class Group implements GroupListing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Access(PROPERTY)
    private Integer id;

    private String groupName;// Not perfect!! Should be a proper object!



    protected Group() {
    }

    public Group(String name) {
        super();
        this.groupName = name;
    }

    @Override
    public Integer getId(){
        return this.id;
    }

    public Group setId(Integer id){
        this.id = id;
        return  this;
    }


    @Override
    public String getGroupName() {
        return groupName;
    }

}
