package com.timecard.management.system.models;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="timecard")
@Getter
@Setter
public class Timecard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="submissionDate")
    private Date submissionDate;

    @Column(name="status")
    private String status;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "site_id", referencedColumnName = "site_id")
    private Site site;

    @ManyToOne
    @JoinColumn(name = "machine_id")
    private Machine machine;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User contractor;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User approvedBy;

    public Timecard() {

    }
    public Timecard(Long id, Date submissionDate, String status, Site siteCode, Machine machine, User contractor, User approvedBy) {
        this.id = id;
        this.submissionDate = submissionDate;
        this.status = status;
        this.site = site;
        this.machine = machine;
        this.contractor = contractor;
        this.approvedBy = approvedBy;
    }

    @Override
    public String toString() {
        return "Timecard{" +
                "id=" + id +
                ", submissionDate=" + submissionDate +
                ", status='" + status + '\'' +
                ", siteCode='" + site + '\'' +
                ", machineName='" + machine+ '\'' +
                ", contractorName='" + contractor + '\'' +
                ", approvedBy='" + approvedBy + '\'' +
                '}';
    }
}
