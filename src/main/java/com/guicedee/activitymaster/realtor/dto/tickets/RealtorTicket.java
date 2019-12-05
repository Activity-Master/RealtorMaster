package com.guicedee.activitymaster.realtor.dto.tickets;

import com.guicedee.activitymaster.realtor.dto.AgentProfile;
import com.guicedee.activitymaster.realtor.dto.enumerations.ERealtorPriority;
import com.guicedee.activitymaster.realtor.dto.enumerations.ERealtorStage;

import java.time.LocalDateTime;


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

	public RealtorTicket()
	{
	}

	public long getId()
	{
		return this.id;
	}

	public AgentProfile getRequestedBy()
	{
		return this.requestedBy;
	}

	public String getSubject()
	{
		return this.subject;
	}

	public AgentProfile getAssignee()
	{
		return this.assignee;
	}

	public ERealtorPriority getPriority()
	{
		return this.priority;
	}

	public ERealtorStage getStage()
	{
		return this.stage;
	}

	public LocalDateTime getCreatedDate()
	{
		return this.createdDate;
	}

	public LocalDateTime getDueDate()
	{
		return this.dueDate;
	}

	public RealtorTicket setId(long id)
	{
		this.id = id;
		return this;
	}

	public RealtorTicket setRequestedBy(AgentProfile requestedBy)
	{
		this.requestedBy = requestedBy;
		return this;
	}

	public RealtorTicket setSubject(String subject)
	{
		this.subject = subject;
		return this;
	}

	public RealtorTicket setAssignee(AgentProfile assignee)
	{
		this.assignee = assignee;
		return this;
	}

	public RealtorTicket setPriority(ERealtorPriority priority)
	{
		this.priority = priority;
		return this;
	}

	public RealtorTicket setStage(ERealtorStage stage)
	{
		this.stage = stage;
		return this;
	}

	public RealtorTicket setCreatedDate(LocalDateTime createdDate)
	{
		this.createdDate = createdDate;
		return this;
	}

	public RealtorTicket setDueDate(LocalDateTime dueDate)
	{
		this.dueDate = dueDate;
		return this;
	}

	public boolean equals(final Object o)
	{
		if (o == this)
		{
			return true;
		}
		if (!(o instanceof RealtorTicket))
		{
			return false;
		}
		final RealtorTicket other = (RealtorTicket) o;
		if (!other.canEqual((Object) this))
		{
			return false;
		}
		if (this.getId() != other.getId())
		{
			return false;
		}
		final Object this$requestedBy = this.getRequestedBy();
		final Object other$requestedBy = other.getRequestedBy();
		if (this$requestedBy == null ? other$requestedBy != null : !this$requestedBy.equals(other$requestedBy))
		{
			return false;
		}
		final Object this$subject = this.getSubject();
		final Object other$subject = other.getSubject();
		if (this$subject == null ? other$subject != null : !this$subject.equals(other$subject))
		{
			return false;
		}
		final Object this$assignee = this.getAssignee();
		final Object other$assignee = other.getAssignee();
		if (this$assignee == null ? other$assignee != null : !this$assignee.equals(other$assignee))
		{
			return false;
		}
		final Object this$priority = this.getPriority();
		final Object other$priority = other.getPriority();
		if (this$priority == null ? other$priority != null : !this$priority.equals(other$priority))
		{
			return false;
		}
		final Object this$stage = this.getStage();
		final Object other$stage = other.getStage();
		if (this$stage == null ? other$stage != null : !this$stage.equals(other$stage))
		{
			return false;
		}
		final Object this$createdDate = this.getCreatedDate();
		final Object other$createdDate = other.getCreatedDate();
		if (this$createdDate == null ? other$createdDate != null : !this$createdDate.equals(other$createdDate))
		{
			return false;
		}
		final Object this$dueDate = this.getDueDate();
		final Object other$dueDate = other.getDueDate();
		if (this$dueDate == null ? other$dueDate != null : !this$dueDate.equals(other$dueDate))
		{
			return false;
		}
		return true;
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof RealtorTicket;
	}

	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final long $id = this.getId();
		result = result * PRIME + (int) ($id >>> 32 ^ $id);
		final Object $requestedBy = this.getRequestedBy();
		result = result * PRIME + ($requestedBy == null ? 43 : $requestedBy.hashCode());
		final Object $subject = this.getSubject();
		result = result * PRIME + ($subject == null ? 43 : $subject.hashCode());
		final Object $assignee = this.getAssignee();
		result = result * PRIME + ($assignee == null ? 43 : $assignee.hashCode());
		final Object $priority = this.getPriority();
		result = result * PRIME + ($priority == null ? 43 : $priority.hashCode());
		final Object $stage = this.getStage();
		result = result * PRIME + ($stage == null ? 43 : $stage.hashCode());
		final Object $createdDate = this.getCreatedDate();
		result = result * PRIME + ($createdDate == null ? 43 : $createdDate.hashCode());
		final Object $dueDate = this.getDueDate();
		result = result * PRIME + ($dueDate == null ? 43 : $dueDate.hashCode());
		return result;
	}

	public String toString()
	{
		return "RealtorTicket(id=" + this.getId() + ", requestedBy=" + this.getRequestedBy() + ", subject=" + this.getSubject() + ", assignee=" + this.getAssignee() +
		       ", priority=" + this.getPriority() + ", stage=" + this.getStage() + ", createdDate=" + this.getCreatedDate() + ", dueDate=" + this.getDueDate() + ")";
	}
}
