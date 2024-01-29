package net.inventory.gims.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Goods")
public class Goods {
	@Column(name="id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="month")
	private String month;
	@Column(name="itemName")
	private String itemName;
	@Column(name="itemDescription")
	private String itemDescription;
	public Goods() {
		
	}
	public Goods(Long id, String month, String itemName, String itemDescription) {
		super();
		this.id = id;
		this.month = month;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
		
	

}
