public class JobBuilder {
    private Job job;

    public void buildJob(){
        this.job = new Job();
    }

    public void addStep(Step step){
        this.job.addStep(step);
    }

    public Job getJob(){
        return this.job;
    }
}
