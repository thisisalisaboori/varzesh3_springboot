package thisisalisaboori.varzesh3.demo.Domain;

import java.util.List;

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
@Table(name = "LeagueHistories")
public class LeagueHistory {
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

    @Column( name="Period")
    private String Period;

    public String getPeriod() {
        return Period;
    }
    public void setPeriod(String period) {
        Period = period;
    }

    @JoinColumn( name="CountryId")
    //@ManyToOne(targetEntity = Country.class )
    private int CountryId;
    public int getCountryId() {
        return CountryId;
    }
    public void setCountryId(int countryId) {
        CountryId = countryId;
    }

    //private List<LeagueDetail> leagueDetails;

}
