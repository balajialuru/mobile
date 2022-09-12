/**
 * 
 */
package com.adobe.mobile.core.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = SlingHttpServletRequest.class,
		adapters = MobileDetails.class,

		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
		)

public class MobileDetailsImpl implements MobileDetails {

	private static final Logger LOG = LoggerFactory.getLogger(MobileDetailsImpl.class);
	
	@Inject
    Resource resource;
	
	@SlingObject
    ResourceResolver resourceResolver;
	
	 @Inject
	 @Via("resource")
	 @Default(values = "MOBILE DETAILS")
	  private String mobileTitle;
	

	@Override
	public String getMobileTitle() {
		return mobileTitle;
	}

	@Override
	public List<Map<String, String>> getMobileDetailswithmap() {
		 List<Map<String, String>> mobileDetailsMap=new ArrayList<>();
	        try {
	            Resource mobileDetail=resource.getChild("mobiledetailswithmap");
	            if(mobileDetail!=null){
	                for (Resource mobile : mobileDetail.getChildren()) {
	                    Map<String,String> mobileMap=new HashMap<>();
	                    mobileMap.put("mobileName",mobile.getValueMap().get("mobileName",String.class));
	                    mobileMap.put("mobileDescription",mobile.getValueMap().get("mobileDescription",String.class));
	                    mobileMap.put("publishYear",mobile.getValueMap().get("publishYear",String.class));
	                    mobileMap.put("mobileImage",mobile.getValueMap().get("mobileImage",String.class));
	                    mobileMap.put("mobileAltText",mobile.getValueMap().get("mobileAltText",String.class));
	                    mobileDetailsMap.add(mobileMap);
	                }
	            }
	        }catch (Exception e){
	            LOG.info("\n ERROR while getting Book Details {} ",e.getMessage());
	        }
	        return mobileDetailsMap;
	    }

}
