package com.comp2014group5.model.nhs;

import org.json.JSONException;
import org.json.JSONObject;

public class NST {

	public static final String KEY_HOSPITAL_NUMBER = "hospital-number";
	public static final String KEY_WEIGHT = "weight";
	public static final String KEY_HEIGHT = "height";
	public static final String KEY_WEEK_NUMBER = "week-number";
	public static final String KEY_APPETITE_SCORE = "appetite";
	public static final String KEY_NEURO_SCORE = "neurological";
	public static final String KEY_PHYS_APPR_SCORE = "physical-appearence";
	public static final String KEY_WEIGHT_LOSS_SCORE = "weight-loss";
	public static final String KEY_INTAKE_SCORE = "intake";

	private Patient patient;
	private float weight;
	private float height;
	private int weekNumber;

	private int appetiteScore;
	private int neurologicalScore;
	private int physicalAppearenceScore;
	private int weightLossScore;
	private int intakeScore;

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public int getAppetiteScore() {
		return appetiteScore;
	}

	public void setAppetiteScore(int appetiteScore) {
		this.appetiteScore = appetiteScore;
	}

	public int getNeurologicalScore() {
		return neurologicalScore;
	}

	public void setNeurologicalScore(int neurologicalScore) {
		this.neurologicalScore = neurologicalScore;
	}

	public int getPhysicalAppearenceScore() {
		return physicalAppearenceScore;
	}

	public void setPhysicalAppearenceScore(int physicalAppearenceScore) {
		this.physicalAppearenceScore = physicalAppearenceScore;
	}

	public int getWeightLossScore() {
		return weightLossScore;
	}

	public void setWeightLossScore(int weightLossScore) {
		this.weightLossScore = weightLossScore;
	}

	public int getIntakeScore() {
		return intakeScore;
	}

	public void setIntakeScore(int intakeScore) {
		this.intakeScore = intakeScore;
	}

	public int getWeekNumber() {
		return weekNumber;
	}

	public void setWeekNumber(int weekNumber) {
		this.weekNumber = weekNumber;
	}

	public JSONObject toJSONObject() throws JSONException {

		JSONObject nstObject = new JSONObject();

		nstObject.put(KEY_HOSPITAL_NUMBER, patient.getHospitalNumber());
		nstObject.put(KEY_WEIGHT, weight);
		nstObject.put(KEY_HEIGHT, height);
		nstObject.put(KEY_WEEK_NUMBER, weekNumber);
		nstObject.put(KEY_APPETITE_SCORE, appetiteScore);
		nstObject.put(KEY_NEURO_SCORE, neurologicalScore);
		nstObject.put(KEY_PHYS_APPR_SCORE, physicalAppearenceScore);
		nstObject.put(KEY_WEIGHT_LOSS_SCORE, weightLossScore);
		nstObject.put(KEY_INTAKE_SCORE, intakeScore);

		return nstObject;
	}

}
