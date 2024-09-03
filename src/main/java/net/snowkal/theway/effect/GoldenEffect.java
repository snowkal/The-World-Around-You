package net.snowkal.theway.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.snowkal.theway.TheWorldAroundYou;

public class GoldenEffect extends StatusEffect {
    protected GoldenEffect(StatusEffectCategory category, int color, ParticleEffect particleEffect) {
        super(category, color, particleEffect);
    }

    public static final RegistryEntry<StatusEffect> GOLDEN = register(
            "golden", new GoldenEffect(StatusEffectCategory.BENEFICIAL, 4521796, ParticleTypes.HEART)
    );

    private static RegistryEntry<StatusEffect> register(String id, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(TheWorldAroundYou.MOD_ID, "golden"), statusEffect);
    }
}
