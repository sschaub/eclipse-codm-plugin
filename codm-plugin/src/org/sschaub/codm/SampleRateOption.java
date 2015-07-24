
package org.sschaub.codm;

import org.eclipse.sapphire.modeling.annotations.EnumSerialization;
import org.eclipse.sapphire.modeling.annotations.Label;

public enum SampleRateOption
{
    @Label( standard = "22050" )
    @EnumSerialization( primary = "1" )
    CHOICE1,
    
    @Label( standard = "44100" )
    @EnumSerialization( primary = "2" )
    CHOICE2,
    
    @Label( standard = "48000" )
    @EnumSerialization( primary = "3" )
    CHOICE3,

    @Label( standard = "96000" )
    @EnumSerialization( primary = "4" )
    CHOICE4

}
