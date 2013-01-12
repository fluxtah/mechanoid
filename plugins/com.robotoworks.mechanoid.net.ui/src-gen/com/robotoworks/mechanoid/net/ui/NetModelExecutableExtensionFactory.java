/*
 * generated by Xtext
 */
package com.robotoworks.mechanoid.net.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import com.robotoworks.mechanoid.net.ui.internal.NetModelActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class NetModelExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return NetModelActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return NetModelActivator.getInstance().getInjector(NetModelActivator.COM_ROBOTOWORKS_MECHANOID_NET_NETMODEL);
	}
	
}