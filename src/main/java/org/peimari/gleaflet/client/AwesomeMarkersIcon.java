package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

public class AwesomeMarkersIcon extends JavaScriptObject implements AnyIcon {
  
  protected AwesomeMarkersIcon() {}
  
  public static final native AwesomeMarkersIcon create(AwesomeMarkersIconOptions options) 
  /*-{
    return new $wnd.L.AwesomeMarkers.icon(options);
  }-*/;
}