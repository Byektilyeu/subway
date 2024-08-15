package com.subwayTest.subway.service;

import com.subwayTest.subway.db1.entities.SubwayEntity;
import com.subwayTest.subway.db1.repositories.SubwayRepository;
import com.subwayTest.subway.db2.repositories.RkeeperRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubwayService {

    @Autowired
    private SubwayRepository subwayRepository;
    @Autowired
    private RkeeperRepository rkeeperRepository;

    @Transactional
    public String createSubway(SubwayEntity subway) {
        try {
            if (!subwayRepository.existsById(subway.getId())){
                subway.setId(null == subwayRepository.findMaxId()? 0 : subwayRepository.findMaxId() + 1);
                subwayRepository.save(subway);
                return "Subway created";
            }else {
                return "Subway already exists";
            }
        }
        catch (Exception e){
            throw e;
        }
    }
    public List<SubwayEntity> readAllSubways() {
        return subwayRepository.findAll();
    }

    @Transactional
    public String updateSubway(SubwayEntity subway) {
        if (subwayRepository.existsById(subway.getId())){
            try {
                Optional<SubwayEntity> subways = subwayRepository.findById(subway.getId());
                subways.stream().forEach( s -> {
                    SubwayEntity subwayToBeUpdated = subwayRepository.findById(s);
                    subwayToBeUpdated.setCustomerType(subway.getCustomerType());
                    subwayToBeUpdated.setDay1Sales(subway.getDay1Sales());
                    subwayToBeUpdated.setDay2Sales(subway.getDay2Sales());
                    subwayToBeUpdated.setDay3Sales(subway.getDay3Sales());
                    subwayToBeUpdated.setDay4Sales(subway.getDay4Sales());
                    subwayToBeUpdated.setDay5Sales(subway.getDay5Sales());
                    subwayToBeUpdated.setDay6Sales(subway.getDay6Sales());
                    subwayToBeUpdated.setDay7Sales(subway.getDay7Sales());
                    subwayToBeUpdated.setDrinkSales(subway.getDrinkSales());
                    subwayToBeUpdated.setHoursOpened(subway.getHoursOpened());
                    subwayToBeUpdated.setHoursWorked(subway.getHoursWorked());
                    subwayToBeUpdated.setNumberOfDrinks(subway.getNumberOfDrinks());
                    subwayToBeUpdated.setMiscSales(subway.getMiscSales());
                    subwayToBeUpdated.setNumberOfFootlongs(subway.getNumberOfFootlongs());
                    subwayToBeUpdated.setNumberOfFourInch(subway.getNumberOfFourInch());
                    subwayToBeUpdated.setNumberOfSaladPlates(subway.getNumberOfSaladPlates());
                    subwayToBeUpdated.setNumberOfSixInch(subway.getNumberOfSixInch());
                    subwayToBeUpdated.setNumberOfTransactions(subway.getNumberOfTransactions());
                    subwayToBeUpdated.setPartySales(subway.getPartySales());
                    subwayToBeUpdated.setStoreNum(subway.getStoreNum());
                    subwayToBeUpdated.setVendorCountry(subway.getVendorCountry());
                    subwayToBeUpdated.setVendorId(subway.getVendorId());
                    subwayToBeUpdated.setVendorName(subway.getVendorName());
                    subwayToBeUpdated.setWeekEndingDate(subway.getWeekEndingDate());
                    subwayRepository.save(subwayToBeUpdated);
                });
                return "Subway updated";
            } catch (Exception e){
                throw e;
            }
        }else {
            return "Subway does not exist";
        }
    }

    @Transactional
    public String deleteSubway(SubwayEntity subway) {
        if (subwayRepository.existsById(subway.getId())){
            try {
                Optional<SubwayEntity> subways = subwayRepository.findById(subway.getId());
                subways.stream().forEach( s -> {
                    System.out.println("delete subway function => " + s.toString());
                    subwayRepository.delete(s);
                });
                return "Subway deleted";
            }catch (Exception e){
                throw e;
            }
        }
        else {
            return "Subway does not exist";
        }
    }
}
