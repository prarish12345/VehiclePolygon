package com.example.cus.entity;




public class GeoFeature {
	
	private String name;
	private Geometry geometry;
	public GeoFeature(String name, Geometry geometry) {
		super();
		this.name = name;
		this.geometry = geometry;
	}
	public GeoFeature() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Geometry getGeometry() {
		return geometry;
	}
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	@Override
	public String toString() {
		return "GeoFeature [name=" + name + "]";
	}
	
	
	
	
	



}
