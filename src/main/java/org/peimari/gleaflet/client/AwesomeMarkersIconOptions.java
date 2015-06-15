package org.peimari.gleaflet.client;

import org.peimari.gleaflet.client.resources.LeafletAwesomeMarkersResourceIncjector;

import com.google.gwt.core.client.JavaScriptObject;

public class AwesomeMarkersIconOptions extends JavaScriptObject {
  
  static {
    LeafletAwesomeMarkersResourceIncjector.ensureInjected();
  }
  
  protected AwesomeMarkersIconOptions() {}

  public static final native AwesomeMarkersIconOptions create() 
  /*-{
    return {};
  }-*/;

  public native final void setIcon(String iconName) 
  /*-{
    this.icon = iconName;
  }-*/;

  public native final void setPrefix(String iconPrefix) 
  /*-{
    this.prefix = iconPrefix;
  }-*/;

  public native final void setMarkerColor(String color) 
  /*-{
    this.markerColor = color;
  }-*/;
  
  public native final void setIconColor(String color) 
  /*-{
    this.iconColor = color;
  }-*/;
  
  public native final void setSpin(boolean isSpin) 
  /*-{
    this.spin = isSpin;
  }-*/;
  
  public native final void setExtraClasses(String classes) 
  /*-{
    this.extraClasses = classes;
  }-*/;
}