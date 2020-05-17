package com.company.less_1;

public class RunningTrack extends Barrier {
    int trackDistance;

    public RunningTrack(int trackDistance) {
        this.trackDistance = trackDistance;
    }
    public void existanceRun (Existence exis){
        exis.Run(trackDistance);
    }
}
