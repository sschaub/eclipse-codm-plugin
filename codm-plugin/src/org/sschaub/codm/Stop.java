package org.sschaub.codm;

import org.eclipse.sapphire.ElementType;
import org.eclipse.sapphire.Type;
import org.eclipse.sapphire.ValueProperty;
import org.eclipse.sapphire.modeling.annotations.*;

public interface Stop extends ObjectItem {
    ElementType TYPE = new ElementType( Stop.class );
    

    // ================  StopCode ==============
        
    @Type( base = String.class )
    @Label( standard = "StopCode" )
    ValueProperty PROP_STOPCODE = new ValueProperty( TYPE, "StopCode" );       
        

    // ================  Name ==============
        
    @Type( base = String.class )
    @Label( standard = "Name" )
    ValueProperty PROP_NAME = new ValueProperty( TYPE, "Name" );       
        

    // ================  DisplayName ==============
        
    @Type( base = String.class )
    @Label( standard = "DisplayName" )
    ValueProperty PROP_DISPLAYNAME = new ValueProperty( TYPE, "DisplayName" );       
        

    // ================  CustomDisplay1_DisplayPageID ==============
        
    @Type( base = String.class )
    @Label( standard = "CustomDisplay1_DisplayPageID" )
    ValueProperty PROP_CUSTOMDISPLAY1_DISPLAYPAGEID = new ValueProperty( TYPE, "CustomDisplay1_DisplayPageID" );       
        

    // ================  CustomDisplay1_Text ==============
        
    @Type( base = String.class )
    @Label( standard = "CustomDisplay1_Text" )
    ValueProperty PROP_CUSTOMDISPLAY1_TEXT = new ValueProperty( TYPE, "CustomDisplay1_Text" );       
        

    // ================  CustomDisplay1_ControlStyleID ==============
        
    @Type( base = String.class )
    @Label( standard = "CustomDisplay1_ControlStyleID" )
    ValueProperty PROP_CUSTOMDISPLAY1_CONTROLSTYLEID = new ValueProperty( TYPE, "CustomDisplay1_ControlStyleID" );       
        

    // ================  CustomDisplay1_PosPixels_X ==============
        
    @Type( base = String.class )
    @Label( standard = "CustomDisplay1_PosPixels_X" )
    ValueProperty PROP_CUSTOMDISPLAY1_POSPIXELS_X = new ValueProperty( TYPE, "CustomDisplay1_PosPixels_X" );       
        

    // ================  CustomDisplay1_PosPixels_Y ==============
        
    @Type( base = String.class )
    @Label( standard = "CustomDisplay1_PosPixels_Y" )
    ValueProperty PROP_CUSTOMDISPLAY1_POSPIXELS_Y = new ValueProperty( TYPE, "CustomDisplay1_PosPixels_Y" );       
        

    // ================  PercussiveEngagingSoundEffect_RankID ==============
        
    @Type( base = String.class )
    @Label( standard = "PercussiveEngagingSoundEffect_RankID" )
    ValueProperty PROP_PERCUSSIVEENGAGINGSOUNDEFFECT_RANKID = new ValueProperty( TYPE, "PercussiveEngagingSoundEffect_RankID" );       
        

    // ================  PercussiveEngagingSoundEffect_MIDINoteNumber ==============
        
    @Type( base = String.class )
    @Label( standard = "PercussiveEngagingSoundEffect_MIDINoteNumber" )
    ValueProperty PROP_PERCUSSIVEENGAGINGSOUNDEFFECT_MIDINOTENUMBER = new ValueProperty( TYPE, "PercussiveEngagingSoundEffect_MIDINoteNumber" );       
        

    // ================  PercussiveDisengagingSoundEffect_RankID ==============
        
    @Type( base = String.class )
    @Label( standard = "PercussiveDisengagingSoundEffect_RankID" )
    ValueProperty PROP_PERCUSSIVEDISENGAGINGSOUNDEFFECT_RANKID = new ValueProperty( TYPE, "PercussiveDisengagingSoundEffect_RankID" );       
        

    // ================  PercussiveDisengagingSoundEffect_MIDINoteNumber ==============
        
    @Type( base = String.class )
    @Label( standard = "PercussiveDisengagingSoundEffect_MIDINoteNumber" )
    ValueProperty PROP_PERCUSSIVEDISENGAGINGSOUNDEFFECT_MIDINOTENUMBER = new ValueProperty( TYPE, "PercussiveDisengagingSoundEffect_MIDINoteNumber" );       

    
}
