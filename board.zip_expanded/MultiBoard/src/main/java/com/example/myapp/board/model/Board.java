package com.example.myapp.board.model;

import java.sql.Timestamp;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
	private int boardId;
	private int categoryId;
	private String writer;
	private String email;
	private String password;
	private String title;
	private String content;
	private Timestamp writeDate;
	private int masterId;
	private int readCount;
	private int replyNumber;
	private int replyStep;

	private int page;

	private MultipartFile file;

	private int fileId;
	private String fileName;
	private long fileSize;
	private String fileContentType;

	@Override
	public String toString() {
		return "Board[boardId=" + boardId + ", categoryId=" + categoryId + ", writer=" + writer + ", email=" + email
				+ ", password" + password + ", title=" + title + ", content=" + content + ", writeDate=" + writeDate
				+ ", masterId=" + masterId + ", readCount=" + readCount + ", replyNumber=" + replyNumber
				+ ", replyStep=" + replyStep + ", fileId=" + fileId + ", boardId=" + boardId + ", fileName=" + fileName
				+ ", fileSize=" + +fileSize + ", fileContentType=" + fileContentType + "]";
	}
}
