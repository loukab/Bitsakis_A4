/*
 * Copyright 2015-2025 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.beans.Transient;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TicTacToeTests {

	@Test
	void GameStartBuildNineBoard() {
		TicTacToeGame game = new TicTacToeGame();
		assertEquals(9, game.availableFields());
	}

	@Test
	void AvailableFieldsDecreaseAfterMove() {
		TicTacToeGame game = new TicTacToeGame();
		game.makeMove(0); // Example move in field 0
		assertEquals(8, game.availableFields());
	}

	@Test
	void CannotMakeMoveOnTakenField(){
		TicTacToeGame game = new TicTacToeGame();
		game.makeMove(0);
		assertThrows(IllegalArgumentException.class, () -> game.makeMove(0));

	}


	
	@Test
	void CannotMoveOutsideBoard(){
		TicTacToeGame game = new TicTacToeGame();
		assertThrows(IllegalArgumentException.class, () -> game.makeMove(-1));
		assertThrows(IllegalArgumentException.class, () -> game.makeMove(9));
		assertThrows(IllegalArgumentException.class, () -> game.makeMove(100));
	}

	@Test
	void CannotMakeMoveOnFull(){
		TicTacToeGame game = new TicTacToeGame();

		for (int i = 0; i <9; i++){
			game.makeMove(i);
		}

		assertThrows(IllegalStateException.class, () -> game.makeMove(0));
	}

	@Test
	void PlayersAltTurns(){
		TicTacToeGame game = new TicTacToeGame();

		assertEquals('X', game.currentPlayer());
		game.makeMove(0);
		assertEquals('O', game.currentPlayer());
		game.makeMove(1);
		assertEquals('X', game.currentPlayer());
	}
	


}
