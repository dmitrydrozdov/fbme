package org.fbme.lib.iec61499.parser;

/*Generated by MPS */

import org.fbme.lib.iec61499.declarations.ServiceInterfaceFBTypeDeclaration;
import org.jetbrains.annotations.Nullable;
import org.fbme.lib.common.Identifier;

public class ServiceInterfaceFBTypeConverter extends DeclarationConverterBase<ServiceInterfaceFBTypeDeclaration> {

  public ServiceInterfaceFBTypeConverter(ConverterArguments arguments) {
    super(arguments);
  }

  @Override
  protected ServiceInterfaceFBTypeDeclaration extractDeclarationBody(@Nullable Identifier identifier) {
    ServiceInterfaceFBTypeDeclaration std = myFactory.createServiceInterfaceFBTypeDeclaration(identifier);
    new FBInterfaceConverter(this, std).extractInterface();
    return std;
  }
}
