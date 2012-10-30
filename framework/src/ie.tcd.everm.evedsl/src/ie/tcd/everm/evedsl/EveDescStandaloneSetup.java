
package ie.tcd.everm.evedsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EveDescStandaloneSetup extends EveDescStandaloneSetupGenerated{

	public static void doSetup() {
		new EveDescStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

