package com.alpdogan.PsychologyClinic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "therapy_approach")
public class TherapyApproach {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id")
    private int id;

    @Column(name = "approach_name")
    private String approachName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Therapist therapist;

}
