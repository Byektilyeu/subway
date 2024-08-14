package com.subwayTest.subway.db2.repositories;

import com.subwayTest.subway.db2.entities.RkeeperEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RkeeperRepository extends JpaRepository<RkeeperEntity, Long> {
}
