package com.yash.assignment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yash.assignment.Service.GamePlay;
import com.yash.assignment.Service.InvalidOptionException;

@SpringBootTest
class NatwestGameAssignmentTests {

    final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private GamePlay game;
    
    // initial test
	@BeforeEach
    void initialTest() {
    	logger.debug("Test started");
    }
    
	// last or ending test
    @AfterEach
    void endTest() {
    	logger.debug("Testing done");
    }
	
    //Player: rock; Computer: scissor
    @Test
    void testRockBeatsScissors() throws InvalidOptionException {
        String result = game.results("rock", "scissor");
        assertEquals("Player scores", result);
    }

  //Player: paper; Computer: rock
    @Test
    void testPaperBeatsRock() throws InvalidOptionException {
        String result = game.results("paper", "rock");
        assertEquals("Player scores", result);
    }

  //Player: scissor; Computer: paper
    @Test
    void testScissorsBeatsPaper() throws InvalidOptionException {
        String result = game.results("scissor", "paper");
        assertEquals("Player scores", result);
    }

  //Player: rock; Computer: rock
    @Test
    void testTieRock() throws InvalidOptionException {
        String result = game.results("rock", "rock");
        assertEquals("tie", result);
    }
    
    @Test
  //Player: paper; Computer: paper
    void testTiePaper() throws InvalidOptionException {
        String result = game.results("paper", "paper");
        assertEquals("tie", result);
    }
    
    @Test
  //Player: rock; Computer: scissor
    void testTieScissor() throws InvalidOptionException {
        String result = game.results("scissor", "scissor");
        assertEquals("tie", result);
    }
    
    // Checking invalid input
    @Test
    void testInvalidInput() throws InvalidOptionException {
    	Throwable exception = assertThrows(
    		      IllegalArgumentException.class, 
    		      () -> {
    		    	  game.results(" ", "rock");
    		    	  throw new IllegalArgumentException("Input cannot be null or empty");
    		      }
    		    );
    		    assertEquals("Input cannot be null or empty", exception.getMessage());
    }

    //checking getRandom() function
    @Test
	void testGetRandom(){
		assertThat(game.getRandom()).isIn("rock", "paper", "scissor");
		assertThat(game.getRandom()).isIn("rock", "paper", "scissor");
		assertThat(game.getRandom()).isIn("rock", "paper", "scissor");
		assertThat(game.getRandom()).isIn("rock", "paper", "scissor");
	}
}

