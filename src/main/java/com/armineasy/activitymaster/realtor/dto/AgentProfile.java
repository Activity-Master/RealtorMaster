package com.armineasy.activitymaster.realtor.dto;

import lombok.experimental.Accessors;

@Accessors(chain = true)
public class AgentProfile
{
	private long id;
	private String image;
	private String name;

	public AgentProfile()
	{
	}

	public long getId()
	{
		return this.id;
	}

	public String getImage()
	{
		return this.image;
	}

	public String getName()
	{
		return this.name;
	}

	public AgentProfile setId(long id)
	{
		this.id = id;
		return this;
	}

	public AgentProfile setImage(String image)
	{
		this.image = image;
		return this;
	}

	public AgentProfile setName(String name)
	{
		this.name = name;
		return this;
	}

	public boolean equals(final Object o)
	{
		if (o == this)
		{
			return true;
		}
		if (!(o instanceof AgentProfile))
		{
			return false;
		}
		final AgentProfile other = (AgentProfile) o;
		if (!other.canEqual((Object) this))
		{
			return false;
		}
		if (this.getId() != other.getId())
		{
			return false;
		}
		final Object this$image = this.getImage();
		final Object other$image = other.getImage();
		if (this$image == null ? other$image != null : !this$image.equals(other$image))
		{
			return false;
		}
		final Object this$name = this.getName();
		final Object other$name = other.getName();
		if (this$name == null ? other$name != null : !this$name.equals(other$name))
		{
			return false;
		}
		return true;
	}

	protected boolean canEqual(final Object other)
	{
		return other instanceof AgentProfile;
	}

	public int hashCode()
	{
		final int PRIME = 59;
		int result = 1;
		final long $id = this.getId();
		result = result * PRIME + (int) ($id >>> 32 ^ $id);
		final Object $image = this.getImage();
		result = result * PRIME + ($image == null ? 43 : $image.hashCode());
		final Object $name = this.getName();
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		return result;
	}

	public String toString()
	{
		return "AgentProfile(id=" + this.getId() + ", image=" + this.getImage() + ", name=" + this.getName() + ")";
	}
}
