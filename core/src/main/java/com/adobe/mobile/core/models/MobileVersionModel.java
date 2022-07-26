package com.adobe.mobile.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
 
import javax.inject.Inject;
 
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class MobileVersionModel {

@Inject
private String mobileVersion;

public String getMobileVersion() {
	return mobileVersion;
}	
	
}
