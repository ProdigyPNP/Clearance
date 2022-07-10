package ppnp;

import ppnp.resources.RepoAccess;

import java.util.ArrayList;
import java.util.UUID;

public class Clearance {

    public final String name;

    public final String description;

    public final String id;

    public final ArrayList<RepoAccess> access;

    public Clearance (String name, String description, String id, ArrayList<RepoAccess> access) {


        this.name = name;

        this.description = description;

        String id_working;
        try {
            UUID.fromString(id);
        } catch (IllegalArgumentException e) {
            id_working = UUID.randomUUID().toString();
        } finally {
            id_working = id;
        }
        this.id = id_working;

        this.access = access;
    }
}
