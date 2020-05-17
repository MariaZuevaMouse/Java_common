package com.company.less_1;


public class Human extends Existence {

    public Human(String name, int distanceRun, int heihghtJump) {
        super(name, distanceRun, heihghtJump);
    }
    @Override
    public void Run(int distance) {
        if(distance<=distanceRun){
            System.out.println("человек " + name + " пробежал " + distance + " метров");
        }else System.out.println("человек " +  name + " не смог пробежать " + distance +" метров, максимальная дистанция "+ distanceRun + " метров");
    }

    @Override
    public void Jump(int height) {
        if(height<=heihghtJump){
            System.out.println("человек " + name + "подпрыгнул " +height +" метров");
            successBarrier=true;
        }else {
            System.out.println("человек " +name + " не смог подпрыгнуть " + height + " метров, его максимальная высота прыжка " +heihghtJump + " метров");
            successBarrier=false;
        }
    }
}
