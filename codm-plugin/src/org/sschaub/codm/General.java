package org.sschaub.codm;

import org.eclipse.sapphire.ElementType;
import org.eclipse.sapphire.Type;
import org.eclipse.sapphire.Value;
import org.eclipse.sapphire.ValueProperty;
import org.eclipse.sapphire.modeling.annotations.*;
import org.eclipse.sapphire.modeling.xml.annotations.XmlBinding;

public interface General extends ObjectItem {
    ElementType TYPE = new ElementType( General.class );
    
//    // *** Name ***
//    
//    @XmlBinding( path = "Name" )
    @Label( standard = "Name" )
    @Required
    @Documentation( content="Some help for a name!" )
    ValueProperty PROP_NAME = new ValueProperty( TYPE, "Name" );

    Value<String> getName();
    void setName( String name );

    // ================  ShortName ==============
    
    @Label( standard = "ShortName" )
    ValueProperty PROP_SHORTNAME = new ValueProperty( TYPE, "ShortName" );       
        

    @Label( standard = "Organ ID")
    ValueProperty PROP_UNIQUE_ORGAN_ID = new ValueProperty( TYPE, "UniqueOrganID" );
    
    @Label( standard = "Organ Filename")
    ValueProperty PROP_ORGAN_DEFINITION_FILENAME_EXCLUDING_EXTENSION = new ValueProperty( TYPE, "OrganDefinitionFilenameExcludingExtension" );
        
    @Type( base = SampleRateOption.class )
    @Label( standard = "Sample Rate")
    ValueProperty PROP_SampleRateCode = new ValueProperty( TYPE, "SampleRateCode" );
    
    // ================  CurrentHauptwerkVersion ==============
        
    @Label( standard = "Current Hauptwerk Version" )
    ValueProperty PROP_CURRENTHAUPTWERKVERSION = new ValueProperty( TYPE, "CurrentHauptwerkVersion" );       
        


    // ================  VisualAppearanceCode ==============
        
    @Type( base = String.class )
    @Label( standard = "Visual Appearance Code" )
    ValueProperty PROP_VISUALAPPEARANCECODE = new ValueProperty( TYPE, "VisualAppearanceCode" );       
        

    // ================  CustomDisplay_ConsoleWidthPixels ==============
        
    @Type( base = String.class )
    @XmlBinding( path = "CustomDisplay_ConsoleWidthPixels" )
    @Label( standard = "Console Width (Pixels)" )
    ValueProperty PROP_CUSTOMDISPLAY_CONSOLEWIDTHPIXELS = new ValueProperty( TYPE, "CustomDisplayConsoleWidthPixels" );       
        

    // ================  CustomDisplay_ConsoleHeightPixels ==============
        
    @Type( base = String.class )
    @XmlBinding( path = "CustomDisplay_ConsoleHeightPixels" )
    @Label( standard = "Console Height (Pixels)" )
    ValueProperty PROP_CUSTOMDISPLAY_CONSOLEHEIGHTPIXELS = new ValueProperty( TYPE, "CustomDisplayConsoleHeightPixels" );       
        

    // ================  CustomDisplay_DefaultDisplayPageID ==============
        
    @Type( base = String.class )
    @XmlBinding( path = "CustomDisplay_DefaultDisplayPageID")
    @Label( standard = "Default Display Page ID" )
    ValueProperty PROP_CUSTOMDISPLAY_DEFAULTDISPLAYPAGEID = new ValueProperty( TYPE, "CustomDisplayDefaultDisplayPageID" );       
        

    // ================  CustomDisplay_EnableStdPages_Controls ==============
        
    @Type( base = YesNoChoice.class )
    @XmlBinding( path = "CustomDisplay_EnableStdPages_Controls")
    @Label( standard = "Enable Std Pages: Controls")
    ValueProperty PROP_CUSTOMDISPLAY_ENABLESTDPAGES_CONTROLS = new ValueProperty( TYPE, "CustomDisplayEnableStdPagesControls" );       
        

    // ================  CustomDisplay_EnableStdPages_Keyboards ==============
        
    @Type( base = YesNoChoice.class )
    @XmlBinding( path = "CustomDisplay_EnableStdPages_Keyboards")
    @Label( standard = "Enable Std Pages: Keyboards" )
    ValueProperty PROP_CUSTOMDISPLAY_ENABLESTDPAGES_KEYBOARDS = new ValueProperty( TYPE, "CustomDisplayEnableStdPagesKeyboards" );       
        

    // ================  CustomDisplay_EnableStdPages_Enclosures ==============
        
    @Type( base = YesNoChoice.class )
    @XmlBinding( path = "EnableStdPages_Enclosures")
    @Label( standard = "Enable Std Pages: Enclosures" )
    ValueProperty PROP_CUSTOMDISPLAY_ENABLESTDPAGES_ENCLOSURES = new ValueProperty( TYPE, "CustomDisplayEnableStdPagesEnclosures" );       
        
}
