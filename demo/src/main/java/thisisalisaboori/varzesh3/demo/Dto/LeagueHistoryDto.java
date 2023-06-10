package thisisalisaboori.varzesh3.demo.Dto;


public class LeagueHistoryDto {
    private int Id;
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }


    private String Period;

    public String getPeriod() {
        return Period;
    }
    public void setPeriod(String period) {
        Period = period;
    }


    private int CountryId;
    public LeagueHistoryDto(int id, String period, int countryId) {
        Id = id;
        Period = period;
        CountryId = countryId;
    }
    public int getCountryId() {
        return CountryId;
    }
    public void setCountryId(int countryId) {
        CountryId = countryId;
    }
}
