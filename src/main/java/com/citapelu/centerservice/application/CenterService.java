package com.citapelu.centerservice.application;

import com.citapelu.centerservice.domain.Center;
import com.citapelu.centerservice.domain.CenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CenterService {

    @Autowired
    CenterRepository centerRepository;


    public Center addCenter(Center center) {
        return centerRepository.save(center);
    }

    public List<Center> getCenters() {
        return centerRepository.findAll();
    }

    public Center getCenterById(Long centerId) {
        return centerRepository.findById(centerId).get();
    }
}
