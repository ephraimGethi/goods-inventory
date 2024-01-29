package net.inventory.gims.service.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.inventory.gims.Entity.Goods;
import net.inventory.gims.repository.GoodsRepository;
import net.inventory.gims.service.goodsService;
@Service
public class GoodsServiceImpl implements goodsService{
private GoodsRepository goodsrepository;
	@Override
	public List<Goods> getAllGoods() {
		// TODO Auto-generated method stub
		return goodsrepository.findAll();
	}
	public GoodsRepository getGoodsrepository() {
		return goodsrepository;
	}
	public void setGoodsrepository(GoodsRepository goodsrepository) {
		this.goodsrepository = goodsrepository;
	}
	public GoodsServiceImpl(GoodsRepository goodsrepository) {
		super();
		this.goodsrepository = goodsrepository;
	}
	@Override
	public Goods addGoodToInventory(Goods goods) {
		// TODO Auto-generated method stub
		return goodsrepository.save(goods);
	}
	@Override
	public Goods updateProduct(Long id) {
		// TODO Auto-generated method stub
		return goodsrepository.findById(id).get() ;
	}
	@Override
	public Goods addUpdatedProduct(Goods goods) {
		// TODO Auto-generated method stub
		return goodsrepository.save(goods);
	}
	@Override
	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub
		goodsrepository.deleteById(id);
		
	}
	

}
