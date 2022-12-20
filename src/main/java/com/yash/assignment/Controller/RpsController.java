package com.yash.assignment.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.yash.assignment.Service.GamePlay;
import com.yash.assignment.Service.InvalidOptionException;


@RestController
@RequestMapping("/rps")
public class RpsController {
	
	final Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private GamePlay rpsService;
	
	@GetMapping("/play")
	public ResponseEntity<Object> getResponse(@RequestParam(value="playerOption") String playerMove) throws InvalidOptionException{
		logger.debug("Player input string: "+playerMove);
		//store randomly generated computer move
		String computerPlay=rpsService.getRandom();
		//store final result of winning
		String finalResult=rpsService.results(playerMove, computerPlay);
		logger.debug("Final result: "+finalResult);
		return new ResponseEntity<>(finalResult,HttpStatus.OK);
	}
}