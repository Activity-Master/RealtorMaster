module com.guicedee.activitymaster.realtor {
	exports com.guicedee.activitymaster.realtor;
	exports com.guicedee.activitymaster.realtor.dto;
	exports com.guicedee.activitymaster.realtor.dto.tickets;
	exports com.guicedee.activitymaster.realtor.dto.enumerations;


	opens com.guicedee.activitymaster.realtor to com.google.guice;
	opens com.guicedee.activitymaster.realtor.dto to com.google.guice;
	opens com.guicedee.activitymaster.realtor.dto.enumerations to com.google.guice;

	requires com.guicedee.activitymaster.profiles;
}
