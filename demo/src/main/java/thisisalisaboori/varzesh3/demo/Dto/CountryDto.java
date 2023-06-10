package thisisalisaboori.varzesh3.demo.Dto;


public class CountryDto {

    public CountryDto(int id,String title,int v3){
        this.Id=id;
        this.LeageTitle =title;
        this.Varzesh3Id=v3;
    }
    private int Id;
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }

    
    private String LeageTitle; 
    public String getLeageTitle() {
        return LeageTitle;
    }
    public void setLeageTitle(String leageTitle) {
        LeageTitle = leageTitle;
    }

    
    private int Varzesh3Id;
    public int getVarzesh3Id() {
        return Varzesh3Id;
    }
    public void setVarzesh3Id(int varzesh3Id) {
        Varzesh3Id = varzesh3Id;
    }


}
