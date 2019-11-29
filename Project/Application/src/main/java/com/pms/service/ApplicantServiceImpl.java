package com.pms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.model.Applicant;

@Service
public class ApplicantServiceImpl implements ApplicantService {
	
	@Autowired
	ApplicantService applicantService;

	public boolean addApplicant(Applicant applicant) {
		System.out.println("inside applicant service: " + applicant);
		applicantService.addApplicant(applicant);
		return false;
	}

	public boolean deleteApplicant(int applicantId) {
		return applicantService.deleteApplicant(applicantId);
	}

	public Applicant displayApplicant(int applicantId) {
		return applicantService.displayApplicant(applicantId);
	}

}
