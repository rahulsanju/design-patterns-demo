import java.util.ArrayList;

public class Job {

    ArrayList<Step> steps = new ArrayList<>();

    public void addStep(Step step){
        this.steps.add(step);
    }

    public void launchJob(){
        for(Step s : this.steps){
            s.execute();
        }
    }
}
