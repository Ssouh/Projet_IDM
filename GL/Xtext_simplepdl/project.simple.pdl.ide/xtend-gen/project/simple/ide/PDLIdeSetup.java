/**
 * generated by Xtext 2.17.1
 */
package project.simple.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import project.simple.PDLRuntimeModule;
import project.simple.PDLStandaloneSetup;
import project.simple.ide.PDLIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class PDLIdeSetup extends PDLStandaloneSetup {
  @Override
  public Injector createInjector() {
    PDLRuntimeModule _pDLRuntimeModule = new PDLRuntimeModule();
    PDLIdeModule _pDLIdeModule = new PDLIdeModule();
    return Guice.createInjector(Modules2.mixin(_pDLRuntimeModule, _pDLIdeModule));
  }
}
