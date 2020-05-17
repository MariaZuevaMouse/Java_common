package com.company.less_1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Existence {
    public boolean successBarrier =true;
    String name;
    int distanceRun;
    int heihghtJump;

    public Existence(String name, int distanceRun, int heihghtJump) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.heihghtJump = heihghtJump;
    }

    public void Jump(int height) {
        if (height<= heihghtJump){
            System.out.println(name + "подпрыгнул" + height + "метров");
        }else System.out.println( name + "не смог подпрыгнуть");
    }

    public void Run( int distance) {
        if(distance <= distanceRun){
            System.out.println(name +" прбежал");
        }else System.out.println(name + " не смог пробежать");

    }


}
