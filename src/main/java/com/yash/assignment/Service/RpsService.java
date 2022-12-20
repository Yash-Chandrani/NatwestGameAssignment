package com.yash.assignment.Service;

import org.springframework.stereotype.Service;

@Service
public abstract class RpsService {
	
	abstract String results(String player,String computerPlay) throws InvalidOptionException;
	
	abstract String getRandom();

}