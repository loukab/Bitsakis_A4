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


public class TicTacToeGame{
	private int availableFields = 9;
	private boolean[] board = new boolean[9];

	public int availableFields(){
		return availableFields;
	}

	public void makeMove(int fieldNumber) {
		
		if (availableFields == 0){
			throw new IllegalStateException("No moves left, board full");
		}
		
		if (fieldNumber < 0 || fieldNumber >= 9) {
			throw new IllegalArgumentException("Invalid Field Number");
		}
		
		if (board[fieldNumber]) {
            throw new IllegalArgumentException("Field already taken");
        }
	
		board[fieldNumber] = true;
		availableFields--;
	}
}	