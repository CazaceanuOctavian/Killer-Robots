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
	
	public String toString() {
		return this.robotName + " " + this.robotHp + " " + this.posX + " " + this.posY;
	}
	
	public static void main(String[] args) {

		robot killerRobot = new robot("roby", 100, 1, 2, 15);
		List <robot> robotList= new ArrayList<>();
		int robotNumber=input.nextInt();
		for(int i=1; i<=robotNumber; i++) {
			robotList.add(new robot(input.next(), input.nextInt(), input.nextInt(), input.nextInt()));
		}
	
		for(int i=0; i<robotNumber; i++)
			System.out.println(robotList.get(i).alive);
		
		input.close();
	}
}
