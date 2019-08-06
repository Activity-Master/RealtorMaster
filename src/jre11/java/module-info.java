module com.armineasy.activitymaster.realtor {
	exports com.armineasy.activitymaster.realtor;
	exports com.armineasy.activitymaster.realtor.dto;
	exports com.armineasy.activitymaster.realtor.dto.tickets;
	exports com.armineasy.activitymaster.realtor.dto.enumerations;


	opens com.armineasy.activitymaster.realtor to com.google.guice;
	opens com.armineasy.activitymaster.realtor.dto to com.google.guice;
	opens com.armineasy.activitymaster.realtor.dto.enumerations to com.google.guice;

	requires com.armineasy.activitymaster.profiles;
}
