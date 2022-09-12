/**
 * 
 */
package com.adobe.mobile.core.models;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

/**
 * @author 91970
 *
 */
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MobileNestedMulti {

@Inject
private String mobileTitle;

@Inject
@Named("./mobileList")
public List<MobileNameModel> mobileList;

public String getMobileTitle() {
	return mobileTitle;
}

public List<MobileNameModel> getMobileList() {
	return mobileList;
}
public boolean isConfigured() {
    return mobileList != null && !mobileList.isEmpty();
}

}


