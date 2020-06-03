package org.noor.xmple;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Cacheable
public class Users extends PanacheEntity {

    @Column(length = 40, unique = true)
    public String name;

    public Users() {
    }

    public Users(String name) {
        this.name = name;
    }
}
