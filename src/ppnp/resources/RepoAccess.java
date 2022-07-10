package ppnp.resources;

import java.util.UUID;

public class RepoAccess {

    public final GitRepository repo;

    public final role access;

    public final String publicKey;

    public RepoAccess (GitRepository repo, role access, String publicKey) {

        this.repo = repo;
        this.access = access;



        String publicKey_working;
        try {
            publicKey_working = UUID.fromString(publicKey).toString();
        } catch (IllegalArgumentException e) {
            publicKey_working = UUID.randomUUID().toString();
        }
        this.publicKey = publicKey_working;
    }

}
