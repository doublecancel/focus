package com.focus.platform.search.dao;

import com.focus.platform.search.entity.CrmdetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrmdetailEntityDao extends JpaRepository<CrmdetailEntity, Integer> {
}
