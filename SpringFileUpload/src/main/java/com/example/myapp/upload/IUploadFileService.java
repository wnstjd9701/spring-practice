package com.example.myapp.upload;

import java.util.HashMap;
import java.util.List;

public interface IUploadFileService {

	void uploadFile(UploadFileVO file);
	
	List<UploadFileVO> getFileList(String directoryName);
	List<UploadFileVO> getAllFileList();
	List<UploadFileVO> getImageList(String directoryName);
	
	UploadFileVO getFile(int fileId);
	String getDirectoryName(int fileId);
	void updateDirectory(int[] fileIds, String directoryName);
	
	void deleteFile(int fileId);
}
