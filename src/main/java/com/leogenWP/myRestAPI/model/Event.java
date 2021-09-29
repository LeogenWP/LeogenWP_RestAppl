package com.leogenWP.myRestAPI.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.persistence.JoinColumn;
import java.util.Date;

@Entity
@Data
@Table(name = "events",schema = "web5")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @CreatedDate
    private Date uploaded;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "file_id", referencedColumnName = "id")
    private File file;

    public void setFile(File file) {
        this.file = file;
        file.setEvent(this);
    }

    public void removeFile(File file) {
        this.file = null;
        file.setEvent(null);
    }
}
