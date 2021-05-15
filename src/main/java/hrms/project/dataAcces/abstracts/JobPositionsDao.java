package hrms.project.dataAcces.abstracts;

import hrms.project.entities.JobPositions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionsDao extends JpaRepository<JobPositions,Integer> {
}
