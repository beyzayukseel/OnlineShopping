package com.example.trcombeyzashopping.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class WorkCenterOper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer speed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workCenter_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private WorkCenter workCenter;


}
