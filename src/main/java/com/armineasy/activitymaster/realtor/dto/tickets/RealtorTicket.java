package com.armineasy.activitymaster.realtor.dto.tickets;

import com.armineasy.activitymaster.realtor.dto.AgentProfile;
import com.armineasy.activitymaster.realtor.dto.enumerations.ERealtorPriority;
import com.armineasy.activitymaster.realtor.dto.enumerations.ERealtorStage;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
public class RealtorTicket
{
	private long id;
	private AgentProfile requestedBy;
	private String subject;
	private AgentProfile assignee;
	private ERealtorPriority priority;
	private ERealtorStage stage;
	private LocalDateTime createdDate;
	private LocalDateTime dueDate;
}
