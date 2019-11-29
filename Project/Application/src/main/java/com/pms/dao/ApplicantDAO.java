package com.pms.dao;

import com.pms.model.Applicant;

public interface ApplicantDAO {

	public boolean addApplicant(Applicant applicant);

	public boolean deleteApplicant(int applicantId);

	public Applicant displayApplicant(int applicantId);

}
