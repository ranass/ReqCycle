/*******************************************************************************
 * Copyright (c) 2013 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Atos - initial API and implementation
 ******************************************************************************/
package org.eclipse.ziggurat.ocl;

/**
 * Simply a holder of the evaluator.
 * @author omelois
 */
public interface OCLEvaluatorHolder {

	public OCLEvaluator getOCLEvaluator();
	
	public OCLEvaluator createOCLEvaluator();
	
}
