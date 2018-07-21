package com.bestfit.app.service;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component 
@Service
public class BestFitServices {	

	public JSONObject calculateBmi( double weight,double height,int age) throws JSONException {
		JSONObject bestfit=new JSONObject();
		JSONObject  nextfit=new JSONObject();
	    JSONObject  neartofit=new JSONObject();
		
		 JSONObject bmiResponseObjet=new JSONObject();		
		 final double KILOGRAMS_PER_POUND = 0.453; 
	     final double METERS_PER_INCH = 0.026;
	     double weightInKilogram = weight * KILOGRAMS_PER_POUND; 
	     double heightInMeters = height * METERS_PER_INCH; 
	     double bmi = weightInKilogram / 
	      (heightInMeters * heightInMeters);	     
	     if (bmi < 16) {
	    	 bmiResponseObjet.put("bmireport" ,"loslyfit");
	         bmiResponseObjet.put("image", "yaimage");
	         bestfit.put("image","image1");
	         bestfit.put("fit","m-43");
	         bestfit.put("size", "M");
	         nextfit.put("image","image2");
	         neartofit.put("fit","m-44");
	         neartofit.put("size","44");
	         neartofit.put("fit", "m-44");
	         neartofit.put("image", "image");

	     }
	     else if (bmi < 18) {
	    	 bmiResponseObjet.put("bmireport" ,"You are losly");
	         bmiResponseObjet.put("image", "yimage");
	         bestfit.put("image","image1");
	         bestfit.put("fit","m-43");
	         bestfit.put("size", "M");
	         nextfit.put("image","image2");
	         neartofit.put("fit","m-44");
	         neartofit.put("size","44");
	         neartofit.put("fit", "m-44");
	         neartofit.put("image", "image");

	     }
	     else if (bmi < 24) {
	    	 bmiResponseObjet.put("bmireport" ,"You are normal weight");
	    	 bmiResponseObjet.put("image", "yaimage");
	    	 bestfit.put("image","image1");
	         bestfit.put("fit","m-43");
	         bestfit.put("size", "M");
	         nextfit.put("image","image2");
	         neartofit.put("fit","m-44");
	         neartofit.put("size","44");
	         neartofit.put("fit", "m-44");
	         neartofit.put("image", "image");

	     }
	     else if (bmi < 29) {
	    	 bmiResponseObjet.put("bmireport" ,"You are overweight");
	    	 bmiResponseObjet.put("image", "yaimage");
	    	 bestfit.put("image","image1");
	         bestfit.put("fit","m-43");
	         bestfit.put("size", "M");
	         nextfit.put("image","image2");
	         neartofit.put("fit","m-44");
	         neartofit.put("size","44");
	         neartofit.put("fit", "m-44");
	         neartofit.put("image", "image");

	     }
	     else if (bmi < 35) {
	    	 bmiResponseObjet.put("bmireport" ,"You are seriously overweight");
	    	 bmiResponseObjet.put("image", "yaimage");
	    	 bestfit.put("image","image1");
	         bestfit.put("fit","m-43");
	         bestfit.put("size", "M");
	         nextfit.put("image","image2");
	         neartofit.put("fit","m-44");
	         neartofit.put("size","44");
	         neartofit.put("fit", "m-44");
	         neartofit.put("image", "image");

	     }
	     else {
	    	 bmiResponseObjet.put("bmireport" ,"You are gravely overweight");
	    	 bmiResponseObjet.put("image", "yaimage");
	    	 bestfit.put("image","image1");
	         bestfit.put("fit","m-43");
	         bestfit.put("size", "M");
	         nextfit.put("image","image2");
	         neartofit.put("fit","m-44");
	         neartofit.put("size","44");
	         neartofit.put("fit", "m-44");
	         neartofit.put("image", "image");

	     }
	     bmiResponseObjet.put("bestfit", bestfit);
	     bmiResponseObjet.put("nextfit", nextfit);
	     bmiResponseObjet.put("neartofit", neartofit);
	    
		return bmiResponseObjet;		
	
	
	
	
		
	}

}
