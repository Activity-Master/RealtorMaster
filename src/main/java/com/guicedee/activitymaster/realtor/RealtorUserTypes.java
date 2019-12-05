package com.guicedee.activitymaster.realtor;

import com.guicedee.activitymaster.profiles.services.interfaces.IUserRole;

public enum RealtorUserTypes
		implements IUserRole<RealtorUserTypes>
{
	Agent,
	Realtor,
	Buyer,
	Seller,
	Lessee,
	Lessor

}
