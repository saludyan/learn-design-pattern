package com.codingera.Factory;

public class GermanyCarFactory extends AbstractCarFactory {

	/**
	 * 
	 * @param brand
	 */
	public AbstractCar produce(String brand) {
		if("audi".equals(brand.toLowerCase())){
			return new AudiCar();
		}
		if("volkswagen".equals(brand.toLowerCase())){
			return new VolkswagenCar();
		}
		throw new RuntimeException("没有该汽车品牌");
	}

}