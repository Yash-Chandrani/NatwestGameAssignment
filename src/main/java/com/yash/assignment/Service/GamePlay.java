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
		
		try {

				Options playerPlay = Options.valueOf(player.toLowerCase());
				logger.debug("playerPlay = " + playerPlay.toString());

	            logger.debug("computerPlay = " + computerPlay.toString());

				if (computerPlay.equals(Options.paper)) {
					if (playerPlay.equals(Options.rock)) {
						result = "Computer scores";
					} else if (playerPlay.equals(Options.paper)) {
						result = "tie";
					} else {
						result = "Player scores";
					}
				}

				else if (computerPlay.equals(Options.scissor)) {
					if (playerPlay.equals(Options.paper)) {
						result = "Computer scores";
					} else if (playerPlay.equals(Options.scissor)) {
						result = "tie";
					} else {
						result = "Player scores";
					}
				}

				else if (computerPlay.equals(Options.rock)) {
					if (playerPlay.equals(Options.scissor)) {
						result = "Computer scores";
					} else if (playerPlay.equals(Options.rock)) {
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
	
	public Options getRandom() {
        logger.info("getRandom() method called");
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
