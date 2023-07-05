package com.example.myapp.board.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardUploadFile {
	private int fileId;
	private int boardId;
	private String fileName;
	private long fileSize;
	private String fileContentType;
	private byte[] fileData;

	@Override
	public String toString() {
		return "boardFile [fileId=" + fileId + ", boardId=" + boardId + ", fileName=" + fileName + ", fileSize="
				+ fileSize + ", fileContentType=" + fileContentType + "]";
	}
}
