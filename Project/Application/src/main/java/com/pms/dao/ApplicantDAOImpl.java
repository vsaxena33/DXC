package com.pms.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.mongodb.WriteResult;
import com.pms.model.Applicant;

@Repository
public class ApplicantDAOImpl implements ApplicantDAO {
	
	@Autowired
	MongoTemplate mongoTemplate;

	public boolean addApplicant(Applicant applicant) {
		System.out.println("added in dao" + applicant);
		mongoTemplate.save(applicant);
		return false;
	}

	public boolean deleteApplicant(int applicantId) {
		Applicant applicant = new Applicant();
		applicant.setApplication_No(applicantId);
		WriteResult writeResult = mongoTemplate.remove(applicant);
		System.out.println(writeResult);
		int rowsAffected = writeResult.getN();
		if (rowsAffected == 0)
			return false;
		else
			return true;
	}

	public Applicant displayApplicant(int applicantId) {
		return mongoTemplate.findById(applicantId, Applicant.class, "applicant");
	}

}
