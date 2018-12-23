package com.yang.matchRecorder.model;

import javax.persistence.*;

@Entity
@Table(name="matches")
public class Match {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="player_1")
    private Player player1;

    @ManyToOne
    @JoinColumn(name="player_2")
    private Player player2;

    @Column(name="score_1")
    private Integer score1;

    @Column(name="score_2")
    private Integer score2;

    @Column(name="sub_score_1_1")
    private Integer subScore11;

    @Column(name="sub_score_1_2")
    private Integer subScore12;

    @Column(name="sub_score_1_3")
    private Integer subScore13;

    @Column(name="sub_score_1_4")
    private Integer subScore14;

    @Column(name="sub_score_1_5")
    private Integer subScore15;

    @Column(name="sub_score_2_1")
    private Integer subScore21;

    @Column(name="sub_score_2_2")
    private Integer subScore22;

    @Column(name="sub_score_2_3")
    private Integer subScore23;

    @Column(name="sub_score_2_4")
    private Integer subScore24;

    @Column(name="sub_score_2_5")
    private Integer subScore25;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Integer getScore1() {
        return score1;
    }

    public void setScore1(Integer score1) {
        this.score1 = score1;
    }

    public Integer getScore2() {
        return score2;
    }

    public void setScore2(Integer score2) {
        this.score2 = score2;
    }

    public Integer getSubScore11() {
        return subScore11;
    }

    public void setSubScore11(Integer subScore11) {
        this.subScore11 = subScore11;
    }

    public Integer getSubScore12() {
        return subScore12;
    }

    public void setSubScore12(Integer subScore12) {
        this.subScore12 = subScore12;
    }

    public Integer getSubScore13() {
        return subScore13;
    }

    public void setSubScore13(Integer subScore13) {
        this.subScore13 = subScore13;
    }

    public Integer getSubScore14() {
        return subScore14;
    }

    public void setSubScore14(Integer subScore14) {
        this.subScore14 = subScore14;
    }

    public Integer getSubScore15() {
        return subScore15;
    }

    public void setSubScore15(Integer subScore15) {
        this.subScore15 = subScore15;
    }

    public Integer getSubScore21() {
        return subScore21;
    }

    public void setSubScore21(Integer subScore21) {
        this.subScore21 = subScore21;
    }

    public Integer getSubScore22() {
        return subScore22;
    }

    public void setSubScore22(Integer subScore22) {
        this.subScore22 = subScore22;
    }

    public Integer getSubScore23() {
        return subScore23;
    }

    public void setSubScore23(Integer subScore23) {
        this.subScore23 = subScore23;
    }

    public Integer getSubScore24() {
        return subScore24;
    }

    public void setSubScore24(Integer subScore24) {
        this.subScore24 = subScore24;
    }

    public Integer getSubScore25() {
        return subScore25;
    }

    public void setSubScore25(Integer subScore25) {
        this.subScore25 = subScore25;
    }
}
