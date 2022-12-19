package com.yash.assignment.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class GamePlay extends RpsService {
	
	public enum Options
	{
		rock,
		paper,
		scissor,
	}
	@Override
	public String results(String player, Options computerPlay) throws InvalidOptionException 
	{
		String result=null;
		int playerCount=0;
		int computerCount=0;
		String finalResult=null;
		
		try {

				Options playerPlay = Options.valueOf(player.toLowerCase());

				if (computerPlay.equals(Options.paper)) {
					if (playerPlay.equals(Options.rock)) {
						result = "Computer scores";
						computerCount = computerCount + 1;
					} else if (playerPlay.equals(Options.paper)) {
						result = "tie";
					} else {
						result = "Player scores";
						playerCount = playerCount + 1;
					}
				}

				else if (computerPlay.equals(Options.scissor)) {
					if (playerPlay.equals(Options.paper)) {
						result = "Computer scores";
						computerCount = computerCount + 1;
					} else if (playerPlay.equals(Options.scissor)) {
						result = "tie";
					} else {
						result = "Player scores";
						playerCount = playerCount + 1;
					}
				}

				else if (computerPlay.equals(Options.rock)) {
					if (playerPlay.equals(Options.scissor)) {
						result = "Computer scores";
						computerCount = computerCount + 1;
					} else if (playerPlay.equals(Options.rock)) {
						result = "tie";
					} else {
						result = "Player scores";
						playerCount = playerCount + 1;
					}
				}


				if (playerCount > computerCount) {
					finalResult = "Player wins";
				} else if (playerCount == computerCount) {
					finalResult = "It's a tie";
				} else {
					finalResult = "Computer wins";
				}


		} catch (IllegalArgumentException illegalArgumentException) {
			// TODO: handle exception
			throw new InvalidOptionException("Invalid move! You can select Rock, Paper, Scissor or Exit");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return finalResult;
	}
	
	public Options getRandom() {
		try {
			List<Options> optionsList = new ArrayList<Options>();

			optionsList.add(Options.rock);
			optionsList.add(Options.paper);
			optionsList.add(Options.scissor);

			int randomise = new Random().nextInt(optionsList.size());

			return optionsList.get(randomise);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	
		
	

}
