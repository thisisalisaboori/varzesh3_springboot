package thisisalisaboori.varzesh3.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thisisalisaboori.varzesh3.demo.Domain.LeagueHistory;
import thisisalisaboori.varzesh3.demo.Dto.LeagueHistoryDto;

import thisisalisaboori.varzesh3.demo.Repository.LeagueHistoryRepository;

@Service
public class LeagueHistoryAppService {
    @Autowired
    private LeagueHistoryRepository repository;


    public List<LeagueHistoryDto> GetHistory(int counteyId){
       List<LeagueHistory> dbresult=  repository.GetAllByCountry(counteyId);
       List<LeagueHistoryDto> result=new ArrayList<LeagueHistoryDto>();
       dbresult.forEach(x-> result.add(new LeagueHistoryDto(
         x.getId(),
         x.getPeriod(),
         x.getCountryId()
       )) );

       return result;
    }
}
