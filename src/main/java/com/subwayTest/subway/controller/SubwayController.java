package com.subwayTest.subway.controller;

import com.subwayTest.subway.db1.entities.SubwayEntity;
import com.subwayTest.subway.service.SubwayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubwayController {
    @Autowired
    private SubwayService subwayService;

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public String info(){
        return "The app is up ...";
    }
    @RequestMapping(value = "createsubway", method = RequestMethod.POST)
    public String createSubway(@RequestBody SubwayEntity subway){
        return subwayService.createSubway(subway);
    }

    @RequestMapping(value = "readallsubways", method = RequestMethod.GET)
    public List<SubwayEntity> readAllSubways(){
       return subwayService.readAllSubways();
    }

    @RequestMapping(value = "updatesubway", method = RequestMethod.PUT)
    public String updateSubway(@RequestBody SubwayEntity subway){
        return subwayService.updateSubway(subway);
    }

    @RequestMapping(value = "deletesubway", method = RequestMethod.DELETE)
    public String deleteSubway(@RequestBody SubwayEntity subway){
        return subwayService.deleteSubway(subway);
    }

}