package io.rr.springJpa;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "USERRECORDS")
public class UserRecord {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String name;
    private String location;
}
