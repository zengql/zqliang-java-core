package com.zqliang.util;

/**
 * �ַ�����ع�����
 * @author zqliang
 *
 */
public class StringUtil {
	/**
	 * һ���յ��ַ���
	 */
	static public final String EMPTY = "";

	/**
	 * �ж��Ƿ�Ϊ��
	 * "" true
	 * null false
	 * " " true
	 * @since 1.0-SNAPSHOT
	 * @param str �ַ���
	 * @return
	 */
	static public boolean isEmpty(String str) {
		if (str == null || str.trim().length()>1) {
			return false;
		}
		return true;
	}
	
	/**
	 * �ж��Ƿ�Ϊ��<br>
	 * "" false<br>
	 * " " false<br>
	 * null true<br>
	 * "123" true<br>
	 * @since 1.0-SNAPSHOT
	 * @param str �ַ���
	 * @return
	 */
	static public boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}
	
	/**
	 * �ж��Ƿ��ǿհ׵�
	 * null true,
	 * "" true,
	 * " " true
	 * "null" true
	 * "123" false
	 * @since 1.0-SNAPSHOT
	 * @param str �ַ���
	 * @return
	 */
	static public boolean isBlank(String str) {
		if (null == str || "".equals(str.trim()) || "null".equalsIgnoreCase(str.trim()))
			return true;
		return false;
	}
	
	/**
	 * �ж��Ƿ��ǿհ׵�
	 * null false,
	 * "" false,
	 * " " false
	 * "null" false
	 * "123" true
	 * @since 1.0-SNAPSHOT
	 * @param str �ַ���
	 * @return
	 */
	static public boolean isNotBlank(String str) {
		return isBlank(str);
	}
	
	/**
	 *  ���obj��null�����ؿգ����򷵻ظ�obj��toString��������ȥ��ǰ��ո�
	 *  @since 1.0-SNAPSHOT
	 * 	@param str �ַ���
	 * 	@return
	 */
	static public String null2String(Object obj) {
		if (null == obj)
			return EMPTY;
		return obj.toString().trim();
	}
}
