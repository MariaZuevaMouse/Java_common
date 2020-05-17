package com.company.less_1;

public class Robot extends Existence{
    public Robot(String name, int distanceRun, int heihghtJump) {
        super(name, distanceRun, heihghtJump);
    }

    @Override
    public void Run(int distance) {
        if(distance<=distanceRun){
            System.out.println("робот " + name + " пробежал " + distance + " метров");
            successBarrier=true;
        }else {
            System.out.println("Робот " +  name + " не смог пробежать " + distance +" метров, максимальная дистанция "+ distanceRun + " метров");
            successBarrier=false;
        }
    }

    @Override
    public void Jump(int height) {
        if(height<=heihghtJump){
            System.out.println("Робот " + name + " подпрыгнул " + height +" метров");
            successBarrier=true;
        }else {
            System.out.println("робот " +name + " не смог подпрыгнуть " + height + " метров, его максимальная высота прыжка " +heihghtJump + " метров");
            successBarrier=false;
        }
    }
}
