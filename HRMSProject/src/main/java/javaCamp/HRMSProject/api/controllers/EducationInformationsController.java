package javaCamp.HRMSProject.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaCamp.HRMSProject.bussiness.abstracts.EducationInformationService;
import javaCamp.HRMSProject.core.utilities.results.DataResult;
import javaCamp.HRMSProject.entities.concretes.EducationInformation;

@RestController("/api/educationinformations")
@RequestMapping
public class EducationInformationsController {
	private EducationInformationService educationInformationService;

	public EducationInformationsController(EducationInformationService educationInformationService) {
		super();
		this.educationInformationService = educationInformationService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<EducationInformation>> getAll(){
		
		return this.educationInformationService.getAll();
	}

}
