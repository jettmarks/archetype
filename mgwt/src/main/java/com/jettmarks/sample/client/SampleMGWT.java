package com.jettmarks.sample.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.MGWTSettings;
import com.googlecode.mgwt.ui.client.animation.AnimationHelper;
import com.googlecode.mgwt.ui.client.widget.animation.Animations;
import com.googlecode.mgwt.ui.client.widget.panel.flex.RootFlexPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class SampleMGWT implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		// set viewport and other settings for mobile
		MGWT.applySettings(MGWTSettings.getAppSetting());

		// build animation helper and attach it
		AnimationHelper animationHelper = new AnimationHelper();
		RootPanel.get().add(animationHelper);

		// build some UI
		RootFlexPanel rootFlexPanel = new RootFlexPanel();
		Button button = new Button("Hello mgwt");
		rootFlexPanel.add(button);

		// animate
		animationHelper.goTo(rootFlexPanel, Animations.SLIDE);
	}
}
