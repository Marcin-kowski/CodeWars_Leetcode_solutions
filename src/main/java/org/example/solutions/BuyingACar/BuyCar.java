package org.example.solutions.BuyingACar;

public class BuyCar {

	public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingPerMonth, double percentLossByMonth) {
    	double moneyCollected = 0;
    	double priceOldCar = startPriceOld;
    	double priceNewCar = startPriceNew;
		int monthCounter = 0;
		int moneyLeft = 0;

		while (moneyCollected + priceOldCar < priceNewCar) {
			monthCounter++;
			percentLossByMonth += monthCounter % 2 == 0 ? 0.5 : 0;
			priceNewCar -= priceNewCar * percentLossByMonth / 100;
			priceOldCar -= priceOldCar * percentLossByMonth / 100;
			moneyCollected += savingPerMonth;
		}
		moneyLeft = (int) Math.round(moneyCollected + priceOldCar - priceNewCar);
        return new int[] {monthCounter, moneyLeft};
    }
}