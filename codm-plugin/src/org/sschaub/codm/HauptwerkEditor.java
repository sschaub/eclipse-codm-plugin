/******************************************************************************
 * Copyright (c) 2015 Oracle and Liferay
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Shenxue Zhou - initial implementation and ongoing maintenance
 *    Konstantin Komissarchik - ongoing maintenance
 *    Gregory Amerson - [374022] SapphireGraphicalEditor init with SapphireEditor
 *    Gregory Amerson - [444202] Lazy loading of editor pages
 ******************************************************************************/

package org.sschaub.codm;

import org.eclipse.sapphire.Element;
import org.eclipse.sapphire.modeling.xml.RootXmlResource;
import org.eclipse.sapphire.ui.SapphireEditor;
import org.eclipse.sapphire.ui.swt.xml.editor.XmlEditorResourceStore;
import org.eclipse.ui.PartInitException;
import org.eclipse.wst.sse.ui.StructuredTextEditor;

/**
 * @author <a href="mailto:shenxue.zhou@oracle.com">Shenxue Zhou</a>
 * @author <a href="mailto:konstantin.komissarchik@oracle.com">Konstantin Komissarchik</a>
 * @author <a href="mailto:gregory.amerson@liferay.com">Gregory Amerson</a>
 */

public final class HauptwerkEditor extends SapphireEditor 
{
    private StructuredTextEditor mapSourceEditor;

    @Override
    protected void createEditorPages() throws PartInitException 
    {
        addDeferredPage( "Details", "DetailsPage" );
        
        this.mapSourceEditor = new StructuredTextEditor();
        this.mapSourceEditor.setEditorPart(this);
        
        int index = addPage( this.mapSourceEditor, getEditorInput() );
        setPageText( index, "Source" );
    }
    
    @Override
    protected Element createModel() 
    {
        return Hauptwerk.TYPE.instantiate(new RootXmlResource(new XmlEditorResourceStore(this, this.mapSourceEditor)));
    }
    
}
