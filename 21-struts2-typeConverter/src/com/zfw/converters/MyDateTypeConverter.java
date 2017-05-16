package com.zfw.converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.conversion.TypeConversionException;
import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;



public class MyDateTypeConverter extends DefaultTypeConverter{

	@Override
	public Object convertValue(Object value, Class toType) {
		try {
			if (toType==Date.class) {
				//由页面到服务器是由String到Date类型的转换，现在，value是要转换的类型String,toType是要转换成的类型Date
				String dateStr = ((String[])value)[0];
				SimpleDateFormat adf=getSimpleDateFormat(dateStr);
				ActionContext.getContext().getSession().put("adf", adf);
				return adf.parse(dateStr);
			}else if(toType==String.class){
				//由服务器到页面是由Date到String类型的转换，现在，value是要转换的类型Date,toType是要转换成的类型String
				SimpleDateFormat adf=null;
				
				//adf=getSimpleDateFormat((Date)value).format((Date)value);
				
				adf=(SimpleDateFormat) ActionContext.getContext().get("adf");
				return adf.format((Date)value);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return MyDateTypeConverter.class;
	}

	private SimpleDateFormat getSimpleDateFormat(String dateStr) {
		SimpleDateFormat adf=null;
		//Pattern.matches是判断String字符串是否符合特定的正则表达式
		if (Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$", dateStr)) {
			adf=new SimpleDateFormat("yyyy/MM/dd");
		}else if(Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$", dateStr)){
			adf=new SimpleDateFormat("yyyy-MM-dd");
		}else if (Pattern.matches("^\\d{8}$", dateStr)) {
			adf=new SimpleDateFormat("yyyyMMdd");
		}else{
			throw new TypeConversionException();
		}
		
		return adf;
	}
	
	//此方法可以用上面的方法代替
	private SimpleDateFormat getSimpleDateFormat(Date value) {
		SimpleDateFormat adf=null;
		if (Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$", value.toString())) {
			adf=new SimpleDateFormat("yyyy/MM/dd");
		}else if(Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$", value.toString())){
			adf=new SimpleDateFormat("yyyy-MM-dd");
		}else if (Pattern.matches("^\\d{8}$", value.toString())) {
			adf=new SimpleDateFormat("yyyyMMdd");
		}else{
			throw new TypeConversionException();
		}
		
		return adf;
	}
	

}
