package com.codeinnova.CrudMercados.Repository;

import com.codeinnova.CrudMercados.Entities.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketsRepository extends JpaRepository<Market, Long> {
}
