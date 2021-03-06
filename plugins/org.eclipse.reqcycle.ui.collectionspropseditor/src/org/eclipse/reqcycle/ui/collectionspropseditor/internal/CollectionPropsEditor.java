/*****************************************************************************
 * Copyright (c) 2013 AtoS.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Papa Issa DIAKHATE (AtoS) papa-issa.diakhate@atos.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.reqcycle.ui.collectionspropseditor.internal;

import java.util.Collection;

import org.eclipse.reqcycle.ui.collectionspropseditor.internal.components.CollectionsPropsEditorComponent;
import org.eclipse.reqcycle.ui.eattrpropseditor.api.AbstractPropsEditor;
import org.eclipse.reqcycle.ui.eattrpropseditor.api.AbstractPropsEditorComponent;

public class CollectionPropsEditor extends AbstractPropsEditor<Collection<Object>> {

	@Override
	protected AbstractPropsEditorComponent<Collection<Object>> initAndGetComponent() {
		return new CollectionsPropsEditorComponent(getEAttribute(), getContainer(), getStyle());
	}

}
