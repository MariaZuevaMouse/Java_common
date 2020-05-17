package com.company.less_1;

public class Wall extends Barrier {
    int heightW;

    public Wall (int height){
        this.heightW=height;
    }
    public void JumpWall (Existence exis){
        exis.Jump(heightW);
    }
}
