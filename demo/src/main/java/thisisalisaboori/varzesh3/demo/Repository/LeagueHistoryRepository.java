package thisisalisaboori.varzesh3.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import thisisalisaboori.varzesh3.demo.Domain.LeagueHistory;


public interface LeagueHistoryRepository  extends CrudRepository<LeagueHistory,Integer>{
 
    @Query(value=" select * from league_histories where country_id= :country_id " , nativeQuery=true)
    List<LeagueHistory> GetAllByCountry(@Param(value = "country_id") Integer country_id );
}
