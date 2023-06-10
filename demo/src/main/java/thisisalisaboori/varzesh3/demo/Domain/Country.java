package thisisalisaboori.varzesh3.demo.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name="Id")
    private Integer Id;
    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
    }

    @Column(name =  "LeageTitle")
    private String LeageTitle; 
    public String getLeageTitle() {
        return LeageTitle;
    }
    public void setLeageTitle(String leageTitle) {
        LeageTitle = leageTitle;
    }

    @Column(name="Varzesh3Id")
    private Integer Varzesh3Id;
    public Integer getVarzesh3Id() {
        return Varzesh3Id;
    }
    public void setVarzesh3Id(Integer varzesh3Id) {
        Varzesh3Id = varzesh3Id;
    }



}
