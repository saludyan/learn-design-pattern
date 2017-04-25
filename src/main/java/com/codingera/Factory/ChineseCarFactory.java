package com.codingera.Factory;

public class ChineseCarFactory extends AbstractCarFactory {

	/**
	 * 
	 * @param brand
	 */
	public AbstractCar produce(String brand) {
		if("byd".equals(brand.toLowerCase())){
			return new BYDCar();
		}
		if("geely".equals(brand.toLowerCase())){
			return new GeelyCar();
		}
		throw new RuntimeException("没有该汽车品牌");
	}

}