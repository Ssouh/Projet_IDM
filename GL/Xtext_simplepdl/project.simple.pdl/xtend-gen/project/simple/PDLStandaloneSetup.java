/**
 * generated by Xtext 2.17.1
 */
package project.simple;

import project.simple.PDLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class PDLStandaloneSetup extends PDLStandaloneSetupGenerated {
  public static void doSetup() {
    new PDLStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}