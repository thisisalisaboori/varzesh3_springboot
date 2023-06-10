package thisisalisaboori.varzesh3.demo.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thisisalisaboori.varzesh3.demo.Domain.Country;
import thisisalisaboori.varzesh3.demo.Dto.CountryDto;
import thisisalisaboori.varzesh3.demo.Repository.CountryRepository;

@Service
public class CountryAppService {
    @Autowired
    private CountryRepository repository;

    public List<CountryDto> GetAll(){
        List<CountryDto> result = new ArrayList<CountryDto>() ;
        Iterable<Country> dbResult=  repository.findAll();
           // dbResult.forEachRemaining(null);
        
        long c= repository.count();
        dbResult.forEach(  x->  
        result.add(new CountryDto(
            x.getId(),
            x.getLeageTitle(),
            x.getVarzesh3Id()  
            ) 
         ));

        return result;

    }
}
