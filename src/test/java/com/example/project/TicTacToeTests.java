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

import java.beans.Transient;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TicTacToeTests {

	@Test
	void GameStartBuildNineBoard() {
		TicTacToeGame game = new TicTacToeGame();
		assertEquals(9, game.availableFieldsNumber());
	}

	@Test
	void AvailableFieldsDecreaseAfterMove() {
		TicTacToeGame game = new TicTacToeGame();
		game.makeMove(0); // Example move in field 0
		assertEquals(8, game.availableFieldsNumber());
	}

}
