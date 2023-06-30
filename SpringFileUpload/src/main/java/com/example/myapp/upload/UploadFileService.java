package com.example.myapp.upload;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UploadFileService implements IUploadFileService {

	@Autowired
	IUploadFileRepository uploadFileRepository;
	
	@Override
	public void uploadFile(UploadFileVO file) {
		int newFileId = uploadFileRepository.getMaxFileId() + 1;
		file.setFileId(newFileId);
		uploadFileRepository.uploadFile(file);
	}

	@Override
	public List<UploadFileVO> getFileList(String directoryName) {
		return uploadFileRepository.getFileList(directoryName);
	}


	@Override
	public List<UploadFileVO> getImageList(String directoryName) {
		return uploadFileRepository.getImageList(directoryName);
	}
	
	@Override
	public List<UploadFileVO> getAllFileList() {
		return uploadFileRepository.getAllFileList();
	}

	@Override
	public UploadFileVO getFile(int fileId) {
		return uploadFileRepository.getFile(fileId);
	}

	@Override
	public void deleteFile(int fileId) {
		uploadFileRepository.deleteFile(fileId);
	}
	
	@Override
	public String getDirectoryName(int fileId) {
		return uploadFileRepository.getDirectoryName(fileId);
	}

	@Override
	public void updateDirectory(int[] fileIds, String directoryName) {
		for(int fileId : fileIds) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("fileId", fileId);
			map.put("directoryName", directoryName);
			uploadFileRepository.updateDirectory(map);
		}
		
	}

}
