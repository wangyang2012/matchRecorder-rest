package com.yang.matchRecorder.model;

import javax.persistence.*;

@Entity
@Table(name="player")
public class Player {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Transient
    private Integer score;

    @Transient
    private Integer nbWin;

    @Transient
    private Integer nbLose;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getNbWin() {
        return nbWin;
    }

    public void setNbWin(Integer nbWin) {
        this.nbWin = nbWin;
    }

    public Integer getNbLose() {
        return nbLose;
    }

    public void setNbLose(Integer nbLose) {
        this.nbLose = nbLose;
    }
}
