package com.eduardo.rdguez.zssn.service.impl

import com.eduardo.rdguez.zssn.domain.Item
import com.eduardo.rdguez.zssn.repository.ItemRepository
import com.eduardo.rdguez.zssn.service.ItemService
import java.util.*
import mu.KotlinLogging
import org.springframework.stereotype.Service

@Service
class ItemServiceImpl(
  private val itemRepository: ItemRepository
) : ItemService {
  private val logger = KotlinLogging.logger {}

  override fun findItemByName(name: String): Optional<Item> {
    logger.debug { "Find item by name: $name" }

    return itemRepository.findByNameIgnoreCase(name)
  }

}