package net.inventory.gims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.inventory.gims.Entity.Goods;
import net.inventory.gims.service.goodsService;

@Controller
public class GoodsController {
	private goodsService goodsservice;
	
	@GetMapping("/goods")
	public String showAllgoods(Model model) {
	model.addAttribute("goods",goodsservice.getAllGoods());
	return "goods";	
	}
	@GetMapping("goods/add_product")
	public String addNewProductForm(Model model) {
		Goods goods =new Goods();
		model.addAttribute("goods",goods);
		return "new_product";
	}
		@PostMapping("/goods")
		public String addProduct(@ModelAttribute("goods") Goods goods) {
		goodsservice.addGoodToInventory(goods);
		return "redirect:/goods";
			}

		@GetMapping("/goods/update_product{id}")
		public String updateProduct(@PathVariable Long id,Model model) {
			model.addAttribute("goods",goodsservice.updateProduct(id));
			return "update_product";
		}
	    @PostMapping("/goods/{id}")
	    public String updateExistingProduct(@PathVariable Long id,@ModelAttribute("goods") Goods goods) {
			Goods existingGoods = goodsservice.updateProduct(id);
	    	existingGoods.setItemDescription(goods.getItemDescription());
	    	existingGoods.setId(id);
	    	existingGoods.setItemName(goods.getItemName());
	    	existingGoods.setItemName(goods.getItemName());
	    	
	    	goodsservice.addUpdatedProduct(existingGoods);
			return "redirect:/goods";
	    	
	    }
	    @GetMapping("/goods/{id}")
	    public String deleteGoodFromRepo(@PathVariable Long id) {
	    	goodsservice.deleteProduct(id);
	    	return "redirect:/goods";
	    }
		
	public goodsService getGoodsservice() {
		return goodsservice;
	}

	public void setGoodsservice(goodsService goodsservice) {
		this.goodsservice = goodsservice;
	}

	public GoodsController(goodsService goodsservice) {
		super();
		this.goodsservice = goodsservice;
	}

}
