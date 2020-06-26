package com.xiaoxiang.demo.bean;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditor;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

@Configurable
public class Configuration {

	@Bean
	public CustomEditorConfigurer customEditorConfigurer(){
		CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
		Map<Class<?>, Class<? extends PropertyEditor>> customEditor = new HashMap<Class<?>, Class<? extends PropertyEditor>>();
		customEditor.put(Date.class,DatePropertyEditor.class);
		customEditorConfigurer.setCustomEditors(customEditor);
		return customEditorConfigurer;
	}


}
