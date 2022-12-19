package com.yash.assignment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yash.assignment.Service.GamePlay;
import com.yash.assignment.Service.GamePlay.Options;
import com.yash.assignment.Service.InvalidOptionException;


@RestController
@RequestMapping("/rps")
public class RpsController {
	@Autowired
	private GamePlay rpsService;
	
	@GetMapping("/play")
	public ResponseEntity<Object> getResponse(@RequestParam(value="playerOption") String playerMove) throws InvalidOptionException{
		Options computerPlay=rpsService.getRandom();
		String finalResult=rpsService.results(playerMove, computerPlay);
		return new ResponseEntity<>(finalResult,HttpStatus.OK);
	}
}
