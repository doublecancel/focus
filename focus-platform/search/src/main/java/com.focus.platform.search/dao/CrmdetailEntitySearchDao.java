package com.focus.platform.search.dao;

import com.focus.platform.search.entity.CrmdetailEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrmdetailEntitySearchDao extends ElasticsearchCrudRepository<CrmdetailEntity, Integer> {
}
