/*
* generated by Xtext
*/
package de.tudresden.slr.model;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TaxonomyStandaloneSetup extends TaxonomyStandaloneSetupGenerated{

	public static void doSetup() {
		new TaxonomyStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
