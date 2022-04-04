package com.electrical;

public class IndustrialElectrical extends DomesticElectricals {
public void threePhase() {
	System.out.println("Machines");
	System.out.println("Heavy Loads");
}
public static void main(String[] args) {
	IndustrialElectrical ie=new IndustrialElectrical();
	ie.threePhase();
	ie.singlePhase();
}
}
