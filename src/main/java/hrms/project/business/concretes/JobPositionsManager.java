package hrms.project.business.concretes;

import hrms.project.business.abstracts.JobPositionsService;
import hrms.project.dataAcces.abstracts.JobPositionsDao;
import hrms.project.entities.JobPositions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionsManager implements JobPositionsService {

    private JobPositionsDao jobPositionsDao;
    @Autowired
    public JobPositionsManager(JobPositionsDao jobPositionsDao) {
        super();
        this.jobPositionsDao = jobPositionsDao;
    }

    @Override
    public List<JobPositions> getAll() {
        return null;
    }
}
