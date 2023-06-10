package thisisalisaboori.varzesh3.demo.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="LeagueDetails")
public class LeagueDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name="Id")
    private int Id;
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    @Column( name="Rank")
    private int Rank;

    public int getRank() {
        return Rank;
    }
    public void setRank(int rank) {
        Rank = rank;
    }
    @Column( name="Win")
    private int Win;

    public int getWin() {
        return Win;
    }
    public void setWin(int win) {
        Win = win;
    }
    @Column( name="Loss")
    private int Loss;

    public int getLoss() {
        return Loss;
    }
    public void setLoss(int loss) {
        Loss = loss;
    }
    @Column( name="Eq")
    private int Eq;

    public int getEq() {
        return Eq;
    }
    public void setEq(int eq) {
        Eq = eq;
    }
    @Column( name="Av")
    private int Av;

    public int getAv() {
        return Av;
    }
    public void setAv(int av) {
        Av = av;
    }
    @Column( name="Play")
    private int Play;

    public int getPlay() {
        return Play;
    }
    public void setPlay(int play) {
        Play = play;
    }
    @Column( name="Point")
    private int Point;

    public int getPoint() {
        return Point;
    }
    public void setPoint(int point) {
        Point = point;
    }
    @Column( name="Team")
    private String Team;

    public String getTeam() {
        return Team;
    }
    public void setTeam(String team) {
        Team = team;
    }
    @JoinColumn( name="LeagueId")
    //@ManyToOne(targetEntity = LeagueHistory.class)
    private int LeagueId;
    public int getLeagueId() {
        return LeagueId;
    }
    public void setLeagueId(int leagueId) {
        LeagueId = leagueId;
    }

}
