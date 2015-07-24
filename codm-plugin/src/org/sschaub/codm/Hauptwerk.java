/******************************************************************************
 * Copyright (c) 2015 Oracle and Accenture
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Konstantin Komissarchik - initial implementation
 *    Kamesh Sampath - [355751] General improvement of XML root binding API
 *    Konstantin Komissarchik - miscellaneous improvements    
 ******************************************************************************/

package org.sschaub.codm;

import org.eclipse.sapphire.Element;
import org.eclipse.sapphire.ElementList;
import org.eclipse.sapphire.ElementType;
import org.eclipse.sapphire.ListProperty;
import org.eclipse.sapphire.Type;
import org.eclipse.sapphire.modeling.xml.annotations.XmlBinding;
import org.eclipse.sapphire.modeling.xml.annotations.XmlListBinding;

/**
 * @author <a href="mailto:shenxue.zhou@oracle.com">Shenxue Zhou</a>
 * @author <a href="mailto:kamesh.sampath@accenture.com">Kamesh Sampath</a>
 * @author <a href="mailto:konstantin.komissarchik@oracle.com">Konstantin Komissarchik</a>
 */

@XmlBinding( path = "Hauptwerk")

public interface Hauptwerk extends Element
{
    ElementType TYPE = new ElementType( Hauptwerk.class );
    
    // *** ObjectLists ***

    @Type( base = ObjectList.class )
    @XmlListBinding( mappings = @XmlListBinding.Mapping( element = "ObjectList", type = ObjectList.class ) )
    
    ListProperty PROP_OBJECTLISTS = new ListProperty( TYPE, "ObjectLists" );
    
    ElementList<ObjectList> getObjectLists();
    
    
    
}
