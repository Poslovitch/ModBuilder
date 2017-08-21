package fr.poslovitch.modbuilder.versioning;

import net.minecraftforge.common.ForgeVersion;

import java.lang.reflect.InvocationTargetException;

public class VersionManager {

    private static VersionAbstraction versionAbstraction;

    public static VersionAbstraction getHandler() {
        try {
            if (versionAbstraction != null) return versionAbstraction;

            String mcVersion = ForgeVersion.mcVersion;
            System.err.println(mcVersion);

            Class<?> clazz;
            try {
                System.err.println("fr.poslovitch.modbuilder.versioning.v" + mcVersion.replace(".", "_") + ".VersionHandler");
                clazz = Class.forName("fr.poslovitch.modbuilder.versioning.v" + mcVersion.replace(".", "_") + ".VersionHandler");
            } catch (Exception e) {
                System.err.println("no version found");
                clazz = Class.forName("fr.poslovitch.modbuilder.versioning.fallback.VersionHandler");
            }

            if (VersionAbstraction.class.isAssignableFrom(clazz)) {
                versionAbstraction = (VersionAbstraction) clazz.getConstructor().newInstance();
            }

            return versionAbstraction;
        } catch(Exception e) {
            return null;
        }
    }
}
