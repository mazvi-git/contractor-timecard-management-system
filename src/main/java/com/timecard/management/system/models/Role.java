package com.timecard.management.system.models;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name="role")
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="role_id")
    private Long role_id;

    @Column(name="roleName")
    private String roleName;
}
