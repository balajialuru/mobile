/**
 * 
 */
package com.adobe.mobile.core.models;

/**
 * @author balaji
 *
 */
	import javax.annotation.PostConstruct;
	import javax.inject.Inject;
	import org.apache.sling.api.resource.Resource;
	//import org.apache.sling.models.annotations.Default;
	import org.apache.sling.models.annotations.Model;
	//import org.apache.sling.settings.SlingSettingsService;

	@Model(adaptables=Resource.class)
	public class MobileBanner {

	    @Inject
	    private String mobileTitle;

	    @Inject
	    private String mobileDescription;

	    @Inject
	    private String mobileImage;
	    
	    @Inject
	    private String mobileAltText;

	    @PostConstruct
	    protected void init() {
	        
	    }

		public String getMobileTitle() {
			return mobileTitle;
		}

		public String getMobileDescription() {
			return mobileDescription;
		}

		public String getMobileImage() {
			return mobileImage;
		}

		public String getMobileAltText() {
			return mobileAltText;
		}
	    
	}

