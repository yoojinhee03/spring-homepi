package com.example.homepi.vo;

import java.util.List;

import lombok.Data;

@Data
public class BoardVo {

	private String postno;
	//private String title;
	private String contents;
	//private String attchFile;
	private String writeDate;
	private String id;
	//private String views;
	public String getPostno() {
		return postno;
	}
	public void setPostno(String postno) {
		this.postno = postno;
	}
	
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
