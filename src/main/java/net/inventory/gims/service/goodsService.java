package net.inventory.gims.service;

import java.util.List;

import net.inventory.gims.Entity.Goods;

public interface goodsService {
	List<Goods> getAllGoods();
    Goods addGoodToInventory(Goods goods);
    Goods updateProduct(Long id);
    Goods addUpdatedProduct(Goods goods);
    void deleteProduct(Long id);
}
