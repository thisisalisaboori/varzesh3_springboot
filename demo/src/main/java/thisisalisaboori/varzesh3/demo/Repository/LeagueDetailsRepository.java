package thisisalisaboori.varzesh3.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import thisisalisaboori.varzesh3.demo.Domain.LeagueDetail;


public interface LeagueDetailsRepository extends CrudRepository<LeagueDetail,Integer> {
    
    @Query(value = "select * from league_details  where league_id= :leagueId",nativeQuery = true)
    List<LeagueDetail> GetByLeagueID(@Param(value = "leagueId") Integer leagueId );
}
