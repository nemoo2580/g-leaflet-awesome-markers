package org.peimari.gleaflet.client.resources;

import org.peimari.gleaflet.client.resources.LeafletResourceInjector;

import com.google.gwt.core.client.GWT;

public class LeafletAwesomeMarkersResourceIncjector {
  
  protected static LeafletAwesomeMarkersClientBundle bundle;

  public static void ensureInjected() {
    if (bundle == null) {
      LeafletResourceInjector.ensureInjected();
      bundle = GWT.create(LeafletAwesomeMarkersClientBundle.class);
      LeafletAwesomeMarkersResourceIncjector injector = GWT
          .create(LeafletAwesomeMarkersResourceIncjector.class);
      injector.injectResources();
    }
  }
  
  /**
   * Override this with deferred binding to customize injected stuff
   */
  protected void injectResources() {
    bundle.awesomeMarkersCss().ensureInjected();
    injectScript(bundle.awesomeMarkersScript().getText());
  }

  private static native void injectScript(String script)
  /*-{
      $wnd.eval(script);
  }-*/;
}