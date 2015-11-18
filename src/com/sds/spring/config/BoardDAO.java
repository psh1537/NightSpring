package com.sds.spring.config;

import java.util.List;

import com.sds.board.model.Board;

public interface BoardDAO {
	public int insert(Board board);
	public List selectAll();
	public Board select(int board_id);
	public int update(Board board);
	public int delete(int board_id);
}
