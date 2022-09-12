package com.adobe.mobile.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
 
import javax.inject.Inject;
 
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AccordionBulletPointModel {
 
    @Inject
    private String description;
    
    @Inject
    private String mobileDescription;
    
    @Inject
    private String mobileImage;
 
    public String getDescription() {
        return description;
    }
 
    public String getMobileDescription() {
		return mobileDescription;
	}

	public String getMobileImage() {
		return mobileImage;
	}
}