package net.inventory.gims;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.inventory.gims.Entity.Goods;
import net.inventory.gims.repository.GoodsRepository;

@SpringBootApplication
public class GoodsInventoryManagementSystemApplication implements CommandLineRunner{
@Autowired
private GoodsRepository goodsrepository;

public GoodsRepository getGoodsrepository() {
	return goodsrepository;
}

public void setGoodsrepository(GoodsRepository goodsrepository) {
	this.goodsrepository = goodsrepository;
}

public static void main(String[] args) {
		SpringApplication.run(GoodsInventoryManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Goods goods = new Goods((long) 23,"january","Fanta Soda","Arrived in good condition and in the right quantities");
//		goodsrepository.save(goods);
	}

}
