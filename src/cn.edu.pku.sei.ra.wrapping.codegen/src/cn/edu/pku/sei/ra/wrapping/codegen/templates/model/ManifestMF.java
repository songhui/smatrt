package cn.edu.pku.sei.ra.wrapping.codegen.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;

public class ManifestMF
{
  protected static String nl;
  public static synchronized ManifestMF create(String lineSeparator)
  {
    nl = lineSeparator;
    ManifestMF result = new ManifestMF();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "Manifest-Version: 1.0" + NL + "Bundle-ManifestVersion: 2" + NL + "Bundle-Name: %pluginName" + NL + "Bundle-SymbolicName: ";
  protected final String TEXT_2 = ";singleton:=true" + NL + "Bundle-Version: 1.0.0" + NL + "Bundle-ClassPath: ";
  protected final String TEXT_3 = ".jar";
  protected final String TEXT_4 = ".";
  protected final String TEXT_5 = NL + "Bundle-Activator: ";
  protected final String TEXT_6 = "$Implementation";
  protected final String TEXT_7 = NL + "Bundle-Vendor: %providerName" + NL + "Bundle-Localization: plugin";
  protected final String TEXT_8 = NL + "Bundle-RequiredExecutionEnvironment: J2SE-1.5";
  protected final String TEXT_9 = NL + "Bundle-RequiredExecutionEnvironment: JavaSE-1.6";
  protected final String TEXT_10 = NL + "Export-Package: ";
  protected final String TEXT_11 = ",";
  protected final String TEXT_12 = NL + " ";
  protected final String TEXT_13 = NL + "Require-Bundle: ";
  protected final String TEXT_14 = ";visibility:=reexport";
  protected final String TEXT_15 = ",";
  protected final String TEXT_16 = NL + " ";
  protected final String TEXT_17 = ";visibility:=reexport";
  protected final String TEXT_18 = NL + "Eclipse-LazyStart: true";
  protected final String TEXT_19 = NL + "Bundle-ActivationPolicy: lazy";
  protected final String TEXT_20 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2005-2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 */

    GenModel genModel = (GenModel)argument;
    stringBuffer.append(TEXT_1);
    stringBuffer.append(genModel.getModelPluginID());
    stringBuffer.append(TEXT_2);
    if (genModel.isRuntimeJar()) {
    stringBuffer.append(genModel.getModelPluginID());
    stringBuffer.append(TEXT_3);
    }else{
    stringBuffer.append(TEXT_4);
    }
    if (genModel.hasModelPluginClass()) {
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genModel.getQualifiedModelPluginClassName());
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_7);
    if (genModel.getComplianceLevel() == GenJDKLevel.JDK50_LITERAL) {
    stringBuffer.append(TEXT_8);
    } else if (genModel.getComplianceLevel() == GenJDKLevel.JDK60_LITERAL) {
    stringBuffer.append(TEXT_9);
    }
    Iterator<String> packagesIterator = genModel.getModelQualifiedPackageNames().iterator(); if (packagesIterator.hasNext()) { String pack = packagesIterator.next();
    stringBuffer.append(TEXT_10);
    stringBuffer.append(pack);
    while(packagesIterator.hasNext()) { pack = packagesIterator.next();
    stringBuffer.append(TEXT_11);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(pack);
    }
    }
    Iterator<String> requiredPluginIterator = genModel.getModelRequiredPlugins().iterator(); if (requiredPluginIterator.hasNext()) { String pluginID = requiredPluginIterator.next();
    stringBuffer.append(TEXT_13);
    stringBuffer.append(pluginID);
    if (!pluginID.startsWith("org.eclipse.core.runtime")){
    stringBuffer.append(TEXT_14);
    } while(requiredPluginIterator.hasNext()) { pluginID = requiredPluginIterator.next();
    stringBuffer.append(TEXT_15);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(pluginID);
    if (!pluginID.startsWith("org.eclipse.core.runtime")){
    stringBuffer.append(TEXT_17);
    }}
    }
    if (genModel.getRuntimeVersion() == GenRuntimeVersion.EMF22 || genModel.getRuntimeVersion() == GenRuntimeVersion.EMF23) {
    stringBuffer.append(TEXT_18);
    }
    stringBuffer.append(TEXT_19);
    stringBuffer.append(TEXT_20);
    return stringBuffer.toString();
  }
}
