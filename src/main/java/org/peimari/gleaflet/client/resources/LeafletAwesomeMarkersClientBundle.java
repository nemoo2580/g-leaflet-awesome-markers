package org.peimari.gleaflet.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.DataResource.DoNotEmbed;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.TextResource;

public interface LeafletAwesomeMarkersClientBundle extends ClientBundle {

    @Source("awesome-markers-2.0.2.min.js")
    @DoNotEmbed
    TextResource awesomeMarkersScript();
    
    @Source("images/markers-soft-2.0.2.png")
    ImageResource markers_soft();
    
    @Source("images/markers-shadow-2.0.2.png")
    ImageResource markers_shadow();
    
    @Source("images/markers-soft@2x-2.0.2.png")
    ImageResource markers_soft_2x();
    
    @Source("images/markers-shadow@2x-2.0.2.png")
    ImageResource markers_shadow_2x();
    
    @Source("awesome-markers-2.0.2.css")
    @CssResource.NotStrict
    CssResource awesomeMarkersCss();
}