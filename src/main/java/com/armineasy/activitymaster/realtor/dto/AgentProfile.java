package com.armineasy.activitymaster.realtor.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AgentProfile
{
	private long id;
	private String image;
	private String name;
}
