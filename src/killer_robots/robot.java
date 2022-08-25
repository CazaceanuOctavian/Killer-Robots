package killer_robots;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class robot {
	
	static Scanner input= new Scanner(System.in);
	
	String robotName;
	int robotHp;
	int posX;
	int posY;
	int viewRange;
	boolean killerRobot;
	boolean alive;
	
	
	public robot (String robotName, int robotHp, int posX, int posY, int viewRange){
		this.robotName=robotName;
		this.robotHp=robotHp;
		this.posX=posX;
		this.posY=posY;
		this.viewRange=viewRange;
		this.killerRobot=true;
		this.alive=true;
	}
	
	public robot (String robotName, int robotHp, int posX, int posY){
		this.robotName=robotName;
		this.robotHp=robotHp;
		this.posX=posX;
		this.posY=posY;
		this.alive=true;
	}
	
	public void setName(String robotName) {
		this.robotName=robotName;
	}
	
	public void setRobotHp(int robotHP) {
		this.robotHp=robotHp;
	}
	
	public void setPosX(int posX) {
		this.posX=posX;
	}
	
	public void setPosY(int posY) {
		this.posY=posY;
	}
	
	public void setViewRange(int viewRange) {
		this.viewRange=viewRange;
	}
	
	public void setKillerRobot(boolean killerRobot) {
		this.killerRobot=killerRobot;
	}
	
	public void setAliveStatus(boolean alive) {
		this.alive=alive;
	}
	
	
	public String getName(){
		return this.robotName;
	}
	
	public int getRobotHp() {
		return this.robotHp;
	}
	
	public int getPosX() {
		return this.posX;
	}
	
	public int getPosY() {
		return this.posY;
	}
	
	public int getViewRange() {
		return this.viewRange;
	}
	
	public boolean getKillerRobot() {
		return this.killerRobot;
	}
	
	public boolean getAliveStatus() {
		return this.alive;
	}
	
	
	
	public static void main(String[] args) {
		robot killerRobot = new robot("roby", 100, 1, 2, 15);
		
		killerRobot.setKillerRobot(true);
		System.out.println(killerRobot.getKillerRobot());
		System.out.println(killerRobot.getViewRange());
		
		robot normalRobot = new robot("robustus", 100, 5, 3);
		
		System.out.println(normalRobot.getKillerRobot());
		System.out.println(normalRobot.getViewRange());
		System.out.println(normalRobot.getAliveStatus());
		
		input.close();
	}
}
