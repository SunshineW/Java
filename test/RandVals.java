package test;

import java.util.Random;

public interface RandVals {
	Random random = new Random();
	int randomInt = random.nextInt(10);
	long randomLong = random.nextLong() * 10;
	float randomFloat = random.nextFloat() * 10;
	double randomDouble = random.nextDouble() * 10;
}
