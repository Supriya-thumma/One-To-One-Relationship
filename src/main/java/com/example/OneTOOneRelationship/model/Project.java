package com.example.OneTOOneRelationship.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String projectname;
    public String projectmanager;
    public String projectdescription;
    public String projectstatus;
    public String projecttype;
    public String projectstartdate;
    public String projectenddate;
}
