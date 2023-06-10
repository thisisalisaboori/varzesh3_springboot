package thisisalisaboori.varzesh3.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;
import thisisalisaboori.varzesh3.demo.Dto.LeagueDetailDto;
import thisisalisaboori.varzesh3.demo.Service.LeagueDetailsAppService;

@RestController
@RequestMapping("/detail")
public class LeagueDetailConreoller {
    @Autowired
    private LeagueDetailsAppService service;

    @GetMapping("/{league}")
    public List<LeagueDetailDto> GetResult(@PathVariable(value = "league") int league ){
        return service.GetLeagueResult(league);
    }

     
}
