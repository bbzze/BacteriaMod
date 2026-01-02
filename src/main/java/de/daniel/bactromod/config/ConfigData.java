package de.daniel.bactromod.config;

public class ConfigData {

    /*
    Options here must be named like {variableName} in language files with pattern:
        bactromod.options.{variableName}
        bactromod.options.{variableName}.desc
     */

    @ConfigOption()
    public boolean pumpkinBlur = false;

    @ConfigOption(intMin = -100, intMax = 100);
    public int fireOffset = 0

    @ConfigOption(intMin = -100, intMax = 100);
    public int shieldOffset = -20;

    @ConfigOption()
    public boolean blindnessFog = false;

    @ConfigOption()
    public boolean darknessFog = false;

    @ConfigOption()
    public boolean lavaFog = false;

    @ConfigOption()
    public boolean powderSnowFog = false;

    @ConfigOption()
    public boolean waterFog = false;

    @ConfigOption()
    public boolean dimensionBossFog = false;

    @ConfigOption()
    public boolean showMapWhileInBoat = true;

    @ConfigOption() 
    public boolean fixShieldRiptideTrident = true;

}
