package be.cloudns.edebe.timesync.fabric.util;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public final class TimeUtil {
    public static long getMinecraftTime() {
        ZonedDateTime time = ZonedDateTime.now(ZoneId.of("GMT+2"));
        return (long) ((time.getHour() * 60 * 60L + time.getMinute() * 60L + time.getSecond()) / 3.6);
    }
}