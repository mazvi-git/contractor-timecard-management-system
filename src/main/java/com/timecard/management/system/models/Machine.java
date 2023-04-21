package com.timecard.management.system.models;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name="machine")
@Getter
@Setter
public class Machine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="machine_id")
    private Long machine_id;

    @Column(name="machineName")
    private String machineName;

    @Column(name="description")
    private String description;

    @Column(name="hourlyRate")
    private double hourlyRate;

    @Column(name="maxHoursPerDay")
    private int maxHoursPerDay;
}
