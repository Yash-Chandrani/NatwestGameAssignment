package com.yash.assignment.Service;

import org.springframework.stereotype.Service;

@Service
public abstract class RpsService {

	// call results method
	abstract String results(String player, String computerPlay) throws InvalidOptionException;

	// call getRandom() method
	abstract String getRandom();

}