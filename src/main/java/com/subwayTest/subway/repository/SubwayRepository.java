package com.subwayTest.subway.repository;

import com.subwayTest.subway.entity.Subway;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SubwayRepository extends JpaRepository <Subway, Integer> {
    public boolean existsById(int id);
    public List<Subway> findById(int id);
    @Query("select max(s.id) from Subway s")
    public Integer findMaxId();

    Subway findById(Subway s);
}
