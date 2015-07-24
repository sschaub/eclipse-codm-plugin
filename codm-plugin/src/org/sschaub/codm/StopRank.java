package org.sschaub.codm;

import org.eclipse.sapphire.ElementType;
import org.eclipse.sapphire.Type;
import org.eclipse.sapphire.ValueProperty;
import org.eclipse.sapphire.modeling.annotations.*;

public interface StopRank extends ObjectItem {
    ElementType TYPE = new ElementType( StopRank.class );
    

    // ================  Name ==============
        
    @Type( base = String.class )
    @Label( standard = "Name" )
    ValueProperty PROP_NAME = new ValueProperty( TYPE, "Name" );       
        

    // ================  StopCode ==============
        
    @Type( base = String.class )
    @Label( standard = "StopCode" )
    ValueProperty PROP_STOPCODE = new ValueProperty( TYPE, "StopCode" );       
        

    // ================  RankTypeCode ==============
        
    @Type( base = String.class )
    @Label( standard = "RankTypeCode" )
    ValueProperty PROP_RANKTYPECODE = new ValueProperty( TYPE, "RankTypeCode" );       
        

    // ================  RankID ==============
        
    @Type( base = String.class )
    @Label( standard = "RankID" )
    ValueProperty PROP_RANKID = new ValueProperty( TYPE, "RankID" );       
        

    // ================  MIDINoteNumIncrementFromDivisionToRank ==============
        
    @Type( base = String.class )
    @Label( standard = "MIDINoteNumIncrementFromDivisionToRank" )
    ValueProperty PROP_MIDINOTENUMINCREMENTFROMDIVISIONTORANK = new ValueProperty( TYPE, "MIDINoteNumIncrementFromDivisionToRank" );       
        

    // ================  MIDINoteNumOfFirstMappedDivisionKey ==============
        
    @Type( base = String.class )
    @Label( standard = "MIDINoteNumOfFirstMappedDivisionKey" )
    ValueProperty PROP_MIDINOTENUMOFFIRSTMAPPEDDIVISIONKEY = new ValueProperty( TYPE, "MIDINoteNumOfFirstMappedDivisionKey" );       
        

    // ================  NumberOfMappedDivisionKeys ==============
        
    @Type( base = String.class )
    @Label( standard = "NumberOfMappedDivisionKeys" )
    ValueProperty PROP_NUMBEROFMAPPEDDIVISIONKEYS = new ValueProperty( TYPE, "NumberOfMappedDivisionKeys" );       
        

    // ================  StopCodeToSwitchToAlternateRank ==============
        
    @Type( base = String.class )
    @Label( standard = "StopCodeToSwitchToAlternateRank" )
    ValueProperty PROP_STOPCODETOSWITCHTOALTERNATERANK = new ValueProperty( TYPE, "StopCodeToSwitchToAlternateRank" );       
        

    // ================  AlternateRankID ==============
        
    @Type( base = String.class )
    @Label( standard = "AlternateRankID" )
    ValueProperty PROP_ALTERNATERANKID = new ValueProperty( TYPE, "AlternateRankID" );       
        

    // ================  RetriggerNotesWhenSwitchingBetweenNormalAndAlternateRanks ==============
        
    @Type( base = String.class )
    @Label( standard = "RetriggerNotesWhenSwitchingBetweenNormalAndAlternateRanks" )
    ValueProperty PROP_RETRIGGERNOTESWHENSWITCHINGBETWEENNORMALANDALTERNATERANKS = new ValueProperty( TYPE, "RetriggerNotesWhenSwitchingBetweenNormalAndAlternateRanks" );       
        
}
