package com.aztech.ez_stock_ticker;

import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class ClientConfig {
    //Define a field to keep the config and spec for later
    public static final ClientConfig CONFIG;
    public static final ModConfigSpec CONFIG_SPEC;

    //CONFIG and CONFIG_SPEC are both built from the same builder, so we use a static block to separate the properties
    static {
        Pair<ClientConfig, ModConfigSpec> pair =
            new ModConfigSpec.Builder().configure(ClientConfig::new);

        //Store the resulting values
        CONFIG = pair.getLeft();
        CONFIG_SPEC = pair.getRight();
    }

    //Store the config properties as public finals
    public final ModConfigSpec.ConfigValue<Boolean> isEzStockTickerEnabled;

    private ClientConfig(ModConfigSpec.Builder builder) {
        //Define each property
        //One property could be a message to log to the console when the game is initialised
        isEzStockTickerEnabled = builder.define("ez_stock_ticker_enabled", true);
    }

}
