package com.company.less_1;
/*
Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
————————————————————————
Создайте два класса: беговая дорожка и стена, при прохождении через которые,
участники должны выполнять соответствующие действия (бежать или прыгать),
результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
————————————————————————
Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
* */

public class Main {

    public static void main(String[] args) {

	Robot robot = new Robot("Фаер", 10, 15);
	Robot robot1 = new Robot("Нолик",7,3);
	Human human = new Human("Феодор",50, 10);
	Cat cat = new Cat("Барсик", 80,12);

	RunningTrack track1 = new RunningTrack(6);
	RunningTrack track2 = new RunningTrack(10);
	RunningTrack track3 = new RunningTrack(60);
	Wall wallFist = new Wall(11);
	Wall wallSecond = new Wall(5);
	Wall wallThird = new Wall(3);

//	track.existanceRun(robot);
//	wallFist.JumpWall(robot1);
//	robot1.Jump(7);
//	robot1.Jump(2);
//	robot.Run(5);
//	robot1.Run(15);
//	robot.Jump(5);

 	Barrier[] barriers =  new Barrier[6];
 	barriers[0]=  track1;
 	barriers[1]= wallFist;
 	barriers[2]= wallSecond;
 	barriers[3]= wallThird;
 	barriers[4]= track3;
 	barriers[5]= track2;


 	Existence[] existences = new Existence[4];
 	existences[0]=robot;
 	existences[1]=robot1;
 	existences[2]= human;
 	existences[3]=cat;



 	for (int i = 0; i< barriers.length; i++){
 		for(int j=0; j<existences.length; j++){
 			if (barriers[i] instanceof Wall){
				if((existences[j]).successBarrier){
					((Wall)barriers[i]).JumpWall(existences[j]);
				}else System.out.println( existences[j].name + " не смог пройти прошлое препятствие и сошел с дистанции");

			}
 			if(barriers[i] instanceof RunningTrack){
 				if (existences[j].successBarrier){
					((RunningTrack)barriers[i]).existanceRun(existences[j]);
				}else System.out.println( existences[j].name + " не смог пройти прошлое препятствие и сошел с дистанции");

			}
		}
	}



    }
}
