package org.sschaub.codm;

import org.eclipse.sapphire.ElementType;
import org.eclipse.sapphire.Type;
import org.eclipse.sapphire.ValueProperty;
import org.eclipse.sapphire.modeling.annotations.*;
import org.eclipse.sapphire.modeling.xml.annotations.*;

public interface Rank extends ObjectItem {
    ElementType TYPE = new ElementType( Rank.class );
    

    // ================  RankID ==============
        
    @Type( base = String.class )
    @Label( standard = "RankID" )
    ValueProperty PROP_RANKID = new ValueProperty( TYPE, "RankID" );       
        

    // ================  Name ==============
        
    @Type( base = String.class )
    @Label( standard = "Name" )
    ValueProperty PROP_NAME = new ValueProperty( TYPE, "Name" );       
        

    // ================  NumberOfPipes ==============
        
    @Type( base = String.class )
    @Label( standard = "NumberOfPipes" )
    ValueProperty PROP_NUMBEROFPIPES = new ValueProperty( TYPE, "NumberOfPipes" );       
        

    // ================  MIDINoteNumberOfFirstPipe ==============
        
    @Type( base = String.class )
    @Label( standard = "MIDINoteNumberOfFirstPipe" )
    ValueProperty PROP_MIDINOTENUMBEROFFIRSTPIPE = new ValueProperty( TYPE, "MIDINoteNumberOfFirstPipe" );       
        

    // ================  IsPercussive ==============
        
    @Type( base = String.class )
    @Label( standard = "IsPercussive" )
    ValueProperty PROP_ISPERCUSSIVE = new ValueProperty( TYPE, "IsPercussive" );       
        

    // ================  Samples_InstallationPackageID ==============
        
    @Type( base = String.class )
    @Label( standard = "Samples_InstallationPackageID" )
    ValueProperty PROP_SAMPLES_INSTALLATIONPACKAGEID = new ValueProperty( TYPE, "Samples_InstallationPackageID" );       
        

    // ================  Samples_MainSampleFileFolder ==============
        
    @Type( base = String.class )
    @Label( standard = "Samples_MainSampleFileFolder" )
    ValueProperty PROP_SAMPLES_MAINSAMPLEFILEFOLDER = new ValueProperty( TYPE, "Samples_MainSampleFileFolder" );       
        

    // ================  Samples_ShortNoteReleaseSampleFileFolderIfAny ==============
        
    @Type( base = String.class )
    @Label( standard = "Samples_ShortNoteReleaseSampleFileFolderIfAny" )
    ValueProperty PROP_SAMPLES_SHORTNOTERELEASESAMPLEFILEFOLDERIFANY = new ValueProperty( TYPE, "Samples_ShortNoteReleaseSampleFileFolderIfAny" );       
        

    // ================  Samples_MaxNoteTimeMsForShortNoteReleaseSamplesIfAny ==============
        
    @Type( base = String.class )
    @Label( standard = "Samples_MaxNoteTimeMsForShortNoteReleaseSamplesIfAny" )
    ValueProperty PROP_SAMPLES_MAXNOTETIMEMSFORSHORTNOTERELEASESAMPLESIFANY = new ValueProperty( TYPE, "Samples_MaxNoteTimeMsForShortNoteReleaseSamplesIfAny" );       
        

    // ================  Samples_MediumNoteReleaseSampleFileFolderIfAny ==============
        
    @Type( base = String.class )
    @Label( standard = "Samples_MediumNoteReleaseSampleFileFolderIfAny" )
    ValueProperty PROP_SAMPLES_MEDIUMNOTERELEASESAMPLEFILEFOLDERIFANY = new ValueProperty( TYPE, "Samples_MediumNoteReleaseSampleFileFolderIfAny" );       
        

    // ================  Samples_MaxNoteTimeMsForMediumNoteReleaseSamplesIfAny ==============
        
    @Type( base = String.class )
    @Label( standard = "Samples_MaxNoteTimeMsForMediumNoteReleaseSamplesIfAny" )
    ValueProperty PROP_SAMPLES_MAXNOTETIMEMSFORMEDIUMNOTERELEASESAMPLESIFANY = new ValueProperty( TYPE, "Samples_MaxNoteTimeMsForMediumNoteReleaseSamplesIfAny" );       
        

    // ================  Position_LayoutOfPipesOnWindchestCode ==============
        
    @Type( base = String.class )
    @Label( standard = "Position_LayoutOfPipesOnWindchestCode" )
    ValueProperty PROP_POSITION_LAYOUTOFPIPESONWINDCHESTCODE = new ValueProperty( TYPE, "Position_LayoutOfPipesOnWindchestCode" );       
        

