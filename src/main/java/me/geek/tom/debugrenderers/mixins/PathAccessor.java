package me.geek.tom.debugrenderers.mixins;

import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathPoint;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(Path.class)
public interface PathAccessor {
    @Accessor
    List<PathPoint> getPoints();
}
