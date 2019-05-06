package com.armineasy.activitymaster.realtor.dto.enumerations;

public enum ERealtorPriority
{
	Urgent("bg-danger"),
	Immediate("bg-danger"),
	High("bg-warning"),
	Low("bg-secondary"),
	Medium("bg-secondary"),
	None("bg-secondary");

	private final String displayClass;


	ERealtorPriority(String displayClass)
	{
		this.displayClass = displayClass;
	}

	public String getDisplayClass()
	{
		return displayClass;
	}
}
