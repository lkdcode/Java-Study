package caffeine;

import java.util.ArrayList;
import java.util.List;

public class companyAssistant {
    public static void main(String[] args) {

        WorkerService workerService = new WorkerService();
        initData(workerService);

//        CoffeeMenu run = new CoffeeMenu();
//        run.show();

        System.out.println(workerService.searchWorkersTotal().toString());


    }

    private static void initData(WorkerService workerService) {
        workerService.addWorkers(new Worker("Kim.E.F", "사원", 0));
        workerService.addWorkers(new Worker("Lee.Q.W", "주임", 0));
        workerService.addWorkers(new Worker("Park.C.O", "대리", 0));
        workerService.addWorkers(new Worker("Choi.P.N", "과장", 0));
        workerService.addWorkers(new Worker("Kim.A.E", "주임", 0));
        workerService.addWorkers(new Worker("Park.Q.Q", "사원", 0));
        workerService.addWorkers(new Worker("Choi.Z.C", "과장", 0));
        workerService.addWorkers(new Worker("Son.H.M", "주임", 0));
        workerService.addWorkers(new Worker("MESSI", "대리", 0));
    }

}