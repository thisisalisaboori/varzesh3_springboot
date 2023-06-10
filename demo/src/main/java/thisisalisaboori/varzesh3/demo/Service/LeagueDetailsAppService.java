package thisisalisaboori.varzesh3.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thisisalisaboori.varzesh3.demo.Domain.LeagueDetail;
import thisisalisaboori.varzesh3.demo.Dto.LeagueDetailDto;
import thisisalisaboori.varzesh3.demo.Repository.LeagueDetailsRepository;

@Service
public class LeagueDetailsAppService {
    @Autowired
    private LeagueDetailsRepository repository;

    public List<LeagueDetailDto> GetLeagueResult(int id){
       List<LeagueDetail> dbResult=  repository.GetByLeagueID(id);
       List<LeagueDetailDto> result=new ArrayList<LeagueDetailDto>();

       //nt id, int rank, int win, int loss, int eq, int av, int play, int point, String team,
        //    int leagueId
       dbResult.forEach(x->  result.add( new LeagueDetailDto(
        x.getId(),x.getRank(),x.getWin(),x.getLoss(),x.getEq(),
        x.getAv(),x.getPlay(),x.getPoint(),x.getTeam(),x.getLeagueId()       )
        ));
        return result;
    }
}
