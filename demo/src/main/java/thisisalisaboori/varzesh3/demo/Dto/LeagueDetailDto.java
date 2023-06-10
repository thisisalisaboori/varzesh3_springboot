package thisisalisaboori.varzesh3.demo.Dto;



public class LeagueDetailDto {
        private int Id;
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    
    private int Rank;

    public int getRank() {
        return Rank;
    }
    public void setRank(int rank) {
        Rank = rank;
    }
    private int Win;

    public int getWin() {
        return Win;
    }
    public void setWin(int win) {
        Win = win;
    }
    private int Loss;

    public int getLoss() {
        return Loss;
    }
    public void setLoss(int loss) {
        Loss = loss;
    }
    private int Eq;

    public int getEq() {
        return Eq;
    }
    public void setEq(int eq) {
        Eq = eq;
    }
    private int Av;

    public int getAv() {
        return Av;
    }
    public void setAv(int av) {
        Av = av;
    }
    private int Play;

    public int getPlay() {
        return Play;
    }
    public void setPlay(int play) {
        Play = play;
    }
    private int Point;

    public int getPoint() {
        return Point;
    }
    public void setPoint(int point) {
        Point = point;
    }
    private String Team;

    public String getTeam() {
        return Team;
    }
    public void setTeam(String team) {
        Team = team;
    }
    private int LeagueId;
    public LeagueDetailDto(int id, int rank, int win, int loss, int eq, int av, int play, int point, String team,
            int leagueId) {
        Id = id;
        Rank = rank;
        Win = win;
        Loss = loss;
        Eq = eq;
        Av = av;
        Play = play;
        Point = point;
        Team = team;
        LeagueId = leagueId;
    }
    public int getLeagueId() {
        return LeagueId;
    }
    public void setLeagueId(int leagueId) {
        this.LeagueId =leagueId;
    }
}
