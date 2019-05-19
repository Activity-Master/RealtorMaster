package com.armineasy.activitymaster.realtor;

import com.armineasy.activitymaster.profiles.services.interfaces.IUserRole;

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
