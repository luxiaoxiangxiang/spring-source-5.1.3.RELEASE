package com.xiaoxiang.demo.bean;

import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DatePropertyEditor extends PropertyEditorSupport {

	private String format = "yyyy-MM-dd";

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public void setAsText(String str){
		System.out.println(str);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		try{
			Date date  = simpleDateFormat.parse(str);
			this.setValue(date);
		}catch (Exception e){
			System.out.println(e);
		}
	}

}
