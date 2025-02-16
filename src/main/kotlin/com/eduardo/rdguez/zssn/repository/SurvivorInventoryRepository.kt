package com.eduardo.rdguez.zssn.repository

import com.eduardo.rdguez.zssn.domain.Survivor
import com.eduardo.rdguez.zssn.domain.SurvivorInventory
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SurvivorInventoryRepository : JpaRepository<SurvivorInventory, Long> {

  fun findAllBySurvivor(survivor: Survivor): List<SurvivorInventory>
  fun findAllBySurvivorIsInfectedFalse(): List<SurvivorInventory>

}