package org.maxiao.exer.basic;

public class FurnitureMain {

	public static void main(String[] args) {
		Bed bed1 = new Bed();
		bed1.setPrice(2500);
		Bed bed2 = new Bed();
		bed2.setPrice(100);
		
		Chair chair1 = new Chair();
		chair1.setPrice(25.3);
		
		Cup cup = new Cup();
		cup.setPrice(2.5);
		
		System.out.println("this is a exercise");
		
		// check instanceof
		// if clause 
	    double sum =0;
	    
	    if(bed1 instanceof FurnitureWithLeg){
	    	sum = sum+ bed1.getPrice();
	    }	
	    if(bed2 instanceof FurnitureWithLeg){
	 	    sum = sum+ bed2.getPrice();
	    }
	 	if(chair1 instanceof FurnitureWithLeg){
		    sum = sum+ chair1.getPrice();
	 	}
		if(cup instanceof FurnitureWithLeg){
		    	sum = sum+ cup.getPrice();
	    }

	}

}
