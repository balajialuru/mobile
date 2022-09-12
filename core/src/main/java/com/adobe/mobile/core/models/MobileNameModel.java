/**
 * 
 */
package com.adobe.mobile.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
 
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class MobileNameModel {

	@Inject
    private String mobileName;
 
    @Inject
    @Named("./mobileVersions")
    private List<MobileVersionModel> mobileVersions;

	public String getMobileName() {
		return mobileName;
	}

	public List<MobileVersionModel> getMobileVersions() {
		return mobileVersions;
	}
}
