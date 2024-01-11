public class FileMovingService {
    Step aToBFileStep = new AToBFileStep();
    Step bToCFileStep = new BToCFileStep();

    Step updateDatabaseStep = new FileDatabaseStep();

    public void moveFileFromAToC() {
        Job aToBMoveJob = this.createAToCMoveJob();
        aToBMoveJob.launchJob();
    }

    private Job createAToCMoveJob(){
        JobBuilder builder = new JobBuilder();
        builder.buildJob();
        builder.addStep(aToBFileStep);
        builder.addStep(updateDatabaseStep);
        builder.addStep(bToCFileStep);
        builder.addStep(updateDatabaseStep);

        return builder.getJob();
    }
}
