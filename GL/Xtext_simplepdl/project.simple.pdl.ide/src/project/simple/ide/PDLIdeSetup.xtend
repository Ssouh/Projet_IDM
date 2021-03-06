/*
 * generated by Xtext 2.17.1
 */
package project.simple.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import project.simple.PDLRuntimeModule
import project.simple.PDLStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class PDLIdeSetup extends PDLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new PDLRuntimeModule, new PDLIdeModule))
	}
	
}
