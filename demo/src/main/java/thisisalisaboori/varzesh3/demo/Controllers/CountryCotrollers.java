package thisisalisaboori.varzesh3.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import thisisalisaboori.varzesh3.demo.Dto.CountryDto;
import thisisalisaboori.varzesh3.demo.Service.CountryAppService;

@RestController
@RequestMapping(path = "/country")
public class CountryCotrollers {
    
    @Autowired
    private CountryAppService service;

    @GetMapping()
    public List<CountryDto> GetAll(){
        return service.GetAll();
    }
}
