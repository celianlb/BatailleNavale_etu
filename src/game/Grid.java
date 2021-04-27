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
		Coordinates coord= new Coordinates(column, line);
		if(isValidShip(coord, s, d)==true) {
			placeShip(coord, s, d);
			return true;
		}else {
			return false;
		}
	}
	
	private void placeShip (Coordinates coord, int size, int dir) {
		int column=coord.getColumn();
		int line=coord.getLine();
		mat[line][column]=1;
		if(dir==1) {
			for(int i=0; i<size; i++) {
				mat[line][column+i]=1;
			}
			
		}else if(dir==0){
			for(int i=0; i<size; i++) {
				mat[line+i][column]=1;
			}
		}
	}
	
	private boolean isValidShip(Coordinates coord, int size, int dir) {
		boolean res = false;
		int column=coord.getColumn();
		int line=coord.getLine();
		if(dir==1) {
			int limite=column+size;
			if(limite>GRID_SIZE) {
				res=false;
			}else {
				for(int i=0; i<size; i++) {
					int place = mat[line][column+i];
					if(place==1) {
						res = false;
					}
				}
				res=true;
			}


		}else if(dir==0){
			int limite=line+size;
			if(limite>GRID_SIZE) {
				res=false;
			}else {
				for(int i=0; i<size; i++) {
					int place = mat[line+i][column];
					if(place==1) {
						res = false;
					}
				}
				res=true;
			}

		}

		System.out.println(res);
		return res;
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
