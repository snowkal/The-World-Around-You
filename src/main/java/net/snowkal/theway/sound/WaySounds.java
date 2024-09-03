package net.snowkal.theway.sound;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.snowkal.theway.TheWorldAroundYou;

public class WaySounds {
    public static RegistryKey<JukeboxSong> OCHRE_SONG = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TheWorldAroundYou.MOD_ID, "ochre"));
    public static final SoundEvent OCHRE = registerSoundEvent("ochre");
    public static final SoundEvent TULIPS = registerSoundEvent("tulips");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(TheWorldAroundYou.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {}
}
