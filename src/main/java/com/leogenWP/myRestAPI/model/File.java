package com.leogenWP.myRestAPI.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;



@Entity
@Data
@Table(name = "files",schema = "web5")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    @Column(name = "bucket_name")
    private String bucketName;
    @Column(name = "file_key")
    private String fileKey;
    @OneToOne(mappedBy = "file")
    private Event event;
}

