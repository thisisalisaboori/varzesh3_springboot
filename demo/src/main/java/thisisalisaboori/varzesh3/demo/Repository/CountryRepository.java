package thisisalisaboori.varzesh3.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import thisisalisaboori.varzesh3.demo.Domain.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country,Integer> {
    
}
