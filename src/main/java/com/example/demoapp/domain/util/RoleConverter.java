package com.example.demoapp.domain.util;

import com.example.demoapp.domain.user.Role;

import javax.persistence.AttributeConverter;

public class RoleConverter implements AttributeConverter<Role,Integer> {
    @Override
    public Integer convertToDatabaseColumn(Role role) {
        if(role != null) {
            return role.getId();
        }
        return null;
    }

    @Override
    public Role convertToEntityAttribute(Integer id) {
        if(id != null) {
            try {
                return Role.getRoleFromId(id);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
