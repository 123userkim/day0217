package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.DBManager;
import com.example.demo.vo.BookVO;

@Repository
public class BookDAO {
	public List<BookVO> findAll(){
		return DBManager.findAll();
	}

	public BookVO findByBookid(int bookid) {
		// TODO Auto-generated method stub
		return DBManager.findByBookid(bookid);
	}
	
	public int updateBook(BookVO b) {
		return DBManager.updateBook(b);
	}
	
	public int deleteBook(int bookid) {
		return DBManager.deleteBook(bookid);
	}
}
