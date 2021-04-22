package game;

import java.util.ArrayList;

public class Grid {
	private static final int GRID_SIZE = 10;
	private int mat[][];

	public Grid() {
		mat = new int[GRID_SIZE][GRID_SIZE];
		initMat();
	}
	private void initMat() {
	    for (int i = 0; i<GRID_SIZE; i++) {
	        for (int j = 0; j<GRID_SIZE; j++) {
	        	mat[i][j]=0;
	        }
	    }    
	}
	
	public void randomInit() {

	}
	
	public int getValue(int column, int line) {
		return 0;
	}
	
	public void addShot(int column, int line, boolean success) {
	}
	
	public boolean addNewShip(int column, int line, int s, int d) {
		mat[line][column]=1;
		if(d==1) {
			for(int i=0; i<=s; i++) {
				mat[line+i][column]=1;
			}
		}else if(d==0){
			for(int i=0; i<=s; i++) {
				mat[line][column+i]=1;
			}
		}
		return true;
	}
	
	private void placeShip (Coordinates coord, int size, int dir) {
	}
	
	private boolean isValidShip(Coordinates coord, int size, int dir) {
        return true;
	}
	
	public String toString(){
		String str=" ";
		str= str+" |A B C D E F G H I J\n   _____________________\n ";
	    for (int i = 0; i<GRID_SIZE; i++) {
	    	str= str+i+"|";
	        for (int j = 0; j<GRID_SIZE; j++) {
	        	str= str+mat[i][j]+" ";
	        }
	        str= str+"| \n ";
	    }
	    str=str+"  --------------------";
		return str;
	}
}
