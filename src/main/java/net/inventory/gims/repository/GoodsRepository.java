package net.inventory.gims.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.inventory.gims.Entity.Goods;

public interface GoodsRepository extends JpaRepository<Goods,Long>{

}
