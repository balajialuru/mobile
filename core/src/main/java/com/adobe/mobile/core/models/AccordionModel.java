package com.adobe.mobile.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
 
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
 
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AccordionModel {
 
    @Inject
    private String title;
    
    @Inject
    private String mobileImage;
 
    @Inject
    @Named("list/.")
    private List<AccordionBulletPointModel> bulletPointList;
 
    public String getTitle() {
        return title;
    }
 
    public List<AccordionBulletPointModel> getBulletPointList() {
        return bulletPointList;
    }
 
    public String getMobileImage() {
		return mobileImage;
	}
}
