package de.eztxm.ezlib.config.object;

import de.eztxm.ezlib.config.GsonConfig;

import java.util.Collections;
import java.util.List;

public class ObjectConverter {
    private final GsonConfig gsonConfig;
    private final Object object;

    public ObjectConverter(GsonConfig gsonConfig, Object object) {
        this.gsonConfig = gsonConfig;
        this.object = object;
    }

    public ObjectConverter(Object object) {
        this.gsonConfig = null;
        this.object = object;
    }

    public Object asObject() {
        try {
            return object;
        } catch (Exception e) {
            return null;
        }
    }

    public String asString() {
        try {
            return object.toString();
        } catch (Exception e) {
            return null;
        }
    }

    public boolean asBoolean() {
        try {
            return (boolean) object;
        } catch (Exception e) {
            return false;
        }
    }

    public int asInteger() {
        try {
            return (int) object;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public double asDouble() {
        try {
            return (double) object;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public float asFloat() {
        try {
            return (float) object;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public List<Object> asList() {
        try {
            return Collections.singletonList(object);
        } catch (Exception e) {
            return null;
        }
    }

    public JsonObject asJsonObject() {
        try {
            return new JsonObject(object);
        } catch (Exception e) {
            return null;
        }
    }

    public JsonArray asJsonArray() {
        try {
            return new JsonArray(object);
        } catch (Exception e) {
            return null;
        }
    }
}
