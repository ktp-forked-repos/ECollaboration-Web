package com.general.Enum;

public enum WeekEnum {
	MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),FRIDAY("星期五"),SATARDAY("星期六"),SUNDAY("星期日");
	private String chineseName;
	private WeekEnum(String chineseName){
		this.chineseName=chineseName;
	}
	public String getChineseName() {
		return chineseName;
	}	
}
