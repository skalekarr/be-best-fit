package com.bestfit.app.controllers;

import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bestfit.app.service.BestFitServices;


@RestController
public class BestFitAppRestController {	
	
	@Autowired
	private BestFitServices BestFitServices;
	@PostMapping("/calculatebmi")	
	@RequestMapping(value ="/calculatebmi",method = RequestMethod.POST)
	public String calcutabmi(@RequestBody Map<String, String> payload) throws NumberFormatException, JSONException {
		System.out.println(payload);
	JSONObject responseBmiReport=BestFitServices.calculateBmi(Double.parseDouble(payload.get("height")),Double.parseDouble(payload.get("weight")),Integer.parseInt(payload.get("age")));
    return responseBmiReport.toString();
	}
	
	@GetMapping("/fitrecomendation")
	public String fitRecomendation(/*@RequestParam String bmi,@RequestParam	String bodytype,@RequestParam String brand */	) {
		
		return "{bodytype:'overwait'}";
	}
	
	

	
}
