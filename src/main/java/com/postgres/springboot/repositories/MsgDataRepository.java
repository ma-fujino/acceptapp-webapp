package com.postgres.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postgres.springboot.MsgData;

@Repository
public interface MsgDataRepository extends JpaRepository<MsgData, Long> {

}
