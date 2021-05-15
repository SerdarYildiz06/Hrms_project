package hrms.project.api.controllers;

import hrms.project.business.abstracts.JobPositionsService;
import hrms.project.entities.JobPositions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/linkedin")
public class JobPositionsController {

    private JobPositionsService jobPositionsService;

    public JobPositionsController(JobPositionsService jobPositionsService) {
        super();
        this.jobPositionsService = jobPositionsService;
    }
        @GetMapping("jobPositions")
        public List<JobPositions> getAll(){
        return List.of(new JobPositions(
                1,
                "mobil developer",
                8000

        ));
}
}
