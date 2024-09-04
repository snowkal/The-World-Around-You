package net.snowkal.theway;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.render.RenderLayer;
import net.snowkal.theway.block.ModBlocks;
import net.snowkal.theway.particle.GoldenParticle;

public class TheWorldAroundYouClient implements ClientModInitializer {
    //chat i have no idea how to use this
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MARIGOLD_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MARIGOLD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_MARIGOLD, RenderLayer.getCutout());

        ParticleFactoryRegistry.getInstance().register(GoldenParticle.GOLDEN_PARTICLE, GoldenParticle.Factory::new);
    }
}
