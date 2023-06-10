package thisisalisaboori.varzesh3.demo.Controllers;

import java.util.List;

import org.checkerframework.common.reflection.qual.GetMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;
import thisisalisaboori.varzesh3.demo.Dto.LeagueHistoryDto;

import thisisalisaboori.varzesh3.demo.Service.LeagueHistoryAppService;

@RestController
@RequestMapping("/history")
public class LeagueHistortControllers {
    @Autowired
    private LeagueHistoryAppService service;
    
    @GetMapping("{country}")
    public List<LeagueHistoryDto> GetLeagueHistory(@PathVariable(value = "country") int country){
        return service.GetHistory(country);
    }

}
