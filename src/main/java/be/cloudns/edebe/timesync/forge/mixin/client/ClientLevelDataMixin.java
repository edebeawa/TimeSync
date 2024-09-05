package be.cloudns.edebe.timesync.forge.mixin.client;

import be.cloudns.edebe.timesync.forge.util.TimeUtil;
import net.minecraft.client.multiplayer.ClientLevel.ClientLevelData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientLevelData.class)
public class ClientLevelDataMixin {
    @Inject(method = "getDayTime", at = @At("HEAD"), cancellable = true)
    private void injected(CallbackInfoReturnable<Long> returnable) {
        returnable.setReturnValue(TimeUtil.getMinecraftTime());
    }
}