    // ================  Position_RankDistanceFromListenerMetres ==============
        
    @Type( base = String.class )
    @Label( standard = "Position_RankDistanceFromListenerMetres" )
    ValueProperty PROP_POSITION_RANKDISTANCEFROMLISTENERMETRES = new ValueProperty( TYPE, "Position_RankDistanceFromListenerMetres" );       
        

    // ================  WindSupply_DivisionCodeOfWindchest ==============
        
    @Type( base = String.class )
    @Label( standard = "WindSupply_DivisionCodeOfWindchest" )
    ValueProperty PROP_WINDSUPPLY_DIVISIONCODEOFWINDCHEST = new ValueProperty( TYPE, "WindSupply_DivisionCodeOfWindchest" );       
        

    // ================  Amp_PipeMIDINoteNum036_LevelAdjustDecibels ==============
        
    @Type( base = String.class )
    @Label( standard = "Amp_PipeMIDINoteNum036_LevelAdjustDecibels" )
    ValueProperty PROP_AMP_PIPEMIDINOTENUM036_LEVELADJUSTDECIBELS = new ValueProperty( TYPE, "Amp_PipeMIDINoteNum036_LevelAdjustDecibels" );       
        

    // ================  Amp_PipeMIDINoteNum096_LevelAdjustDecibels ==============
        
    @Type( base = String.class )
    @Label( standard = "Amp_PipeMIDINoteNum096_LevelAdjustDecibels" )
    ValueProperty PROP_AMP_PIPEMIDINOTENUM096_LEVELADJUSTDECIBELS = new ValueProperty( TYPE, "Amp_PipeMIDINoteNum096_LevelAdjustDecibels" );       
        

    // ================  Pitch_MaxRandomTuningErrorHz ==============
        
    @Type( base = String.class )
    @Label( standard = "Pitch_MaxRandomTuningErrorHz" )
    ValueProperty PROP_PITCH_MAXRANDOMTUNINGERRORHZ = new ValueProperty( TYPE, "Pitch_MaxRandomTuningErrorHz" );       
        

    // ================  Samples_RankBasePitch64ftHarmNumIfAssumedTunedToConcertPitch ==============
        
    @Type( base = String.class )
    @Label( standard = "Samples_RankBasePitch64ftHarmNumIfAssumedTunedToConcertPitch" )
    ValueProperty PROP_SAMPLES_RANKBASEPITCH64FTHARMNUMIFASSUMEDTUNEDTOCONCERTPITCH = new ValueProperty( TYPE, "Samples_RankBasePitch64ftHarmNumIfAssumedTunedToConcertPitch" );       
        

    // ================  Pitch_RankBaseOutputPitch64ftHarmonicNum ==============
        
    @Type( base = String.class )
    @Label( standard = "Pitch_RankBaseOutputPitch64ftHarmonicNum" )
    ValueProperty PROP_PITCH_RANKBASEOUTPUTPITCH64FTHARMONICNUM = new ValueProperty( TYPE, "Pitch_RankBaseOutputPitch64ftHarmonicNum" );       
        

    // ================  Pitch_PipeMIDINoteNum036_TuningAdjustPercentSemitones ==============
        
    @Type( base = String.class )
    @Label( standard = "Pitch_PipeMIDINoteNum036_TuningAdjustPercentSemitones" )
    ValueProperty PROP_PITCH_PIPEMIDINOTENUM036_TUNINGADJUSTPERCENTSEMITONES = new ValueProperty( TYPE, "Pitch_PipeMIDINoteNum036_TuningAdjustPercentSemitones" );       
        

    // ================  Pitch_PipeMIDINoteNum096_TuningAdjustPercentSemitones ==============
        
    @Type( base = String.class )
    @Label( standard = "Pitch_PipeMIDINoteNum096_TuningAdjustPercentSemitones" )
    ValueProperty PROP_PITCH_PIPEMIDINOTENUM096_TUNINGADJUSTPERCENTSEMITONES = new ValueProperty( TYPE, "Pitch_PipeMIDINoteNum096_TuningAdjustPercentSemitones" );       
        

    // ================  Encl_EnclosureCode ==============
        
    @Type( base = String.class )
    @Label( standard = "Encl_EnclosureCode" )
    ValueProperty PROP_ENCL_ENCLOSURECODE = new ValueProperty( TYPE, "Encl_EnclosureCode" );       
        
}
