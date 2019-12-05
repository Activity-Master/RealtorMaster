package com.guicedee.activitymaster.realtor.dto.enumerations;

public enum ERealtorStage
{
	Lead("bg-secondary"),
	Booking("bg-secondary"),
	ConfirmationBooking("bg-success"),
	PreViewing("bg-success"),
	Viewing("bg-success"),
	CallBack("bg-warning"),
	//TODO Name These Properly
	Quote("bg-secondary"),
	PreAgreement("bg-secondary"),
	PromiseTo("bg-success"),
	Payments("bg-success"),
	DeedsOffice("bg-success"),
	FinalDetails("bg-success"),
	Closure("bg-primary"),
	;

	private final String backgroundColour;

	ERealtorStage(String backgroundColour)
	{
		this.backgroundColour = backgroundColour;
	}

	public String getBackgroundColour()
	{
		return backgroundColour;
	}
}
