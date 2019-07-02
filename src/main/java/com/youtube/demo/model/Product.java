package com.youtube.demo.model;

import java.sql.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="product")
@Access(AccessType.FIELD)
public class Product extends ParentEntity{

	private static final long serialVersionUID = 1430072901600190422L;
	
	@Column(name="id_status", nullable=false, length=11)
	private Integer idStatus;
	
	@Column(name="id_family", nullable=false, length=11)
	private Integer idFamily;
	
	@Column(name="sku", nullable=true, length=150)
	private String sku;
	
	@Column(name="code", nullable=true, length=150)
	private String code;

	@Column(name="id_classification", nullable=true, length=11)
	private Integer idClassification;
	
	@Column(name="name", nullable=false, length=150)
	private String name;
	
	@Column(name="presentation", nullable=true, length=150)
	private String presentation;
	
	@Column(name="id_udm", nullable=true, length=11)
	private Integer idUdm;
	
	@Column(name="price", nullable=false, length=18)
	private double price;
	
	@Column(name="iva", nullable=false, length=18)
	private double iva;
	
	@Column(name="total", nullable=false, length=18)
	private double total;
	
	@Column(name="observation", nullable=true, length=300)
	private String observation;
	
	@Column(name="path_image", nullable=true, length=255)
	private String pathImage;
	
	@Column(name="id_product_type", nullable=true, length=11)
	private Integer idProductType;
	
	@Column(name="description", nullable=true, length=750)
	private String description;
	
	@Column(name="benefits", nullable=true, length=750)
	private String benefits;
	
	@Column(name="aplications", nullable=true, length=750)
	private String aplications;
	
	@Column(name="usages", nullable=true, length=750)
	private String usages;
	
	@Column(name="created_at", nullable=false)
	private Date created_at;
	
	@Column(name="updated_at", nullable=true)
	private Date updated_at;
	
	@Column(name="deleted_at", nullable=true)
	private Date  deleted_at;

	public Integer getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Integer idStatus) {
		this.idStatus = idStatus;
	}

	public Integer getIdFamily() {
		return idFamily;
	}

	public void setIdFamily(Integer idFamily) {
		this.idFamily = idFamily;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getIdClassification() {
		return idClassification;
	}

	public void setIdClassification(Integer idClassification) {
		this.idClassification = idClassification;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPresentation() {
		return presentation;
	}

	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}

	public Integer getIdUdm() {
		return idUdm;
	}

	public void setIdUdm(Integer idUdm) {
		this.idUdm = idUdm;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public String getPathImage() {
		return pathImage;
	}

	public void setPathImage(String pathImage) {
		this.pathImage = pathImage;
	}

	public Integer getIdProductType() {
		return idProductType;
	}

	public void setIdProductType(Integer idProductType) {
		this.idProductType = idProductType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBenefits() {
		return benefits;
	}

	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}

	public String getAplications() {
		return aplications;
	}

	public void setAplications(String aplications) {
		this.aplications = aplications;
	}

	public String getUsages() {
		return usages;
	}

	public void setUsages(String usages) {
		this.usages = usages;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public Date getDeleted_at() {
		return deleted_at;
	}

	public void setDeleted_at(Date deleted_at) {
		this.deleted_at = deleted_at;
	}
	
}
