package net.snowkal.theway.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.snowkal.theway.TheWorldAroundYou;

public class GoldenParticle extends SpriteBillboardParticle {

    public static final SimpleParticleType GOLDEN_PARTICLE = FabricParticleTypes.simple();
    protected final SpriteProvider spriteProvider;

    protected GoldenParticle(ClientWorld clientWorld, double d, double e, double f, double g, double h, double i, SpriteProvider spriteProvider) {
        super(clientWorld, d, e, f, g, h, i);
        this.spriteProvider = spriteProvider;
        this.scale = this.scale * (this.random.nextFloat() * 0.5F + 0.5F);
        this.velocityX *= -0.01F;
        this.velocityY *= -0.01F;
        this.velocityZ *= -0.01F;
        this.maxAge = (int)(40.0);
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_LIT;
    }

    public static void registerGoldenParticle() {
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(TheWorldAroundYou.MOD_ID, "golden_particle"), GOLDEN_PARTICLE);
    }


    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<SimpleParticleType> {
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(SimpleParticleType simpleParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
            GoldenParticle goldenParticle = new GoldenParticle(clientWorld, d, e, f, g, h, i, spriteProvider);
            goldenParticle.setSprite(this.spriteProvider);
            goldenParticle.setColor(1.0F, 1.0F, 1.0F);
            return goldenParticle;
        }
    }
    @Override
    public void tick() {
        super.tick();
        this.setSpriteForAge(this.spriteProvider);
    }
}
