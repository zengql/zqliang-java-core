package com.zqliang.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ������ع���
 * @author zqliang
 * @date 2017/05/14
 */
public class DateUtil {
	
	/**
	 * ��ʽ��ʱ��
	 * @param date
	 * @param formatStr
	 * @return
	 */
	static public final String format2String(Date date, String formatStr) {
		if (null == date || StringUtil.isBlank(formatStr))
			return StringUtil.EMPTY;
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(formatStr);
			return dateFormat.format(date);
		} catch(Exception e) {
			
		}
		return StringUtil.EMPTY;
	}
	

	/**
	 * ��ʽ����ʱ��
	 * @param date ����
	 * @param dateFormatType ���������е�һ���ڲ�ö�� 
	 * @param dateSplit ���ڷָ��
	 * @param timeSplit ʱ��ָ��
	 * @return
	 */
	static public final String format2String(Date date, DateFormatType dateFormatType, String dateSplit, 
			String timeSplit) {
		if (null == date || null == dateFormatType)
			return StringUtil.EMPTY;
		try {
			String formatStr = dateFormatType.toString(dateSplit, timeSplit);
			SimpleDateFormat dateFormat = new SimpleDateFormat(formatStr);
			return dateFormat.format(date);
		} catch(Exception e) {
			
		}
		return StringUtil.EMPTY;
	}
	
	/**
	 * �Զ���ʱ������<br>
	 *  �ָ������������<br>
	 *
	 * DATE 2017-05-14<br>
	 * DATETIME 2017-05-14 14:40:12 <br>
	 * TIME 14:40:12
	 * @author zqliang
	 *
	 */
	public enum DateFormatType{
		DATE("yyyy@MM@dd"), DATETIME("yyyy@MM@dd HH#mm#ss"), TIME("HH#mm#ss");
		
		private String value;
		
		private DateFormatType(String str){
			this.value = str;
		}
		
		/**
		 * 
		 * dateSplit ���ڷָ����� Ĭ��-��
		 * timeSplit ʱ��ָ�� Ĭ�ϣ���
		 */
		public String toString(String dateSplit, String timeSplit) {
			if (StringUtil.isBlank(dateSplit))
				dateSplit = "-";
			if (StringUtil.isBlank(timeSplit))
				timeSplit = ":";
			value = this.value.replaceAll("@", dateSplit);
			value = this.value.replaceAll("#", timeSplit);
			return value;
		}
		
		@Override
		public String toString() {
			return toString(null, null);
		}
	}

}
