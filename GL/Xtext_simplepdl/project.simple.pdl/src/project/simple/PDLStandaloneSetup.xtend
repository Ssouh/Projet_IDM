/*
 * generated by Xtext 2.17.1
 */
package project.simple


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class PDLStandaloneSetup extends PDLStandaloneSetupGenerated {

	def static void doSetup() {
		new PDLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
