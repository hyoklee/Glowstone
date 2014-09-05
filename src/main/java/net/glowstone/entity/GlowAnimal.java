package net.glowstone.entity;

import org.bukkit.Location;
import org.bukkit.entity.Animals;
import org.bukkit.entity.EntityType;

/**
 * Represents an animal.
 */
public class GlowAnimal extends GlowAgeable implements Animals {

    /**
     * Creates a new ageable animal.
     * @param location The location of the monster.
     * @param type The type of monster.
     */
    public GlowAnimal(Location location, EntityType type) {
        super(location, type);
    }
}
