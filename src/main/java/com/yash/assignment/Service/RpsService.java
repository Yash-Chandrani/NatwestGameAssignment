package com.yash.assignment.Service;

import org.springframework.stereotype.Service;

import com.yash.assignment.Service.GamePlay.Options;

@Service
public abstract class RpsService {
	
	abstract String results(String player,Options computerPlay) throws InvalidOptionException;
	
	abstract Options getRandom();

}
