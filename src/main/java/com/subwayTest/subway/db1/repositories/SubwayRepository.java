package com.subwayTest.subway.db1.repositories;

import com.subwayTest.subway.db1.entities.SubwayEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface SubwayRepository extends JpaRepository<SubwayEntity, Long> {
        public boolean existsById(int id);

    @Query("select max(s.id) from Subway s")
    public Integer findMaxId();

    SubwayEntity findById(SubwayEntity s);
}
