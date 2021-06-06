package javaCamp.HRMSProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaCamp.HRMSProject.entities.concretes.JobInformation;

public interface JobInformationDao extends JpaRepository<JobInformation, Integer> {

}
