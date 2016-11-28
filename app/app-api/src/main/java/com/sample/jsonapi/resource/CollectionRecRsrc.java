package com.sample.jsonapi.resource;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import com.sample.domain.enums.CollectionMode;
import com.sample.domain.enums.CollectionStatus;
import com.sample.domain.enums.MilkType;
import com.sample.domain.enums.QualityCategory;
import com.sample.domain.enums.Shift;
import com.sample.domain.enums.UOM;

import io.katharsis.resource.annotations.JsonApiId;
import io.katharsis.resource.annotations.JsonApiResource;

@JsonApiResource(type = "collectionrecords")
public class CollectionRecRsrc {
	
    private UUID customerid;
	
	private UUID locid;

	@JsonApiId
	private UUID uid;

	private LocalDate createdDate;

	private Shift shift;

	private int sample;

	private UUID weighingScaleRecordUid;

	private UUID milkAnalysisRecordUid;

	private int weighingScaleRecordTestNumber;

	private String agentId;

	private String routeId;

	private UUID trayUid;

	private MilkType milkType;

	private int numCans = 0;

	private LocalTime tippingStartTime;

	private LocalTime tippingEndTime;

	private float qty;

	private UOM uom;

	private CollectionStatus wsrCollectionStatus;

	private CollectionMode wsrCollectionMode;

	private String weighingScaleRecordUserId; 

	private String weighingScaleId;

	private String wsrQualitativeComment1;

	private String wsrQualitativeComment2;

	private int milkAnalyserRecordTestNumber;

	private LocalTime milkAnalyserRecordTime;

	private float fat;

	private float snf;

	private float clr;

	private float awm;

	private float temperature;

	private float proteins;

	private float lactose;

	private float salts;

	private float freezingPoint;

	private CollectionStatus marCollectionStatus;

	private CollectionMode marCollectionMode;

	private QualityCategory qualityCategory;

	private String marQualitativeComment1;

	private String marQualitativeComment2;

	private float rate;

	private UUID rateChartUid;

	private float bonus;

	private UUID bonusRateChartUid;

	private float amount;

	private String milkAnalyserId;

	private String milkAnalyserUserId;

	public UUID getCustomerid() {
		return customerid;
	}

	public void setCustomerid(UUID customerid) {
		this.customerid = customerid;
	}

	public UUID getLocid() {
		return locid;
	}

	public void setLocid(UUID locid) {
		this.locid = locid;
	}

	public UUID getUid() {
		return uid;
	}

