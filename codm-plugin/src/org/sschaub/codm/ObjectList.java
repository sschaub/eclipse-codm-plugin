
package org.sschaub.codm;

import org.eclipse.sapphire.Element;
import org.eclipse.sapphire.ElementList;
import org.eclipse.sapphire.ElementType;
import org.eclipse.sapphire.ListProperty;
import org.eclipse.sapphire.Type;
import org.eclipse.sapphire.Value;
import org.eclipse.sapphire.ValueProperty;
import org.eclipse.sapphire.modeling.annotations.Label;
import org.eclipse.sapphire.modeling.annotations.Required;
import org.eclipse.sapphire.modeling.xml.annotations.XmlBinding;
import org.eclipse.sapphire.modeling.xml.annotations.XmlListBinding;


public interface ObjectList extends Element 
{
    ElementType TYPE = new ElementType( ObjectList.class );
    
    // *** Name ***
    
    @Label( standard = "ObjectType" )
    @Required
    @XmlBinding( path = "@ObjectType" )

    ValueProperty PROP_OBJECTTYPE = new ValueProperty( TYPE, "ObjectType" );
    
    Value<String> getObjectType();
    void setObjectType( String name );
    
    // *** ObjectItems ***
    
    @Type( base = ObjectItem.class, possible = { General.class, Rank.class, Stop.class, StopRank.class } )
    
    @XmlListBinding
    (
        mappings = 
        {
            @XmlListBinding.Mapping( element = "_general", type = General.class ),
            @XmlListBinding.Mapping( element = "rank", type = Rank.class ),
            @XmlListBinding.Mapping( element = "stop", type = Stop.class ),
            @XmlListBinding.Mapping( element = "stoprank", type = StopRank.class ),
        }
    )
    
    ListProperty PROP_OBJECTITEMS = new ListProperty( TYPE, "ObjectItems" );
    
    ElementList<ObjectItem> getObjectItems();
}
