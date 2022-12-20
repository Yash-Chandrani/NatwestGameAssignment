package com.yash.assignment.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GamePlay extends RpsService {
	
	final Logger logger=LoggerFactory.getLogger(this.getClass());

	@Override
	public String results(String player, String computerPlay) throws InvalidOptionException 
	{
		String result=null;
		
		try {

				String playerPlay=player.toLowerCase();
				logger.debug("playerPlay = " + playerPlay.toString());

	            logger.debug("computerPlay = " + computerPlay.toString());

				if (computerPlay.equals("paper")) {
					if (playerPlay.equals("rock")) {
						result = "Computer scores";
					} else if (playerPlay.equals("paper")) {
						result = "tie";
					} else {
						result = "Player scores";
					}
				}

				else if (computerPlay.equals("scissor")) {
					if (playerPlay.equals("paper")) {
						result = "Computer scores";
					} else if (playerPlay.equals("scissor")) {
						result = "tie";
					} else {
						result = "Player scores";
					}
				}

				else if (computerPlay.equals("rock")) {
					if (playerPlay.equals("scissor")) {
						result = "Computer scores";
					} else if (playerPlay.equals("rock")) {
						result = "tie";
					} else {
						result = "Player scores";
					}
				}				

		} catch (IllegalArgumentException illegalArgumentException) {
			// TODO: handle exception
            logger.error(illegalArgumentException.getMessage());
			throw new InvalidOptionException("Invalid move! You can select Rock, Paper, Scissor or Exit");
		}
		catch (Exception e) {
			// TODO: handle exception
            logger.error(e.getMessage());
			e.printStackTrace();
		}
		return result;
	}
	
	public String getRandom() {
        logger.info("getRandom() method called");
		try {
			List<String> optionsList = new ArrayList<String>();

			optionsList.add("rock");
			optionsList.add("paper");
			optionsList.add("scissor");

			int randomise = new Random().nextInt(optionsList.size());

			return optionsList.get(randomise);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	
		
	

}