	public void setUid(UUID uid) {
		this.uid = uid;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public Shift getShift() {
		return shift;
	}

	public void setShift(Shift shift) {
		this.shift = shift;
	}

	public int getSample() {
		return sample;
	}

	public void setSample(int sample) {
		this.sample = sample;
	}

	public UUID getWeighingScaleRecordUid() {
		return weighingScaleRecordUid;
	}

	public void setWeighingScaleRecordUid(UUID weighingScaleRecordUid) {
		this.weighingScaleRecordUid = weighingScaleRecordUid;
	}

	public UUID getMilkAnalysisRecordUid() {
		return milkAnalysisRecordUid;
	}

	public void setMilkAnalysisRecordUid(UUID milkAnalysisRecordUid) {
		this.milkAnalysisRecordUid = milkAnalysisRecordUid;
	}

	public int getWeighingScaleRecordTestNumber() {
		return weighingScaleRecordTestNumber;
	}

	public void setWeighingScaleRecordTestNumber(int weighingScaleRecordTestNumber) {
		this.weighingScaleRecordTestNumber = weighingScaleRecordTestNumber;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public UUID getTrayUid() {
		return trayUid;
	}

	public void setTrayUid(UUID trayUid) {
		this.trayUid = trayUid;
	}

	public MilkType getMilkType() {
		return milkType;
	}

	public void setMilkType(MilkType milkType) {
		this.milkType = milkType;
	}

	public int getNumCans() {
		return numCans;
	}

	public void setNumCans(int numCans) {
		this.numCans = numCans;
	}

	public LocalTime getTippingStartTime() {
		return tippingStartTime;
	}

	public void setTippingStartTime(LocalTime tippingStartTime) {
		this.tippingStartTime = tippingStartTime;
	}

	public LocalTime getTippingEndTime() {
		return tippingEndTime;
	}

	public void setTippingEndTime(LocalTime tippingEndTime) {
		this.tippingEndTime = tippingEndTime;
	}

	public float getQty() {
		return qty;
	}

	public void setQty(float qty) {
		this.qty = qty;
	}

	public UOM getUom() {
		return uom;
	}

	public void setUom(UOM uom) {
		this.uom = uom;
	}

	public CollectionStatus getWsrCollectionStatus() {
		return wsrCollectionStatus;
	}

	public void setWsrCollectionStatus(CollectionStatus wsrCollectionStatus) {
		this.wsrCollectionStatus = wsrCollectionStatus;
	}

	public CollectionMode getWsrCollectionMode() {
		return wsrCollectionMode;
	}

	public void setWsrCollectionMode(CollectionMode wsrCollectionMode) {
		this.wsrCollectionMode = wsrCollectionMode;
	}

	public String getWeighingScaleRecordUserId() {
		return weighingScaleRecordUserId;
	}

	public void setWeighingScaleRecordUserId(String weighingScaleRecordUserId) {
		this.weighingScaleRecordUserId = weighingScaleRecordUserId;
	}

	public String getWeighingScaleId() {
		return weighingScaleId;
	}

	public void setWeighingScaleId(String weighingScaleId) {
		this.weighingScaleId = weighingScaleId;
	}

	public String getWsrQualitativeComment1() {
		return wsrQualitativeComment1;
	}

	public void setWsrQualitativeComment1(String wsrQualitativeComment1) {
		this.wsrQualitativeComment1 = wsrQualitativeComment1;
	}

	public String getWsrQualitativeComment2() {
		return wsrQualitativeComment2;
	}

	public void setWsrQualitativeComment2(String wsrQualitativeComment2) {
		this.wsrQualitativeComment2 = wsrQualitativeComment2;
	}

	public int getMilkAnalyserRecordTestNumber() {
		return milkAnalyserRecordTestNumber;
	}

	public void setMilkAnalyserRecordTestNumber(int milkAnalyserRecordTestNumber) {
		this.milkAnalyserRecordTestNumber = milkAnalyserRecordTestNumber;
	}

	public LocalTime getMilkAnalyserRecordTime() {
		return milkAnalyserRecordTime;
	}

	public void setMilkAnalyserRecordTime(LocalTime milkAnalyserRecordTime) {
		this.milkAnalyserRecordTime = milkAnalyserRecordTime;
	}

	public float getFat() {
		return fat;
	}

	public void setFat(float fat) {
		this.fat = fat;
	}

	public float getSnf() {
		return snf;
	}

	public void setSnf(float snf) {
		this.snf = snf;
	}

	public float getClr() {
		return clr;
	}

	public void setClr(float clr) {
		this.clr = clr;
	}

	public float getAwm() {
		return awm;
	}

	public void setAwm(float awm) {
		this.awm = awm;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getProteins() {
		return proteins;
	}

	public void setProteins(float proteins) {
		this.proteins = proteins;
	}

	public float getLactose() {
		return lactose;
	}

	public void setLactose(float lactose) {
		this.lactose = lactose;
	}

	public float getSalts() {
		return salts;
	}

	public void setSalts(float salts) {
		this.salts = salts;
	}

	public float getFreezingPoint() {
		return freezingPoint;
	}

	public void setFreezingPoint(float freezingPoint) {
		this.freezingPoint = freezingPoint;
	}

	public CollectionStatus getMarCollectionStatus() {
		return marCollectionStatus;
	}

	public void setMarCollectionStatus(CollectionStatus marCollectionStatus) {
		this.marCollectionStatus = marCollectionStatus;
	}

	public CollectionMode getMarCollectionMode() {
		return marCollectionMode;
	}

	public void setMarCollectionMode(CollectionMode marCollectionMode) {
		this.marCollectionMode = marCollectionMode;
	}

	public QualityCategory getQualityCategory() {
		return qualityCategory;
	}

	public void setQualityCategory(QualityCategory qualityCategory) {
		this.qualityCategory = qualityCategory;
	}

	public String getMarQualitativeComment1() {
		return marQualitativeComment1;
	}

	public void setMarQualitativeComment1(String marQualitativeComment1) {
		this.marQualitativeComment1 = marQualitativeComment1;
	}

	public String getMarQualitativeComment2() {
		return marQualitativeComment2;
	}

	public void setMarQualitativeComment2(String marQualitativeComment2) {
		this.marQualitativeComment2 = marQualitativeComment2;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public UUID getRateChartUid() {
		return rateChartUid;
	}

	public void setRateChartUid(UUID rateChartUid) {
		this.rateChartUid = rateChartUid;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	public UUID getBonusRateChartUid() {
		return bonusRateChartUid;
	}

	public void setBonusRateChartUid(UUID bonusRateChartUid) {
		this.bonusRateChartUid = bonusRateChartUid;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getMilkAnalyserId() {
		return milkAnalyserId;
	}

	public void setMilkAnalyserId(String milkAnalyserId) {
		this.milkAnalyserId = milkAnalyserId;
	}

	public String getMilkAnalyserUserId() {
		return milkAnalyserUserId;
	}

	public void setMilkAnalyserUserId(String milkAnalyserUserId) {
		this.milkAnalyserUserId = milkAnalyserUserId;
	}
	
	@Override
	public String toString() {
		return "CollectionRecRsrc [customerid=" + customerid + ", locid=" + locid + ", uid=" + uid + ", createdDate="
				+ createdDate + ", shift=" + shift + ", agentId=" + agentId + "]";
	}
}
