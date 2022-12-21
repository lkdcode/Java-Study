package caffeine;

import java.util.ArrayList;
import java.util.List;

public class WorkerService {
    public List<Worker> workers;

    public WorkerService() {
        this.workers = new ArrayList<>();
    }

    public void addWorkers(Worker newWorker) {
        this.workers.add(newWorker);
    }

    public List<Worker> searchWorkersTotal() {
        return this.workers;
    }
}
