package com.citapelu.centerservice.infraestructure;

import com.citapelu.centerservice.application.CenterService;
import com.citapelu.centerservice.domain.Center;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/centers")
@Slf4j
public class CenterAPI {

    @Autowired
    CenterService centerService;


    @PutMapping("/add")
    public Center addCenter(@RequestBody Center center){
        log.info("adding center");
        return centerService.addCenter(center);
    }

    @GetMapping("/getAll")
    public List<Center> getCenters(){
        log.info("get all centers");
        return centerService.getCenters();
    }

    @GetMapping("/get/{centerId}")
    public Center getCenterById(@PathVariable Long centerId){
        log.info("get center info");
        return centerService.getCenterById(centerId);
    }

}
