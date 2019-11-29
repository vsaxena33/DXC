package com.pms.service;

import com.pms.model.Applicant;

public interface ApplicantService {

	public boolean addApplicant(Applicant applicant);

	public boolean deleteApplicant(int applicantId);

	public Applicant displayApplicant(int applicantId);

}
